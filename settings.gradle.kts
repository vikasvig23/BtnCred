pluginManagement {
    repositories {
        google()  // For Android plugins
        mavenCentral()  // For other plugins
    }

    plugins {
        id("com.android.library") version "8.6.2"  // Define the plugin version here
        id("org.jetbrains.kotlin.android") version "1.9.0"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
include(":btn-cred")
