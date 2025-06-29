import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.kotest)
   alias(libs.plugins.kotest.multiplatform)
}

repositories {
   mavenLocal()
   mavenCentral()
}

kotlin {
   js {
      nodejs()
   }
   compilerOptions {
      apiVersion = KotlinVersion.KOTLIN_2_1
      languageVersion = KotlinVersion.KOTLIN_2_1
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
            kotlin("stdlib-js")
            implementation(libs.ktor.client.js)
            // needed as a workaround for https://youtrack.jetbrains.com/issue/KT-57235
            implementation("org.jetbrains.kotlin:kotlinx-atomicfu-runtime:2.1.10")
         }
      }
   }
}
