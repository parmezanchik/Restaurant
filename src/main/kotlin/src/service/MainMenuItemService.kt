package src.service

import src.enums.Dish
import src.models.MainMenuItem

interface MainMenuItemService {
    fun getAllMainMenuItems(): MutableList<MainMenuItem>
    fun getMainMenuItemById(id: Int): MainMenuItem
    fun deleteMainMenuItemById(id: Int): MainMenuItem
    fun postMainMenuItem(mainMenuItem: MainMenuItem)
}