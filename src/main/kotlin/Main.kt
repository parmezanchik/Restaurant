fun main() {
    val client = Clients("Ivan",1)
    client.add_price(2.toFloat())
    client.add_price(3.toFloat())
    client.add_price(2.4.toFloat())
    client.add_list_dishes("Makarony")
    client.add_list_dishes("Makarony")
    client.add_list_dishes("salat")
    println("Інформація о клієнті ${client.name} " +
            "\nСтолик -> №${client.table_num} " +
            "\nСума заказу -> ${client.total_price} " +
            "\nСписок замовлених страв -> ${client.list_of_dishes}.")
}
