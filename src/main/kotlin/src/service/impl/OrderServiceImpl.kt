package src.service.impl

import org.springframework.stereotype.Service
import src.service.OrderService
import src.storages.OrderStorage

//бізнес логіка

@Service
class OrderServiceImpl : OrderService {
    override fun getAllOrder(): List<OrderStorage> {
        return listOf(
            //OrderStorage(1,"nnn"),
            //OrderStorage(2,"1efdfe")
        )
    }
}