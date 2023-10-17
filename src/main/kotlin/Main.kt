import kotlin.random.Random
import enums.Desert
import enums.Dish

fun main() {
    val clients = mutableListOf<Clients>()
    val menu = Menu.Instance
    menu.AddMenuItem(MainMenuItem("Paperoni","Paperone", 300.0, "Italian", Dish.Pizza, 300))
    menu.AddMenuItem(MainMenuItem("Bober","Bober", 210.0, "American", Dish.Burger, 250))
    menu.AddMenuItem(DesertMenuItem("Franchesco","Franchesco", 150.0, "Ukrainian", Desert.Cake, 900))
    menu.AddMenuItem(DesertMenuItem("Franchesco","Franchesco", 150.0, "Ukrainian", Desert.Cake, 900))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))

    while (true) {
        print("Введіть ім'я клієнта: ")
        val name = readLine() ?: ""
        print("Введіть номер столика: ")
        val tableNumber = readLine()?.toIntOrNull() ?: 0

        val client = Clients(name, tableNumber)
        clients.add(client)

        println("Меню:")
        menu.items.forEachIndexed { index, menuItem ->
            println("${index + 1}. ${menuItem.name} - ${menuItem.price} грн")
        }

        val order = Order(clients.size, client.table_num)

        while (true) {
            print("Виберіть блюда або 0, щоб закінчити замовлення: ")
            val choice = readLine()?.toIntOrNull() ?: 0

            if (choice == 0) {
                break
            } else if (choice in 1..menu.items.size) {
                val menuItem = menu.items[choice - 1]
                client.add_price(menuItem.price.toFloat())
                client.add_list_dishes(menuItem.name)
                order.addMenuItem(menuItem) // Add the selected item to the order
            } else {
                println("Неправильний вибір")
            }
        }

        println("Замовлення для ${client.name} (столик ${client.table_num}):")
        for (item in client.list_of_dishes) {
            println(item)
        }
        println("Загальна сума: ${client.total_price} грн")

        // Print order details
        println(order.toString())

        print("Продовжити замовлення? (так/ні): ")
        val continueOrder = readLine() ?: ""
        if (!continueOrder.equals("так", ignoreCase = true)) {
            break
        }
    }
}
