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
   js {
      browser()
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
            // needed as a workaround for https://youtrack.jetbrains.com/issue/KT-57235
            implementation("org.jetbrains.kotlin:kotlinx-atomicfu-runtime:2.1.10")
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
