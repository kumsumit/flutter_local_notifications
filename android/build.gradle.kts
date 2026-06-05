plugins {
    id("com.android.library") version "9.2.1"
}

group = "com.dexterous.flutterlocalnotifications"
version = "1.0-SNAPSHOT"

android {
    namespace = "com.dexterous.flutterlocalnotifications"

    compileSdk = 37

    defaultConfig {
        minSdk = 24
        multiDexEnabled = true

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true

        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    lint {
        disable += "InvalidPackage"
    }
}

dependencies {
    coreLibraryDesugaring(
        "com.android.tools:desugar_jdk_libs:2.1.5"
    )

    implementation("androidx.core:core:1.18.0")
    implementation("androidx.media3:media3-session:1.10.1")
    implementation("com.google.code.gson:gson:2.13.2")

    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:5.23.0")
    testImplementation("androidx.test:core:1.7.0")
    testImplementation("org.robolectric:robolectric:4.16.1")
}
