package com.microservices.rest

import java.lang.Exception

class CustomerNotFoundException(message: String): Exception(message) {
}