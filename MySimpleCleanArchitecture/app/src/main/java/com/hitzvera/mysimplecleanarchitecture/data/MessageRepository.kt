package com.hitzvera.mysimplecleanarchitecture.data

import com.hitzvera.mysimplecleanarchitecture.domain.IMessageRepository
import com.hitzvera.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {

    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }

}