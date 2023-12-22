package src.service.impl

import org.springframework.stereotype.Service
import src.models.DrinkMenuItem
import src.models.Menu
import src.service.DrinkMenuItemService

@Service
class DrinkMenuItemServiceImpl : DrinkMenuItemService {
    private val menu = Menu.Instance
    override fun getAllDrinkMenuItems(): MutableList<DrinkMenuItem> {
        var res: MutableList<DrinkMenuItem> = mutableListOf();
        for ((i, item) in menu.items.withIndex()){
            if(item is DrinkMenuItem) {
                res.add(item)
            }
        }
        return res;
    }
    override fun getDrinkMenuItemById(id: Int): DrinkMenuItem {
        var mains: MutableList<DrinkMenuItem> = getAllDrinkMenuItems()
        var res: DrinkMenuItem? = null;
        for ((i, item) in mains.withIndex()){
            if(i == id)
                res = item;
        }
        if (res == null){
            throw NullPointerException("Element by this id isnt found")
        }

        return res;
    }
    override fun deleteDrinkMenuItemById(id: Int): DrinkMenuItem {
        var mains: MutableList<DrinkMenuItem> = getAllDrinkMenuItems()
        val res: DrinkMenuItem = mains.removeAt(id)
        if (res == null)
            throw NullPointerException("Element by this id isnt found")

        return res;
    }
    override fun postDrinkMenuItem(drinkMenuItem: DrinkMenuItem) {
        menu.AddMenuItem(drinkMenuItem)
    }

    fun postDrinkMenuItem(name: String, description: String, price: Double, cuisine: String, alco: Boolean, volume: Int) {
        val drinkMenuItem = DrinkMenuItem(name, description, price, cuisine, alco, volume)
        menu.AddMenuItem(drinkMenuItem) // Use the correct method here
    }
}