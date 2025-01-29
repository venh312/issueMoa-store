package com.issuemoa.store.repository

import com.issuemoa.store.entity.Store

interface StoreRepositoryCustom {
    fun findStoresByName(name: String): Store?
    fun findStoresExistsFromPrice(): List<Store>
}
