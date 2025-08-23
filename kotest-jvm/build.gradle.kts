import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
   alias(libs.plugins.kotlin)
   alias(libs.plugins.kotest)
}

repositories {
   mavenCentral()
   mavenLocal()
}

java {
   toolchain {
      languageVersion = JavaLanguageVersion.of(17)
   }
}

tasks.test {
   useJUnitPlatform()
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
            implementation(libs.kotest.runner.junit5)
            implementation(libs.kotest.assertions.core)
         }
      }
   }
}
