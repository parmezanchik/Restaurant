package src.service

import src.enums.Desert
import src.models.DesertMenuItem

interface DesertMenuItemService {
    fun getAllDesertMenuItems(): MutableList<DesertMenuItem>
    fun getDesertMenuItemById(id: Int): DesertMenuItem
    fun deleteDesertMenuItemById(id: Int): DesertMenuItem
    fun postDesertMenuItem(desertMenuItem: DesertMenuItem)
}