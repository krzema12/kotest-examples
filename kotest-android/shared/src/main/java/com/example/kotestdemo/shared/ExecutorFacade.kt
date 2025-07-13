package com.example.kotestdemo.shared

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asExecutor
import java.util.concurrent.Executor

interface ExecutorFacade {
   val ioExecutor: Executor
}

class ExecutorFacadeImpl : ExecutorFacade {
   override val ioExecutor: Executor = Dispatchers.IO.asExecutor()
}
