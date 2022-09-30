package com.hitzvera.mysimplecleanarchitecture.data

import com.hitzvera.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {

    fun getMessageFromSource(name: String): MessageEntity

}