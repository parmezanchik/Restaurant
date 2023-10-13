class Menu private constructor() {
    /**
     * Singleton with lazy initialization (Instance)
     */
    companion object {
        val Instance:Menu by lazy {
            Menu()
        }
    }

    private var items = mutableListOf<MenuItem>()

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
    fun AddMenuItem(index: Int){
        items.drop(index)
    }


    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String {
        return "Menu(items=$items)"
    }
}