package com.example.kotestdemo.shared

import io.kotest.core.spec.Spec
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.clearAllMocks
import io.mockk.unmockkAll

abstract class BaseSpec(
   body: BaseSpec.() -> Unit,
) : BehaviorSpec() {

   init {
      body()
   }

   override suspend fun afterSpec(spec: Spec) {
      clearAllMocks()
      unmockkAll()
   }
}
