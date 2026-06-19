android {
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }

    ksp {
        arg("room.incremental", "true")
        arg("room.schemaLocation", "$projectDir/schemas")
    }

    bundle {
        language {
            enableSplit = false
        }
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
        aidl = true
    }

    namespace = "io.nekohasekai.sagernet"

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }

    androidResources {
        generateLocaleConfig = true
    }

    lint {
        abortOnError = false
    }
lint {
    abortOnError = false
}}