package com.issuemoa.store.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "products_price")
data class ProductsPrice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val inspectDay: String,
    val entpId: Long,
    val goodsId: Long,
    val price: Int,
    val priceOneYn: String,
    val dcYn: String,
    val dcStartDay: Int,
    val dcEndDay: Int,
    val registerId: Long,
    val modifyId: Long? = null,
    val registerTime: LocalDateTime,
    val modifyTime: LocalDateTime? = null
) {
}