package com.example.kotestdemo.shared

import io.kotest.core.spec.style.BehaviorSpec
import org.junit.Assert.assertEquals

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleKotestUnitTest : BehaviorSpec({

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

class ExampleUnitTest2 : BehaviorSpec({

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
