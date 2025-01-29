package com.issuemoa.store.dto.response

data class StoresResponse(
   val id: Long = 0,
   val entpId: Long = 0,
   val name: String,
   val tel: String,
   val postNo: Int? = null,
   val addr: String,
   val addrDetail: String,
   val roadAddr: String,
   val roadAddrDetail: String,
) {

}