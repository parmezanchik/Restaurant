package src

/**
 * Class for drink items of the src.Menu
 * @param alco existence of alcohol
 * @param sizeml volume (size) in ml
 */
class DrinkMenuItem(
    name: String, description: String, price: Double, cuisine: String,
    alco: Boolean, sizeml: Int
) : MenuItem(name, description, price, cuisine)
{
    var alco = alco
        get() = field
        set(value) {
            field = value
        }
    var sizeml = sizeml
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "src.DrinkMenuItem(alco=$alco, sizeml=$sizeml)\n"
    }

}