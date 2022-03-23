package com.irzstudio.GroceryStore.listener

import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.model.product.ProductEntity

interface OnClickItem {
    fun onClick(productEntity: ProductEntity)
}

interface OnClickItemAndAdd {
    fun onClick(productEntity: ProductEntity)
    fun onClickAdd(productEntity: ProductEntity)
}
public val dummy1 = ProductEntity(name = "Cola Light", description = "335 мл",
    price = 80,
    picture = R.drawable.iv_coke,
    id = 8
)
interface OnClickItemAddRemove {
    fun onClick(productEntity: ProductEntity)
    fun onClickAdd(productEntity: ProductEntity)
    fun onClickSubstract(productEntity: ProductEntity)
    fun onClickRemove(productEntity: ProductEntity)
}

interface myOnClick {


}