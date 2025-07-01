package io.kotest.examples.native

import io.kotest.core.spec.style.FunSpec
import kotlinx.coroutines.delay

class CoroutinesTest : FunSpec({

   context("kotest native allows nested tests") {
      delay(100) // look ma, I can use coroutines here!
      context("give me another context!") {
         delay(200) // look ma, I can use coroutines here!
         test("a leaf test") {
            delay(300) // look ma, I can use coroutines here!
         }
      }
   }
})
