package src.controller

import org.apache.logging.log4j.message.Message
import org.springframework.web.bind.annotation.*
import src.models.MenuItem
import src.service.MenuService
import src.storages.OrderStorage

@RestController
@RequestMapping("/api/Menu")
class MenuController(private val menuService: MenuService) {
    @GetMapping
    fun getAll(): MutableList<MenuItem>? {
        try {
            val res = menuService.getAllMenuItems()
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): MenuItem? {
        try {
            val res = menuService.getMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int): MenuItem? {
        try {
            val res = menuService.deleteMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }

}