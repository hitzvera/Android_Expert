package com.hitzvera.mysimplecleanarchitecture.di

import com.hitzvera.mysimplecleanarchitecture.data.IMessageDataSource
import com.hitzvera.mysimplecleanarchitecture.data.MessageDataSource
import com.hitzvera.mysimplecleanarchitecture.data.MessageRepository
import com.hitzvera.mysimplecleanarchitecture.domain.IMessageRepository
import com.hitzvera.mysimplecleanarchitecture.domain.MessageInteractor
import com.hitzvera.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}