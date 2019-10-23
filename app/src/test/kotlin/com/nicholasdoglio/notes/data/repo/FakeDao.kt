/*
 * MIT License
 *
 * Copyright (c) 2019 Nicholas Doglio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.nicholasdoglio.notes.data.repo

import com.nicholasdoglio.notes.data.local.NoteDao
import com.nicholasdoglio.notes.data.model.Note
import io.reactivex.BackpressureStrategy
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single
import io.reactivex.subjects.BehaviorSubject

class FakeDao : NoteDao {

    private val notes: MutableMap<Long, Note?> = mutableMapOf()
    private val _notes: BehaviorSubject<List<Note>> =
        BehaviorSubject.createDefault(notes.map { it.value }.filterNotNull())
    private val _count: BehaviorSubject<Int> = BehaviorSubject.createDefault(0)

    override val observeNotes: Flowable<List<Note>> =
        _notes.hide().map { it.toList() }.toFlowable(BackpressureStrategy.LATEST)
    override val observeNumOfNotes: Flowable<Int> =
        _count.hide().toFlowable(BackpressureStrategy.LATEST)

    override fun findNoteById(id: Long): Maybe<Note> =
        if (notes[id] == null) Maybe.never() else Maybe.just(notes[id])

    override fun insertNote(note: Note): Single<Long> {
        if (notes[note.id] == null) {
            notes[note.id] = note
            _count.onNext(notes.size)
            _notes.onNext(notes.map { it.value }.filterNotNull())
            return Single.just(0)
        } else {
            return Single.just(-1L)
        }
    }

    override fun updateNote(note: Note): Completable =
        Completable.fromAction { notes[note.id] = note }

    override fun deleteNote(note: Note): Completable = Completable.fromAction {
        notes.remove(note.id)
        _count.onNext(notes.size)
        _notes.onNext(notes.map { it.value }.filterNotNull())
    }
}
