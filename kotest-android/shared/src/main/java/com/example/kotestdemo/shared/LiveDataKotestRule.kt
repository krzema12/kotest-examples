package com.example.kotestdemo.shared

import androidx.arch.core.executor.ArchTaskExecutor
import androidx.arch.core.executor.TaskExecutor
import io.kotest.core.listeners.AfterSpecListener
import io.kotest.core.listeners.BeforeSpecListener
import io.kotest.core.spec.Spec

/**
 * A Kotest listener that sets a custom TaskExecutor for LiveData
 */
@Suppress("RestrictedApi")
class LiveDataKotestRule : BeforeSpecListener, AfterSpecListener {

   // test executor for LiveData
   private val executor = object : TaskExecutor() {
      override fun executeOnDiskIO(runnable: Runnable) = runnable.run()
      override fun postToMainThread(runnable: Runnable) = runnable.run()
      override fun isMainThread(): Boolean = true
   }

   override suspend fun beforeSpec(spec: Spec) {
      ArchTaskExecutor.getInstance().setDelegate(executor)
   }

   override suspend fun afterSpec(spec: Spec) {
      ArchTaskExecutor.getInstance().setDelegate(null)
   }
}
