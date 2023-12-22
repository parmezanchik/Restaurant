package src.service

import src.models.DrinkMenuItem

interface DrinkMenuItemService {
    fun getAllDrinkMenuItems(): MutableList<DrinkMenuItem>
    fun getDrinkMenuItemById(id: Int): DrinkMenuItem
    fun deleteDrinkMenuItemById(id: Int): DrinkMenuItem
    fun postDrinkMenuItem(drinkMenuItem: DrinkMenuItem)
}