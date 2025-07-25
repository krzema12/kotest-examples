import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.kotest)
   id("com.google.devtools.ksp") version "2.2.0-2.0.2"
}

repositories {
   mavenCentral()
   mavenLocal()
}

kotlin {

   compilerOptions {
      apiVersion = KotlinVersion.KOTLIN_2_2
      languageVersion = KotlinVersion.KOTLIN_2_2
      verbose = true
   }

   jvm()
   js {
      browser()
      nodejs()
   }
   linuxX64()
//   macosX64()
//   mingwX64()

   sourceSets {

      commonTest {
         dependencies {
            implementation(libs.kotest.framework.engine)
            implementation(libs.kotest.assertions.core)
         }
      }
   }
}
