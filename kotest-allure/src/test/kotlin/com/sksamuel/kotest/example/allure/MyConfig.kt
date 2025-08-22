package com.sksamuel.kotest.example.allure

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.extensions.allure.AllureTestReporter

class MyConfig : AbstractProjectConfig() {
   override val extensions: List<Extension> = listOf(AllureTestReporter())
}
