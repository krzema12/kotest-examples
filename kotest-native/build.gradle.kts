buildscript {
   repositories {
      mavenCentral()
      mavenLocal()
   }
}

plugins {
   alias(libs.plugins.kotlin.multiplatform)
}

repositories {
   mavenCentral()
   mavenLocal()
}

kotlin {

   targets {
      linuxX64 {
         binaries {
            executable()
         }
      }
      linuxArm64()

      mingwX64()

      macosX64()
      macosArm64()

      tvosX64()
      tvosArm64()
      tvosSimulatorArm64()

      watchosArm64()
      watchosX64()
      watchosSimulatorArm64()

      iosX64()
      iosArm64()
      iosSimulatorArm64()
   }

   sourceSets {

      nativeTest {
         dependencies {
            implementation(kotlin("test-common"))
            implementation(kotlin("test-annotations-common"))
            implementation(libs.kotest.framework.engine)
         }
      }
   }
}
