class PizzaChese: Pizza() {
    override fun prepare() {
        println("PizzaChese prepare")
    }

    override fun bake() {
        println("PizzaChese bake")
    }

    override fun cut() {
        println("PizzaChese cut")
    }

    override fun box() {
        println("PizzaChese box")
    }

    override fun done() {
        println("PizzaChese have done!")
    }
}