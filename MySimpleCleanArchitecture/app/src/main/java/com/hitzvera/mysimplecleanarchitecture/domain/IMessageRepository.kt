package com.hitzvera.mysimplecleanarchitecture.domain


interface IMessageRepository {

    fun getWelcomeMessage(name: String): MessageEntity

}