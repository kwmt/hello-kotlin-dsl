
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

val kotlin_version: String by rootProject.extra

//project.extensions.add("android", BaseAppModuleExtension)
android {
    compileSdkVersion (28)
    defaultConfig {
        applicationId = "com.example.kotlin_dsl"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            setMinifyEnabled(false)
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree("dir" to "libs", "include" to listOf("*.jar")))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.1")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("com.google.android.material:material:1.0.0")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.1")
}
