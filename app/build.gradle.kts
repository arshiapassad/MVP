plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("androidx.navigation.safeargs")
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.mvp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.noteappmvp"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.9")
    implementation ("androidx.navigation:navigation-ui-ktx:2.8.9")
    //Room components
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")
    //Extensions and coroutines for room
    implementation ("androidx.room:room-ktx:2.6.1")
    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    //OkHTTP client
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.12.0")
    //Image Loading
    implementation ("io.coil-kt:coil:2.5.0")
    //Gson
    implementation ("com.google.code.gson:gson:2.11.0")
    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.51")
    kapt ("com.google.dagger:hilt-compiler:2.51.1")
    kapt ("androidx.hilt:hilt-compiler:1.2.0")
    //Image Loading
    implementation ("io.coil-kt:coil:2.5.0")
    //RxJava
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.1.4")
    implementation ("androidx.room:room-rxjava3:2.6.1")

    //RxBinding
    implementation ("com.jakewharton.rxbinding4:rxbinding:4.0.0")

    //RxJava for retrofit
    implementation ("com.squareup.retrofit2:adapter-rxjava3:2.9.0")

    //Other
    implementation ("com.flaviofaria:kenburnsview:1.0.7")
    implementation ("it.greyfox:rxnetwork:0.0.5")
}