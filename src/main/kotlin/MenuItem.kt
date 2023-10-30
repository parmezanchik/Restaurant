import enums.Dish
import enums.Desert

/**
 * Class for dish items of the Menu
 * @param name name of item
 * @param description description of item
 * @param price price in UAH
 * @param cuisine cuisine of dish
 */
abstract class MenuItem(
    name: String,
    description: String,
    price: Double,
    cuisine: String
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
