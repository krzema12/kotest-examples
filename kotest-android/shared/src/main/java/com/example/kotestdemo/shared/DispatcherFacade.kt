package com.example.kotestdemo.shared

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface DispatcherFacade {
   val mainDispatcher: CoroutineDispatcher
   val mainImmediateDispatcher: CoroutineDispatcher
   val ioDispatcher: CoroutineDispatcher
   val defaultDispatcher: CoroutineDispatcher
   val unconfinedDispatcher: CoroutineDispatcher
}

class DispatcherFacadeImpl : DispatcherFacade {
   override val mainDispatcher: CoroutineDispatcher
      get() = Dispatchers.Main
   override val mainImmediateDispatcher: CoroutineDispatcher
      get() = Dispatchers.Main.immediate
   override val ioDispatcher: CoroutineDispatcher
      get() = Dispatchers.IO
   override val defaultDispatcher: CoroutineDispatcher
      get() = Dispatchers.Default
   override val unconfinedDispatcher: CoroutineDispatcher
      get() = Dispatchers.Unconfined
}
