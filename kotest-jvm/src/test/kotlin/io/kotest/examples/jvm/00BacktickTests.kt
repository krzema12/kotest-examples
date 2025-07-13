package io.kotest.examples.jvm

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class `00BacktickTests` : ShouldSpec() {
   init {
      should("support backticks in class names") {
         1 shouldBe 1
      }
   }
}
