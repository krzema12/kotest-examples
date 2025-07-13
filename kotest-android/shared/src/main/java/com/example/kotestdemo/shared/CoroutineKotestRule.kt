package com.example.kotestdemo.shared

import io.kotest.core.listeners.AfterSpecListener
import io.kotest.core.listeners.BeforeSpecListener
import io.kotest.core.spec.Spec

/**
 * A Kotest listener that sets a custom CoroutineDispatcher for testing
 */
class CoroutineKotestRule : BeforeSpecListener, AfterSpecListener {

   val mainCoroutineRule = MainCoroutineRule()

   override suspend fun beforeSpec(spec: Spec) {
      mainCoroutineRule.setMain()
   }

   override suspend fun afterSpec(spec: Spec) {
      mainCoroutineRule.resetMain()
   }
}
