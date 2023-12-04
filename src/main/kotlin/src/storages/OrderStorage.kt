package src.storages

data class OrderStorage(

    var id: Int,
    val name: String,
    val table_num: Int,
    var total_price: Float = 0.toFloat(),
    var list_of_dishes: List<String> = emptyList()

    )

