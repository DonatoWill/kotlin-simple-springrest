package com.microservices.rest

data class Customer(var id: Int, var name: String = "", var telephone: Telephone? = null){

    data class Telephone(var countryCode: String = "", var telephoneNumber: String = "")

}