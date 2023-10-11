import kotlin.random.Random
class Order(private val orderId: Int, private val tableNum: Int) {
    private val items = mutableListOf<MenuItem>()  //робимо змінювальний список який буде приймати страви
    private val waiters = listOf("Vlad", "Ilya", "Maks")
    private val statuses = listOf("Cooking", "Accepted", "Ready to go")  //списки для покращення роботи програми
    private val randomWaiter = waiters[Random.nextInt(waiters.size)]
    private val randomStatus = statuses[Random.nextInt(statuses.size)]   //рандом офіціантів та часу готовки
    override fun toString(): String {
        //повертаємо на екран користувача інформацію про стави
        return "Order ID: $orderId, Table: $tableNum, Waiter: $randomWaiter, Status: $randomStatus, Items: $items"
    }
}