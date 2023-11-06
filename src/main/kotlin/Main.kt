import enums.Desert
import enums.Dish

fun main() {
    val serviceMenu = ServiceMenu()

    serviceMenu.addMainMenuItem("Paperoni", "Paperone", 300.0, "Italian", Dish.Pizza, 300)
    serviceMenu.addMainMenuItem("Bober", "Bober", 210.0, "American", Dish.Burger, 250)
    serviceMenu.addDesertMenuItem("Franchesco", "Franchesco", 150.0, "Ukrainian", Desert.Cake, 900)
    serviceMenu.addDrinkMenuItem("Negroni", "Cock", 200.0, "Italian", true, 175)

    serviceMenu.runOrdering()
}
