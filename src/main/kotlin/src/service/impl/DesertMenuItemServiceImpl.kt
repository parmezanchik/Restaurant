package src.service.impl

import org.springframework.stereotype.Service
import src.enums.Desert
import src.models.DesertMenuItem
import src.models.Menu
import src.service.DesertMenuItemService

@Service
class DesertMenuItemServiceImpl : DesertMenuItemService {
    private val menu = Menu.Instance
    override fun getAllDesertMenuItems(): MutableList<DesertMenuItem> {
        var res: MutableList<DesertMenuItem> = mutableListOf();
        for ((i, item) in menu.items.withIndex()){
            if(item is DesertMenuItem) {
                res.add(item)
            }
        }
        return res;
    }
    override fun getDesertMenuItemById(id: Int): DesertMenuItem {
        var mains: MutableList<DesertMenuItem> = getAllDesertMenuItems()
        var res: DesertMenuItem? = null;
        for ((i, item) in mains.withIndex()){
            if(i == id)
                res = item;
        }
        if (res == null){
            throw NullPointerException("Element by this id isnt found")
        }

        return res;
    }
    override fun deleteDesertMenuItemById(id: Int): DesertMenuItem {
        var mains: MutableList<DesertMenuItem> = getAllDesertMenuItems()
        val res: DesertMenuItem = mains.removeAt(id)
        if (res == null)
            throw NullPointerException("Element by this id isnt found")

        return res;
    }

    override fun postDesertMenuItem(desertMenuItem: DesertMenuItem) {
        menu.AddMenuItem(desertMenuItem)
    }

    fun postDesertMenuItem(name: String, description: String, price: Double, cuisine: String, type: Desert, kcal: Int) {
        val desertMenuItem = DesertMenuItem(name, description, price, cuisine, type, kcal)
         // Use the correct method here
        menu.AddMenuItem(desertMenuItem)
    }

}