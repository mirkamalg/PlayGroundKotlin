fun main() {
    while (true) {
        print("Enter the number to calculate its factorial (negative number to exit)\n")
        try {
            val input = readLine()!!.toInt()
            if (input >= 0) {
                println(calculateFactorial(input))
                continue
            } else {
                println("Ending..")
                break
            }
        } catch (e: Exception) {
            println("Incorrect input")
            continue
        }
    }
}

fun calculateFactorial(number:Int): Long {
    val n = number
    var result: Long = 1
    for (i in 1..n) {
        result *= i.toLong()
    }
    return result
}