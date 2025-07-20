package com.example.kotestdemo.shared

import org.junit.Assert
import org.junit.Test

class ExampleJUnit4Test {

   @Test
   fun given_aFakeTest_when_itsCalled_then_itPasses() {
       Assert.assertEquals(4, 2 + 2)
   }

   @Test
   fun given_anotherFakeTest_when_itsCalled_then_itPasses() {
       Assert.assertEquals(4, 2 + 2)
   }
}
