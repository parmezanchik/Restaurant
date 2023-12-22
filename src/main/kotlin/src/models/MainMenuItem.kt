package src.models

import src.enums.Dish

/**
 * Class for drink items of the src.models.Menu
 * @param dish type of dish
 * @param weight weight of the dish
 */
class MainMenuItem(
    name: String, description: String, price: Double, cuisine: String,
    dish: Dish, weight: Int
) : MenuItem(name, description, price, cuisine)
{

    var dish = dish
        get() = field
        set(value) {
            field = value
        }
    var weight = weight
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "src.models.MainMenuItem(dish=$dish, weight=$weight)\n"
    }


}