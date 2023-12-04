package src.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import src.service.OrderService
import src.storages.OrderStorage

@RestController
@RequestMapping("/api/Order")

class OrderController(
    private val OrderService:OrderService
    ) {

    @GetMapping
    fun getAllOrder(): List<OrderStorage> = OrderService.getAllOrder()



    @PostMapping
    fun create(@RequestBody OrderStorage: OrderStorage) {

    }

    @PutMapping("/{id}")
    fun update(
        @PathVariable id: Int,
        @RequestBody OrderStorage: OrderStorage,
    ) {

    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int) {

    }
}