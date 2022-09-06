object Dependencies {

    object Plugins{
        const val andApp = "com.android.application"
        const val kotAnr = "org.jetbrains.kotlin.android"
        const val dI = "com.google.dagger.hilt.android"
        const val kotKapt =  "kotlin-kapt"
    }

    object UI{
        const val androidCore = "androidx.core:core-ktx:1.7.0"
        const val appCompat = "androidx.appcompat:appcompat:1.5.0"
        const val androidMaterial = "com.google.android.material:material:1.6.1"
        const val constrainLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val jUnit  = "junit:junit:4.13.2"
        const val extJUnit = "androidx.test.ext:junit:1.1.3"
        const val espresso ="androidx.test.espresso:espresso-core:3.4.0"
    }
    object Android{
        const val applicationId = "com.example.rickandmorty"
        const val versionName = "1.0"
        const val testInstrRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val proguardAndOpt = "proguard-android-optimize.txt"
        const val proguardRulPro = "proguard-rules.pro"
        const val jvm = "1.8"
    }

    object LifeData{
        private const val lifecycle_version = "2.6.0-alpha01"
        const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        const val lifecycleLD = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
    }
    object Navigate{
        private const val nav_version = "2.5.1"
        const val navigationFrg = ("androidx.navigation:navigation-fragment-ktx:$nav_version")
        const val navigationUI = ("androidx.navigation:navigation-ui-ktx:$nav_version")
    }
    object Room{
        private const val room_version = "2.4.3"
        const val roomRunTime = "androidx.room:room-runtime:$room_version"
        const val roomCompiler = "androidx.room:room-compiler:$room_version"
        const val roomKaptCompiler = ("androidx.room:room-compiler:$room_version")
        const val roomKtx = ("androidx.room:room-ktx:$room_version")
    }
    object Coroutines{
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1"
    }
    object DaggerHilt{
        const val daggerHilt = "com.google.dagger:hilt-android:2.43"
        const val daggerKaptHilt = "com.google.dagger:hilt-compiler:2.43"
    }

    object Retrofit{
        const val retrofit = "com.squareup.retrofit2:retrofit:2.5.0"
        const val retrofitGson= "com.squareup.retrofit2:converter-gson:2.5.0"
    }
    object Picasso{
       const val picasso = "com.squareup.picasso:picasso:2.1.2"
    }
}