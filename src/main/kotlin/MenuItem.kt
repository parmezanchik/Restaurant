import enums.Dish

/**
 * Class for dish - item of the Menu
 * @param name name of item
 * @param cuisine cuisine of dish
 * @param price price in UAH
 */
abstract class MenuItem(
    name: String,
    description:String,
    price: Double,
    cuisine: String,
) {

    var name = name
        get() = field
        set(value) {
            field = value
        }
    var description = description
        get() = field
        set(value) {
            field = value
        }
    var price = price
        get() = field
        set(value) {
            field = value
        }
    var cuisine = cuisine
        get() = field
        set(value) {
            field = value
        }

}