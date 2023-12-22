package src.controller

import org.springframework.web.bind.annotation.*
import src.models.DrinkMenuItem
import src.service.DrinkMenuItemService

@RestController
@RequestMapping("/api/mainMenuItem")
class DrinkMenuItemController (private val drinkMenuItemService: DrinkMenuItemService) {

    @GetMapping
    fun getAll(): MutableList<DrinkMenuItem>? {
        try {
            val res = drinkMenuItemService.getAllDrinkMenuItems()
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): DrinkMenuItem? {
        try {
            val res = drinkMenuItemService.getDrinkMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int): DrinkMenuItem? {
        return try {
            drinkMenuItemService.deleteDrinkMenuItemById(id = id)
        } catch (e: Exception) {
            println("Error:" + e.message)
            null
        }
    }
    @PostMapping
    fun create(@RequestBody menuItem: DrinkMenuItem) {
        try
        {
            drinkMenuItemService.postDrinkMenuItem(menuItem)
        }
        catch (e: NullPointerException) {
            println("Error: it cant be null" + e.message)
        }
        catch (e: Exception) {
            println("Error:" + e.message)
        }
    }
}