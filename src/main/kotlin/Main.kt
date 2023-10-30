import enums.Desert
import enums.Dish

fun main() {
    val clients = mutableListOf<Clients>()
    val serviceMenu = ServiceMenu()

    serviceMenu.addMainMenuItem("Paperoni", "Paperone", 300.0, "Italian", Dish.Pizza, 300)
    serviceMenu.addMainMenuItem("Bober", "Bober", 210.0, "American", Dish.Burger, 250)
    serviceMenu.addDesertMenuItem("Franchesco", "Franchesco", 150.0, "Ukrainian", Desert.Cake, 900)
    serviceMenu.addDrinkMenuItem("Negroni", "Cock", 200.0, "Italian", true, 175)

    while (true) {
        print("Enter customer name: ")
        val name = readLine() ?: ""
        print("Enter table number: ")
        val tableNumber = readLine()?.toIntOrNull() ?: 0

        val client = Clients(name, tableNumber)
        clients.add(client)

        println("Menu:")
        val menuItems = serviceMenu.getMenuItems()
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
                client.add_price(menuItem.price.toFloat())
                client.add_list_dishes(menuItem.name)
                order.addMenuItem(menuItem)
            } else {
                println("Invalid choice")
            }
        }

        println("Order for ${client.name} (table ${client.table_num}):")
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
