package com.hitzvera.mysimplecleanarchitecture.data

import com.hitzvera.mysimplecleanarchitecture.domain.MessageEntity
import com.hitzvera.mysimplecleanarchitecture.domain.MessageUseCase

class MessageDataSource: IMessageDataSource {

    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name welcome to clean code")
    }

}