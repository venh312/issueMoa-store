package com.issuemoa.store.service

import com.issuemoa.store.entity.Store
import com.issuemoa.store.repository.StoreRepository
import org.springframework.stereotype.Service

@Service
class StoreService(private val storeRepository: StoreRepository) {

    fun getAllStores(): List<Store> {
        return storeRepository.findAll()
    }

    fun findStoresExistsFromPrice(): List<Store> {
        return storeRepository.findStoresExistsFromPrice()
    }

    fun findStoresByName(name : String): Store? {
        return storeRepository.findStoresByName(name)
    }

}