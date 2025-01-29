package com.issuemoa.store.controller

import com.issuemoa.store.entity.Store
import com.issuemoa.store.service.StoreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class StoreController(
    private val storeService: StoreService
) {
    @GetMapping("/stores")
    fun getUserById(): List<Store> {
        return storeService.getAllStores()
    }

    @GetMapping("/stores-exists")
    fun findStoresExistsFromPrice(): List<Store> {
        return storeService.findStoresExistsFromPrice()
    }

    @GetMapping("/stores/{name}")
    fun findStoresByName(@PathVariable name : String): Store? {
        return storeService.findStoresByName(name)
    }
}