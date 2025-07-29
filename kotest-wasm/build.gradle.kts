@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
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

//   wasmJs {
//      binaries.executable()
//      nodejs()
//   }

   wasmWasi {
      binaries.executable()
      nodejs()
   }

   sourceSets {
      wasmWasiTest {
         dependencies {
//            implementation(libs.kotest.assertions.core)
            implementation(libs.kotest.framework.engine)
         }
      }
   }
}
