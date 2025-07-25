import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.kotest)
   id("com.google.devtools.ksp") version "2.2.0-2.0.2"
}

repositories {
   mavenLocal()
   mavenCentral()
}

kotlin {

   compilerOptions {
      apiVersion = KotlinVersion.KOTLIN_2_2
      languageVersion = KotlinVersion.KOTLIN_2_2
   }

   js {
      nodejs()
   }

   sourceSets {
      commonTest {
         dependencies {
            implementation(libs.kotest.assertions.core)
            implementation(libs.kotest.framework.engine)
         }
      }
      jsMain {
         dependencies {
            api(kotlin("stdlib-js"))
            implementation(libs.ktor.client.js)
            // needed as a workaround for https://youtrack.jetbrains.com/issue/KT-57235
            implementation("org.jetbrains.kotlin:kotlinx-atomicfu-runtime:2.1.10")
         }
      }
   }
}
