import enums.Dish
import enums.Desert

class ServiceMenu {
    private val menu = Menu.getInstance()

    fun addMainMenuItem(name: String, description: String, price: Double, cuisine: String, type: Dish, weight: Int) {
        val mainMenuItem = MainMenuItem(name, description, price, cuisine, type, weight)
        menu.AddMenuItem(mainMenuItem)
    }

    fun addDesertMenuItem(name: String, description: String, price: Double, cuisine: String, type: Desert, kcal: Int) {
        val desertMenuItem = DesertMenuItem(name, description, price, cuisine, type, kcal)
        menu.AddMenuItem(desertMenuItem)
    }

    fun addDrinkMenuItem(name: String, description: String, price: Double, cuisine: String, alco: Boolean, volume: Int) {
        val drinkMenuItem = DrinkMenuItem(name, description, price, cuisine, alco, volume)
        menu.AddMenuItem(drinkMenuItem)
    }

    fun getMenuItems(): List<MenuItem> {
        return menu.items
    }
}
