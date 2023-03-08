class Cat (
    name: String,
    weight: String,
    var color: String
): Animal(name, weight) {
    fun run(){
        print("Chạy bằng 4 chân")
    }

//    override fun printInfo() {
//        println("Cat printInfo")
//    }
}