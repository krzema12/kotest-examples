import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.kotest.multiplatform)
}

repositories {
   mavenLocal()
   mavenCentral()
   maven("https://oss.sonatype.org/content/repositories/snapshots")
}

kotlin {
   js(IR) {
      nodejs()
   }
   compilerOptions {
      apiVersion = KotlinVersion.KOTLIN_2_1
      languageVersion = KotlinVersion.KOTLIN_2_1
   }
   sourceSets {
      jsMain {
         dependencies {
            implementation(libs.ktor.client.js)
         }
      }
      jsTest {
         dependencies {
            implementation(libs.kotest.assertions.core)
            implementation(libs.kotest.framework.engine)
         }
      }
   }
}
