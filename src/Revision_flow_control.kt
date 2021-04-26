fun main(arg:Array<String>) {
    var Jeannine=Person()
    Jeannine.think()
    Jeannine.think()
    var a=2
    var b=20
    println(max(a,b))
    DataType()
    number()
}
open class Human{
    open fun think(){
        println("Real thinking")
    }
}
class Person:Human()
{
override fun think(){
    println("Virtual thinking")
}
}
fun max(a:Int,b:Int):Int{
   if (a >b){
       return a
   }
  else if(a==b){
      return 0
   }
    else{

   }
   return b
}
fun DataType(){
    var arrayAny=arrayOf<Any?>(2,4.09,6F,"Hhhh","true",6.0)
    for (i in arrayAny) // for loop
        println(i)
//        when(i){
//            is String->println("Is string")
//            is Int->println("is Int")
//            is Float->println("Is Float")
//            is Boolean->println("Is Boolean")
//            is Double->println("Is Double")
//            else->println("Is null")
//        }
}
fun number(){
var arraySafety=arrayOf(2,3,4,5,7)
    val iter=arraySafety.iterator()
    do{
        val y=iter.next()
        println(y)
    }
        while (y != null)
}
// how to brake the loop

