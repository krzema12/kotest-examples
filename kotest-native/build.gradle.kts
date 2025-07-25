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
   }

   linuxX64()
//   mingwX64()
//   macosX64()
//   iosX64()

   sourceSets {
      nativeTest {
         dependencies {
            implementation(libs.kotest.framework.engine)
         }
      }
   }
}
