package com.example.kotestdemo

import io.kotest.core.spec.style.BehaviorSpec
import org.junit.Assert.assertEquals

class WobbleTest : BehaviorSpec({

   Given("This is a fake test") {
      When("fake test is called") {
         Then("Pass the test") {
            assertEquals(4, 2 + 2)
         }
      }
   }

   Given("This is another fake test") {
      When("fake test is called") {
         Then("Pass the test") {
            assertEquals(4, 2 + 2)
         }
      }
   }
})
