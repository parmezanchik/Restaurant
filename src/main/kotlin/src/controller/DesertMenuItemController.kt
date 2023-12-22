package src.controller

import org.springframework.web.bind.annotation.*
import src.models.DesertMenuItem
import src.service.DesertMenuItemService

@RestController
@RequestMapping("/api/desertMenuItem")
class DesertMenuItemController (private val desertMenuItemService: DesertMenuItemService) {

    @GetMapping
    fun getAll(): MutableList<DesertMenuItem>? {
        try {
            val res = desertMenuItemService.getAllDesertMenuItems()
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): DesertMenuItem? {
        try {
            val res = desertMenuItemService.getDesertMenuItemById(id = id)
            return res;
        } catch (e: Exception) {
            println("Error:" + e.message)
        }
        return null;
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int): DesertMenuItem? {
        return try {
            desertMenuItemService.deleteDesertMenuItemById(id = id)
        } catch (e: Exception) {
            println("Error:" + e.message)
            null
        }
    }
    @PostMapping
    fun create(@RequestBody menuItem: DesertMenuItem) {
        try
        {
            desertMenuItemService.postDesertMenuItem(menuItem)
        }
        catch (e: NullPointerException) {
            println("Error: it cant be null" + e.message)
        }
        catch (e: Exception) {
            println("Error:" + e.message)
        }
    }
}