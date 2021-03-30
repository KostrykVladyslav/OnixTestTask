
fun main() {
    print("Choose the action \n" +
            "1: Concatenate Strings \n" +
            "2: Circumcise String \n" +
            "3: Search in the String \n" +
            "4: String to Int \n" +
            "5: String to Float - ")
    try {
        when (readLine()?.toInt()) {
            1 -> {
                print("Input 2 Strings: ")
                println(StringOfChars().concatenateCharArrays(
                    StringOfChars().readCharArray(), StringOfChars().readCharArray()
                ))
            }

            2 -> {
                print("Input String: ")
                println(StringOfChars().circumciseCharArrays(
                    StringOfChars().readCharArray(), 3
                ))
            }

            3 -> {
                print("Input withing String and then finding text: ")
                println(StringOfChars().searchInArray(
                    StringOfChars().readCharArray(), StringOfChars().readCharArray()
                ))
            }

            4 -> {
                print("Input Int: ")
                println(StringOfChars().intToCharArray(readLine()?.toInt()!!))
            }
            5 -> {
                print("Input String: ")
                println(StringOfChars().arrayToFloat(
                    StringOfChars().readCharArray()
                ))
            }
            else -> {
                println("Incorrect data, input 1-5!")
                main()
            }
        }
    } catch (e: Exception) {
        println("Incorrect data, founded incorrect symbol")
        main()
    }
}
