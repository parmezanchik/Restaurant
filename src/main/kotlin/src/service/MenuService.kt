package src.service

import src.enums.Desert
import src.enums.Dish
import src.models.MenuItem
import src.storages.OrderStorage

interface MenuService {
    fun getAllMenuItems(): MutableList<MenuItem>
    fun getMenuItemById(id: Int): MenuItem
    fun deleteMenuItemById(id: Int): MenuItem
}