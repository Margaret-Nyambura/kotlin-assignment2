fun main() {
    getfullName("hello", "world")
    getfullName("hello", "Nairobi")
    getfullName("hello", "Margaret")
    getfullName("hello", "AnitaB")



    remainder(67, 20)
    remainder(36, 7)
    remainder(90, 8)

    add(89, 76, 43, 90)

    fact("I", "love", "watching", "horror" ,"movies", "alone")


}
fun getfullName(name1:String, name2:String){
    println(name1+ " " + name2)


}
fun remainder(num1:Int, num2:Int){
    println(num1 % num2)
}
fun add(num1:Int, num2:Int, num3:Int,num4:Int){

    println(num1 + num2 + num3 + num4)
}
fun fact(fact1:String, fact2:String, fact3:String, fact4:String, fact5:String, fact6:String){1
    println(fact1 + " " + fact2 + " " + fact3 + " " + fact4 + " " + fact5 + " " + fact6)
}