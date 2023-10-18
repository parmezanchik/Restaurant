class Menu private constructor() {
    /**
     * Singleton with lazy initialization (Instance)
     */
    companion object {
        val Instance:Menu by lazy {
            Menu()
        }
    }

    internal var items = mutableListOf<MenuItem>()


    /**
     * Add dish to Menu
     * @param menuItem dish, item of menu
     */
    fun AddMenuItem(menuItem: MenuItem){
        items.add(menuItem);
    }
    /**
     * Delete dish to Menu
     * @param index index of dish, item of menu to delete
     */
    fun DelMenuItem(index: Int){
        items.drop(index)
    }


    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String {
        var res = "Menu\n"

        res += "---\nMain Dishes:\n"
        items.forEachIndexed { index, el ->
            when (el::class.simpleName) {
                "MainMenuItem" -> res += "${index+1} " + el.name + "\n"
            }
        }
        res += "---\nDeserts:\n"
        items.forEachIndexed { index, el ->
            when (el::class.simpleName) {
                "DesertMenuItem" -> res += "${index+1} " + el.name + "\n"
            }
        }
        res += "---\nDrinks:\n"
        items.forEachIndexed { index, el ->
            when (el::class.simpleName) {
                "DrinkMenuItem" -> res += "${index+1} " + el.name + "\n"
            }
        }

        return res
    }
}