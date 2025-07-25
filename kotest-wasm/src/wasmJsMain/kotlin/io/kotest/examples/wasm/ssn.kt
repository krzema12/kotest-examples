package io.kotest.examples.wasm

fun validateSocial(ssn: String): Boolean {
   return ssn.length == 9 && (ssn[0] != '6' && ssn[1] != '6' && ssn[2] != '6')
}
