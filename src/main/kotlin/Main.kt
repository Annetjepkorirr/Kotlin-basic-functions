fun main(){
    var sum = sum(43,21,23,50)
    println(sum)

    var division = division(87,78,20, 32)
    println(division)

    var product = product(76,11)
    println(product)

}

//addition
fun sum (num1: Int, num2 :Int, num3 :Int, num4: Int):Int {
    var sum= (num1+num2+num3)
    return (sum)
}
//modulus
fun division (num1: Int, num2: Int, num3: Int, num4:Int):Int{
    var division = (num1/num2/num3/num4)
    return (division)
}
//multiplication
fun product (num1: Int, num2: Int):Int{
    var product = (34*30)
    return (product)
}

