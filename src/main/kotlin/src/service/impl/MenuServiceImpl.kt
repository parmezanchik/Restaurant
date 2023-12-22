package src.service.impl

import org.springframework.stereotype.Service
import src.enums.Desert
import src.enums.Dish
import src.models.*
import src.service.MenuService

@Suppress("UNREACHABLE_CODE")
@Service
class MenuServiceImpl: MenuService {
    private val menu = Menu.Instance

    override fun getAllMenuItems(): MutableList<MenuItem> {
        return menu.items;
    }
    override fun getMenuItemById(id: Int): MenuItem {
        var res: MenuItem? = null;
        for ((i, item) in menu.items.withIndex()){
            if(i == id)
                res = item;
        }
        if (res == null){
            throw NullPointerException("Element by this id isnt found")
        }

        return return res;
    }
    override fun deleteMenuItemById(id: Int): MenuItem {

        val res: MenuItem = menu.items.removeAt(id)
        if (res == null)
            throw NullPointerException("Element by this id isnt found")

        return return res;
    }

}