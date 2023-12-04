package src

import src.enums.Desert
import src.enums.Dish
import src.storages.OrderStorage

class ServiceMenu {

    private val menu = Menu.Instance

    fun addMainMenuItem(name: String, description: String, price: Double, cuisine: String, type: Dish, weight: Int) {
        val mainMenuItem = MainMenuItem(name, description, price, cuisine, type, weight)
        menu.AddMenuItem(mainMenuItem) // Use the correct method here
    }

    fun addDesertMenuItem(name: String, description: String, price: Double, cuisine: String, type: Desert, kcal: Int) {
        val desertMenuItem = DesertMenuItem(name, description, price, cuisine, type, kcal)
        menu.AddMenuItem(desertMenuItem) // Use the correct method here
    }

    fun addDrinkMenuItem(name: String, description: String, price: Double, cuisine: String, alco: Boolean, volume: Int) {
        val drinkMenuItem = DrinkMenuItem(name, description, price, cuisine, alco, volume)
        menu.AddMenuItem(drinkMenuItem) // Use the correct method here
    }

    fun getMenuItems(): List<MenuItem> {
        return menu.items
    }
    fun runOrdering() {
        val clients = mutableListOf<OrderStorage>()

        while (true) {
            print("Enter customer name: ")
            val name = readLine() ?: ""
            print("Enter table number: ")
            val tableNumber = readLine()?.toIntOrNull() ?: 0

            val client = OrderStorage(clients.size,name, tableNumber)

            val clientProc = Clients(name, tableNumber)

            println("src.Menu:")
            val menuItems = getMenuItems()
            menuItems.forEachIndexed { index, menuItem ->
                println("${index + 1}. ${menuItem.name} - ${menuItem.price} UAH")
            }

            val order = Order(clients.size, client.table_num)

            while (true) {
                print("Select dishes or enter 0 to finish the order: ")
                val choice = readLine()?.toIntOrNull() ?: 0

                if (choice == 0) {
                    break
                } else if (choice in 1..menuItems.size) {
                    val menuItem = menuItems[choice - 1]
                    clientProc.add_price(menuItem.price.toFloat())
                    clientProc.add_list_dishes(menuItem.name)
                    order.addMenuItem(menuItem)
                } else {
                    println("Invalid choice")
                }
            }
            client.total_price = clientProc.total_price
            client.list_of_dishes = clientProc.list_of_dishes
            clients.add(client)
            println(clients)

            println("src.Order for ${client.name} (table ${client.table_num}):")
            for (item in client.list_of_dishes) {
                println(item)
            }
            println("Total price: ${client.total_price} UAH")

            println(order.toString())

            print("Continue ordering? (yes/no): ")
            val continueOrder = readLine() ?: ""
            if (!continueOrder.equals("yes", ignoreCase = true)) {
                break
            }
        }
    }

}
