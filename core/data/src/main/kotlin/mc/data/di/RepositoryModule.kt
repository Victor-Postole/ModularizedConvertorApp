package mc.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mc.data.repository.CurrencyRepository
import mc.data.repository.OfflineFirstCurrencyRepository

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindCurrencyRepository(impl: OfflineFirstCurrencyRepository): CurrencyRepository

}