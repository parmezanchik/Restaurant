package src.models

class Menu private constructor() {
    /**
     * Singleton with lazy initialization (Instance)
     */
    companion object {
        val Instance: Menu by lazy {
            Menu()
        }
    }

    val items = mutableListOf<MenuItem>()

    /**
     * Add dish to src.models.Menu
     * @param menuItem dish, item of menu
     */
    fun AddMenuItem(menuItem: MenuItem) {
        items.add(menuItem)
    }

    /**
     * Delete dish from src.models.Menu by index
     * @param index index of the dish to delete
     */
    fun RemoveMenuItem(index: Int) {
        if (index in 0 until items.size) {
            items.removeAt(index)
        }
    }

    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String {
        return "src.models.Menu(items=$items)"
    }
}
