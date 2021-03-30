
class StringOfChars {

    /**Creating of Strings(Char arrays)*/
    fun readCharArray(): CharArray = readLine()?.toCharArray()!!

    /**Concatenating strings by summing each*/
    fun concatenateCharArrays(first: CharArray, second: CharArray): CharArray = first + second

    /**Circumcising string by deleting symbols at the end*/
    fun circumciseCharArrays(array: CharArray, index: Int): CharArray {
        val copyArray = CharArray(array.size - index)
        for (i in 0 until array.size - index) {
            copyArray[i] = array[i]
        }
        return copyArray
    }

    /**Searching method that finding first coincidence and compares every next value of finding text*/
    fun searchInArray(withing: CharArray, finding: CharArray): Boolean {
        var i = withing.indexOf(finding[0])
        var j = 0
        if (i != -1) {
            while (j < finding.size) {
                if (finding[j] == withing[i]) {
                    j++
                    i++
                } else break
            }
        }
        return j == finding.size
    }

    fun intToCharArray(value: Int): CharArray = value.toString().toCharArray()

    fun arrayToFloat(array: CharArray): Float = java.lang.Float.parseFloat(String(array))
}