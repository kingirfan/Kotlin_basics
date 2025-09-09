package collections

fun main(){
    countTo100()
}

fun countTo100() : String {
    var number = StringBuilder()
    for (i in 1..99){
        number.append(i)
        number.append(",  ")
    }
    number.append(100)
    print(number)
    return number.toString()
}