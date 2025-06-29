package io.kotest.examples.js.dog

import fetchDogUsingHttpClient
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldEndWith

class DogTest : FunSpec({
   test("fetching a dog using JS promises") {
      fetchDogUsingHttpClient().message.shouldEndWith(".jpg")
   }
})
