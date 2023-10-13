import enums.Desert
import enums.Dish


fun main() {
    val order1 = Order(1, 2)
    val order2 = Order(2, 3)

    println(order1)
    println(order2)  // прінтимо наші замовлення(можливо додамо ще умови)


    // sample test of Menu
    val menu = Menu.Instance
    menu.AddMenuItem(MainMenuItem("Paperoni","Paperone", 300.0, "Italian", Dish.Pizza, 300))
    menu.AddMenuItem(MainMenuItem("Bober","Bober", 210.0, "American", Dish.Burger, 250))
    menu.AddMenuItem(DesertMenuItem("Franchesco","Franchesco", 150.0, "Ukrainian", Desert.Cake, 900))
    menu.AddMenuItem(DesertMenuItem("Franchesco","Franchesco", 150.0, "Ukrainian", Desert.Cake, 900))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))
    menu.AddMenuItem(DrinkMenuItem("Negroni","Cock", 200.0, "Italian", true, 175))
    println(menu.toString())
}
