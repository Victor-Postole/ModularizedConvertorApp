package mc.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mc.data.worker.SyncManager
import mc.data.worker.WorkManagerSyncManager

@Module
@InstallIn(SingletonComponent::class)
abstract class ManagerModule {

    @Binds
    abstract fun bindSyncManager(impl: WorkManagerSyncManager): SyncManager

}