import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin)
   alias(libs.plugins.kotest)
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

   sourceSets {
      test {
         dependencies {
            implementation(libs.kotest.framework.engine)
            implementation(libs.kotest.assertions.core)
         }
      }
   }
}
