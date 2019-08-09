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

package com.nicholasdoglio.notes.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nicholasdoglio.notes.ui.about.AboutViewModel
import com.nicholasdoglio.notes.ui.list.NoteListViewModel
import com.nicholasdoglio.notes.ui.note.NoteViewModel
import com.nicholasdoglio.notes.util.AppDispatchers
import com.nicholasdoglio.notes.util.NotesDispatchers
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface BindingModule {

    @Binds
    fun bindDispatchers(dispatchers: NotesDispatchers): AppDispatchers

    @Binds
    fun bindViewModelFactory(factory: NotesViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NoteViewModel::class)
    fun bindNoteViewModel(noteViewModel: NoteViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NoteListViewModel::class)
    fun bindNoteListViewModel(noreListViewModel: NoteListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AboutViewModel::class)
    fun bindAboutViewModel(noreListViewModel: AboutViewModel): ViewModel
}