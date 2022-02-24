fun main(){
    findsum()
    findAverage()

}
fun findsum():Int{
    var a = 10
    var b =23
    var c= 12
    var d= 67
    var sum= a+b+c+d
    return sum

}
fun  findAverage(){
    var sum = findsum()
    var average =sum /4
    println(average)

}