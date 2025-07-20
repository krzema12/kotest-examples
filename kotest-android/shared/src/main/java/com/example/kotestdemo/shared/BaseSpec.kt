package com.example.kotestdemo.shared

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.BehaviorSpec

//import io.mockk.clearAllMocks
//import io.mockk.unmockkAll

abstract class BaseSpec(
   body: BaseSpec.() -> Unit,
   val completeIsolation: Boolean = false,
) : BehaviorSpec() {

//   private val coroutineKotestRule = CoroutineKotestRule()
//   private val liveDataKotestRule = LiveDataKotestRule()

//   val mainCoroutineRule = coroutineKotestRule.mainCoroutineRule

   init {
      body()
   }

   /**
    * Setup to add preparation and cleanups for Kotest
    */
//   override val extensions: List<Extension> = mutableListOf(coroutineKotestRule, liveDataKotestRule)
//
//   override suspend fun afterSpec(spec: Spec) {
//      clearAllMocks()
//      unmockkAll()
//   }

   /**
    * Best to describe via example what IsolationMode does
    *
    * You have shared preferences instance created at top level of your kotest
    *
    * Every time you apply something to shared preferences(let's say you've putInt(),
    * that value is stored and carried to next test unless you specifically change isolation mode
    *
    * It is better to keep default unless strictly necessary to change
    * @see <a href="https://kotest.io/docs/framework/isolation-mode.html">Kotest Isolation Modes</a>
    */
   override fun isolationMode(): IsolationMode? {
      return if (completeIsolation) {
         super.isolationMode()
      } else {
         super.isolationMode()
      }
   }
}
