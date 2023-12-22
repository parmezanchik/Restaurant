package src.models

import src.enums.Desert

/**
 * Class for drink items of the src.models.Menu
 * @param desert type of DesertItem
 * @param kcal count of kilocalories
 */
class DesertMenuItem(
    name: String, description: String, price: Double, cuisine: String,
    desert: Desert, kcal: Int
) : MenuItem(name, description, price, cuisine)
{
    var desert = desert
        get() = field
        set(value) {
            field = value
        }
    var kcal = kcal
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "src.models.DesertMenuItem(desert=$desert, kcal=$kcal)\n"
    }


}