plugins {
   alias(libs.plugins.android.library)
   alias(libs.plugins.jetbrains.kotlin.android)
   alias(libs.plugins.kotest)
}

android {
   namespace = "io.kotest.examples.android.shared"
   compileSdk = 35

   defaultConfig {
      minSdk = 26

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      consumerProguardFiles("consumer-rules.pro")
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
      sourceCompatibility = JavaVersion.VERSION_11
      targetCompatibility = JavaVersion.VERSION_11
   }

   kotlinOptions {
      jvmTarget = "11"
   }

   testOptions {
      unitTests.all {
         it.useJUnit()
      }
   }
}

dependencies {
//   implementation(libs.androidx.core.ktx)
//   implementation(libs.androidx.appcompat)
//   implementation(libs.material)
   testImplementation(libs.junit)
   implementation(libs.kotest.framework)
//   implementation(libs.mockk.android)
//
//   api(libs.kotlin.coroutines.test)

//   testImplementation(libs.kotlin.reflect)
//   testImplementation()
//   testImplementation(libs.kotest.assertions)
//   testImplementation(libs.mockk.android)
//   testImplementation(libs.mockk.agent)
//
//   androidTestImplementation(libs.androidx.junit)
}
