package com.hitzvera.mysimplecleanarchitecture.domain

interface MessageUseCase {

    fun getMessage(name: String): MessageEntity

}