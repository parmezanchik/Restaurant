//Клас клієнтів, вхідні дані: Ім'я, тип String; Номер столика, цілочисельний тип; Остаточна ціна, тип Float; Список страв, тип String
//У класі є методи для розрахунку ціни та списку страв.
class Clients(var name : String,var table_num : Int,var total_price: Float = 0.toFloat(),var list_of_dishes : String = "") {

    //Функція розрахунку ціни, приймає значення ціни і сумує до основної змінної
    fun add_price(price : Float) {
        if(price > 0) //якщо ціна > 0 то значення приймається, в іншому випадку виведення помилки
            total_price += price
        else
            print("Ціна не може бути більше 0")
    }

    //Функція створення листу з назв страв, приймає значення страви і додає до строки
    fun add_list_dishes(dish : String) {
        list_of_dishes += "$dish "
    }

}