package com.issuemoa.store.repository

import com.issuemoa.store.entity.QProductsPrice.productsPrice
import com.issuemoa.store.entity.QStore.store
import com.issuemoa.store.entity.Store
import com.querydsl.jpa.JPAExpressions
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository

@Repository
class StoreRepositoryCustomImpl(private val jpaQueryFactory: JPAQueryFactory): StoreRepositoryCustom{
    override fun findStoresByName(name: String): Store? {
        return jpaQueryFactory
            .selectFrom(store)
            .where(store.name.eq(name))
            .fetchOne()
    }

    override fun findStoresExistsFromPrice(): List<Store> {
        return jpaQueryFactory
            .select(store)
            .from(store)
            .where(
                JPAExpressions
                    .selectOne()
                    .from(productsPrice)
                    .where(productsPrice.entpId.eq(store.entpId))
                    .exists()
            )
            .fetch()
    }
}