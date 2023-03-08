class PizzaStore {
    fun orderPizza(pizza: Pizza){
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
    }
    fun donePizza(pizza: Pizza){
        pizza.done()
    }
}