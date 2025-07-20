//package com.example.kotestdemo.shared
//
//import org.junit.rules.TestWatcher
//import org.junit.runner.Description
//import java.util.concurrent.Executor
//import kotlinx.coroutines.CoroutineDispatcher
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.ExperimentalCoroutinesApi
//import kotlinx.coroutines.test.TestDispatcher
//import kotlinx.coroutines.test.TestScope
//import kotlinx.coroutines.test.UnconfinedTestDispatcher
//import kotlinx.coroutines.test.resetMain
//import kotlinx.coroutines.test.setMain
//
///**
// * Use this rule to replace all coroutines to run on a testing Dispatcher
// */
//@OptIn(ExperimentalCoroutinesApi::class)
//class MainCoroutineRule(private val testDispatcher: TestDispatcher = UnconfinedTestDispatcher()) : TestWatcher(), CoroutineScope by TestScope(testDispatcher) {
//    val testDispatcherFacade: DispatcherFacade = object : DispatcherFacade {
//        override val mainDispatcher: CoroutineDispatcher
//            get() = Dispatchers.Main
//        override val mainImmediateDispatcher: CoroutineDispatcher
//            get() = Dispatchers.Main
//        override val ioDispatcher: CoroutineDispatcher
//            get() = Dispatchers.Main
//        override val defaultDispatcher: CoroutineDispatcher
//            get() = Dispatchers.Main
//        override val unconfinedDispatcher: CoroutineDispatcher
//            get() = Dispatchers.Main
//    }
//
//    val executorFacade: ExecutorFacade = object : ExecutorFacade {
//        override val ioExecutor: Executor = Executor { runnable -> runnable?.run() }
//    }
//
//    override fun starting(description: Description) {
//        Dispatchers.setMain(testDispatcher)
//    }
//
//    override fun finished(description: Description) {
//        // Empty block of runTest will run any clean up necessary after each test
//        runTest { }
//        Dispatchers.resetMain()
//    }
//
//    /**
//     * You may use a [StandardTestDispatcher] for more control over your tests and coroutines
//     */
//    fun runTest(dispatcher: TestDispatcher = testDispatcher, testBody: suspend TestScope.() -> Unit) {
//       kotlinx.coroutines.test.runTest(context = dispatcher, testBody = testBody)
//    }
//
//    fun setMain() {
//        Dispatchers.setMain(testDispatcher)
//    }
//
//    fun resetMain() {
//        Dispatchers.resetMain()
//    }
//
//    fun advanceUntilIdle() {
//        testDispatcher.scheduler.advanceUntilIdle()
//    }
//}
