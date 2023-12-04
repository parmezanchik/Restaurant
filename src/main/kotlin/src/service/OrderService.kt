package src.service

import src.storages.OrderStorage


interface OrderService{

    fun getAllOrder(): List<OrderStorage>

}

