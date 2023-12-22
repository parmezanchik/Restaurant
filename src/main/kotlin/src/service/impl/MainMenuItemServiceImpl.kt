package src.service.impl

import org.springframework.stereotype.Service
import src.enums.Dish
import src.models.*
import src.service.MainMenuItemService

@Service
class MainMenuItemServiceImpl : MainMenuItemService {
    private val menu = Menu.Instance
    override fun getAllMainMenuItems(): MutableList<MainMenuItem> {
        var res: MutableList<MainMenuItem> = mutableListOf();
        for ((i, item) in menu.items.withIndex()){
            if(item is MainMenuItem) {
                res.add(item)
            }
        }
        return res;
    }

    override fun getMainMenuItemById(id: Int): MainMenuItem {
        var mains: MutableList<MainMenuItem> = getAllMainMenuItems()
        var res: MainMenuItem? = null;
        for ((i, item) in mains.withIndex()){
            if(i == id)
                res = item;
        }
        if (res == null){
            throw NullPointerException("Element by this id isnt found")
        }

        return res;
    }
    override fun deleteMainMenuItemById(id: Int): MainMenuItem {
        var mains: MutableList<MainMenuItem> = getAllMainMenuItems()
        val res: MainMenuItem = mains.removeAt(id)
        if (res == null)
            throw NullPointerException("Element by this id isnt found")

        return res;
    }
    override fun postMainMenuItem(mainMenuItem: MainMenuItem) {
        menu.AddMenuItem(mainMenuItem) // Use the correct method here
    }
}