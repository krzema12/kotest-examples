package com.example.kotestdemo

import com.example.kotestdemo.shared.BaseSpec
import org.junit.Assert.assertEquals

class AppTest : BaseSpec({

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
