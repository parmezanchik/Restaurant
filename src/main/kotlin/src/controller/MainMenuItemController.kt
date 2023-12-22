package src.controller

import org.springframework.web.bind.annotation.*
import src.models.MainMenuItem
import src.models.MenuItem
import src.service.MainMenuItemService
import src.service.MenuService

@RestController
@RequestMapping("/api/mainMenuItem")
class MainMenuItemController(private val mainMenuService: MainMenuItemService) {

    @GetMapping
    fun getAll(): MutableList<MainMenuItem>? {
        try {
            val res = mainMenuService.getAllMainMenuItems()
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): MainMenuItem? {
        try {
            val res = mainMenuService.getMainMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int): MainMenuItem? {
        try {
            val res = mainMenuService.deleteMainMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }
    @PostMapping
    fun create(@RequestBody menuItem: MainMenuItem) {
        try
        {
            mainMenuService.postMainMenuItem(menuItem)
        }
        catch (e: NullPointerException) {
            println("Error: it cant be null" + e.message)
        }
        catch (e: Exception) {
            println("Error:" + e.message)
        }
    }
}