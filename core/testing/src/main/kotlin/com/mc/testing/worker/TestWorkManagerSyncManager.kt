package com.mc.testing.worker

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import mc.data.worker.SyncManager

class TestWorkManagerSyncManager : SyncManager {

    private val syncingFlow: MutableSharedFlow<Boolean> = MutableSharedFlow(replay = 1)

    override val isSyncing: Flow<Boolean>
        get() = syncingFlow

    fun emit(isSyncing: Boolean) {
        syncingFlow.tryEmit(isSyncing)
    }
}