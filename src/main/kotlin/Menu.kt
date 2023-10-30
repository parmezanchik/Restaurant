class Menu {
    val items = mutableListOf<MenuItem>()

    fun AddMenuItem(menuItem: MenuItem) {
        items.add(menuItem)
    }

    companion object {
        private val instance = Menu()
        fun getInstance(): Menu {
            return instance
        }
    }
}
