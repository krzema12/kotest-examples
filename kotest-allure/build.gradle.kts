import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
   kotlin("jvm") version "2.2.10"
   id("io.qameta.allure") version "2.10.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
   sourceCompatibility = JavaVersion.VERSION_21
   targetCompatibility = JavaVersion.VERSION_21
   withSourcesJar()
}

kotlin {
   compilerOptions {
      jvmTarget = JvmTarget.JVM_21
      languageVersion = org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_2
      apiVersion = org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_2
   }
}

dependencies {
   implementation(kotlin("stdlib"))
   implementation(kotlin("reflect"))
   testImplementation("io.kotest:kotest-extensions-allure:6.0.0")
   testImplementation("io.kotest:kotest-runner-junit5:6.0.0")
}

tasks.withType<Test> {
   useJUnitPlatform()
   filter {
      isFailOnNoMatchingTests = false
   }
}

allure {
   adapter.autoconfigure.set(false)
   version.set("2.13.1")
}
