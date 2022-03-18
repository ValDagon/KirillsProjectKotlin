package com.irzstudio.GroceryStore.data

import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.model.product.ProductEntity
import com.irzstudio.GroceryStore.model.groceries.GroceriesData
import io.reactivex.Observable

class DummyDataSource {

    fun getExclusive(): Observable<ArrayList<ProductEntity>> {

        val dummy1 = ProductEntity(name = "HYPER PC", description = "СТАНДАРТ",
            price = 60,
            picture = R.drawable.pcstand,
            id = 1
        )
        val dummy2 = ProductEntity(name = "HYPER PC", description = "VIP",
            price = 80,
            picture = R.drawable.pcvip,
            id = 2
        )
        val dummy3 = ProductEntity(name = "PC ДОМОЙ", description = "ДОСТАВКА",
            price = 100,
            picture = R.drawable.homepc,
            id = 3
        )

        val data = listOf(dummy1, dummy2, dummy3)
        return Observable.just(ArrayList(data))

    }

    fun getBestSelling(): Observable<ArrayList<ProductEntity>> {

        val dummy1 = ProductEntity(name = "Дневной", description = "8:00 - 13:00",
            price = 200,
            picture = R.drawable.abonement_blue,
            id = 5
        )
        val dummy2 = ProductEntity(name = "Ночной", description = "22:00 - 08:00",
            price = 400,
            picture = R.drawable.abonement_orange,
            id = 6
        )
        val dummy3 = ProductEntity(name = "Полуночник", description = "0:00 - 08:00",
            price = 250,
            picture = R.drawable.abonement_red,
            id = 7
        )

        val data = listOf(dummy1, dummy2, dummy3)
        return Observable.just(ArrayList(data))
    }

    // ДАЛЬШЕ НЕРАБОЧИЙ КОД
    fun getGroceries(): Observable<ArrayList<GroceriesData>> {

        val dummy1 = GroceriesData(name="Beverages", picture = R.drawable.iv_beverages )
        val dummy2 = GroceriesData(name= "Fruits & Vegetable", picture = R.drawable.iv_fruits_vagetable)
        val dummy3 = GroceriesData(name = "Rices", picture = R.drawable.iv_rice)
        val dummy4 = GroceriesData(name = "Dairy & Eggs", picture = R.drawable.iv_dairy_eggs)

        val data = listOf(dummy1, dummy2, dummy3, dummy4)
        return Observable.just(ArrayList(data))
    }

    fun getBeverages(): Observable<ArrayList<ProductEntity>> {

        val dummy1 = ProductEntity(name = "Cola Light", description = "335 мл",
            price = 80,
            picture = R.drawable.iv_coke,
            id = 8
        )

        val dummy2 = ProductEntity(name = "Sprite", description = "325 мл",
            price = 80,
            picture = R.drawable.iv_sprite,
            id = 9
        )

        val dummy3 = ProductEntity(name = "Яблочный морс", description = "1.5 л",
            price = 200,
            picture = R.drawable.iv_juice_apple_grape,
            id = 10
        )

        val dummy4 = ProductEntity(name = "Апельсиновый сок", description = "1.5 л",
            price = 200,
            picture = R.drawable.iv_juice_orange,
            id = 11
        )

        val dummy5 = ProductEntity(name = "Coca-Cola", description = "335 мл",
            price = 80,
            picture = R.drawable.iv_cocacola,
            id = 12
        )

        val dummy6 = ProductEntity(name = "Pepsi", description = "335 мл",
            price = 80,
            picture = R.drawable.iv_pepsi,
            id = 13
        )

        val data = listOf(dummy1, dummy2, dummy3, dummy4, dummy5, dummy6)
        return Observable.just(ArrayList(data))
    }

    fun getSearchData(qword: String?): Observable<List<ProductEntity>> {
        val listData = listOf(getBestSelling(), getExclusive(),getBeverages())
        val resultData = mutableListOf<ProductEntity>()

        return Observable.merge(listData).doOnNext{
            resultData.addAll(it)
        }
            .map {
                return@map resultData.filter {
                    it.name.contains(qword.orEmpty(), true)
                }
            }
    }

}