import kotlin.random.Random
class Order(private val orderId: Int, private val tableNum: Int) {
    private val items = mutableListOf<MenuItem>()
    private val waiters = listOf("Vlad", "Ilya", "Maks")
    private val statuses = listOf("Cooking", "Accepted", "Ready to go")
    private val randomWaiter = waiters[Random.nextInt(waiters.size)]
    private val randomStatus = statuses[Random.nextInt(statuses.size)]
    override fun toString(): String {
        return "Order ID: $orderId, Table: $tableNum, Waiter: $randomWaiter, Status: $randomStatus, Items: $items"
    }
}