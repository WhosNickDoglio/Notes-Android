object Libs {

    object Square {
        const val sqlDelightAndroidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val sqlDelightRxExt = "com.squareup.sqldelight:rxjava2-extensions:${Versions.sqlDelight}"
        const val sqlDelightJvm = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
        const val leakCanary: String = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
    }

    object Rx {
        const val binding: String = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxBinding}"

        const val bindingRecyclerView: String =
            "com.jakewharton.rxbinding3:rxbinding-recyclerview:${Versions.rxBinding}"

        const val dogTag: String = "com.uber.rxdogtag:rxdogtag:${Versions.dogTag}"

        const val dogTagAutoDispose: String =
            "com.uber.rxdogtag:rxdogtag-autodispose:${Versions.dogTag}"

        const val autoDispose: String =
            "com.uber.autodispose:autodispose-android-archcomponents:${Versions.autoDispose}"

        const val android: String = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"

        const val kotlin: String = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"

        const val java: String = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"

        const val preferences: String = "com.f2prateek.rx.preferences2:rx-preferences:${Versions.rx_preferences}"

        const val relay: String = "com.jakewharton.rxrelay2:rxrelay:${Versions.relay}"
    }

    object Dagger {

        const val dagger: String = "com.google.dagger:dagger:${Versions.dagger}"

        const val daggerCompiler: String = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    }

    object Kotlin {

        const val Stdlib: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object Android {

        const val coordinatorLayout: String = "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinator}"

        const val navigationFragmentKtx: String =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

        const val navigationUiKtx: String =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

        const val fragmentKtx: String = "androidx.fragment:fragment-ktx:${Versions.fragment}"

        const val fragmentTesting: String =
            "androidx.fragment:fragment-testing:${Versions.fragment}"

        const val material: String = "com.google.android.material:material:${Versions.material}"

        const val constraintLayout: String =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

        const val recyclerview: String =
            "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

        const val appcompat: String = "androidx.appcompat:appcompat:${Versions.appcompat}"

        const val preferences: String = "androidx.preference:preference-ktx:${Versions.preferences}"
    }

    object Test {

        const val junit: String = "junit:junit:${Versions.junit}"

        const val androidxTestCore: String = "androidx.test:core:${Versions.androidTest}"

        const val androidxTestRules: String = "androidx.test:rules:${Versions.androidTest}"

        const val androidxTestRunner: String = "androidx.test:runner:${Versions.androidTest}"

        const val androidxTestExtJunit: String =
            "androidx.test.ext:junit:${Versions.junitTextExtensions}"

        const val androidxTestExtTruth: String =
            "androidx.test.ext:truth:${Versions.truthTestExtensions}"

        const val truth: String = "com.google.truth:truth:${Versions.truth}"

        const val espressoCore: String =
            "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

        const val coreTesting: String = "androidx.arch.core:core-testing:${Versions.coreTesting}"

        const val mockk: String = "io.mockk:mockk:${Versions.mockk}"

        const val threeten: String = "org.threeten:threetenbp:${Versions.threeten}"

        const val threeTenGroup: String = "com.jakewharton.threetenabp"

        const val threeTenModule: String = "threetenabp"
    }

    const val threetenabp: String =
        "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"

    const val timber: String = "com.jakewharton.timber:timber:${Versions.timber}"
}
