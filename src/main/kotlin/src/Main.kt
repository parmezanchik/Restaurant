package src

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import src.enums.Desert
import src.enums.Dish
import src.models.ServiceMenu


@SpringBootApplication
class DemoApplication
fun main(args:Array<String>) {
    val serviceMenu = ServiceMenu()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    runApplication<DemoApplication>(*args)

    serviceMenu.addMainMenuItem("Paperoni", "Paperone", 300.0, "Italian", Dish.Pizza, 300)
    serviceMenu.addMainMenuItem("Bober", "Bober", 210.0, "American", Dish.Burger, 250)
    serviceMenu.addDesertMenuItem("Franchesco", "Franchesco", 150.0, "Ukrainian", Desert.Cake, 900)
    serviceMenu.addDrinkMenuItem("Negroni", "Cock", 200.0, "Italian", true, 175)

    runApplication<DemoApplication>(*args);
    serviceMenu.runOrdering()
}
