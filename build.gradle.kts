// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.2.1" apply false
    id ("com.android.library") version "7.2.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.7.10"
    id ("com.google.dagger.hilt.android") version "2.43" apply false
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
