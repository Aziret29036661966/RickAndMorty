import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id (Dependencies.Plugins.andApp)
    id (Dependencies.Plugins.kotAnr)
    id (Dependencies.Plugins.kotKapt)
    id (Dependencies.Plugins.dI)
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = Dependencies.Android.versionName
        testInstrumentationRunner = Dependencies.Android.testInstrRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(
                Dependencies.Android.proguardAndOpt),
                Dependencies.Android.proguardRulPro)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Dependencies.Android.jvm
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation (Dependencies.UI.androidCore)
    implementation (Dependencies.UI.appCompat)
    implementation (Dependencies.UI.androidMaterial)
    implementation (Dependencies.UI.constrainLayout)

    testImplementation (Dependencies.UI.jUnit)

    androidTestImplementation (Dependencies.UI.extJUnit)
    androidTestImplementation (Dependencies.UI.espresso)

    //LifeData
    implementation (Dependencies.LifeData.lifecycleVM)
    implementation (Dependencies.LifeData.lifecycleLD)
    implementation (Dependencies.LifeData.lifecycleRuntime)

    //Navigation
    implementation(Dependencies.Navigate.navigationFrg)
    implementation(Dependencies.Navigate.navigationUI)

    //room
    implementation (Dependencies.Room.roomRunTime)
    annotationProcessor (Dependencies.Room.roomCompiler)
    kapt(Dependencies.Room.roomKaptCompiler)
    implementation(Dependencies.Room.roomKtx)

    // Coroutines
    implementation (Dependencies.Coroutines.coroutines)

    // Dagger-Hilt
    implementation (Dependencies.DaggerHilt.daggerHilt)
    kapt (Dependencies.DaggerHilt.daggerKaptHilt)

    //Retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.retrofitGson)

    //Glide
    implementation(Dependencies.Glide.glide)
    annotationProcessor(Dependencies.Glide.glideCompiler)
}
