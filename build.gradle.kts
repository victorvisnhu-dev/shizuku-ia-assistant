plugins {
    id("com.android.application")
    kotlin("kapt")
    kotlin("android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.shizukuia"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.compose.ui:ui:1.3.0")
    implementation("androidx.compose.material:material:1.3.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    kapt("com.google.dagger:hilt-compiler:2.42")
}

kapt {
    correctErrorTypes = true
}
