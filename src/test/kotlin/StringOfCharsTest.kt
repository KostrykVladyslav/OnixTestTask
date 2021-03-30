@file:Suppress("DEPRECATION")
import junit.framework.Assert.assertEquals
import org.junit.Test

internal class StringOfCharsTest {

    @Test
    fun concatenateCharArrays() {
        val first = charArrayOf('a', 'c')
        val second = charArrayOf('a', 'b', 'c','n')

        assertEquals(
            first.joinToString("") + second.joinToString(""),
            StringOfChars().concatenateCharArrays(first, second).joinToString("")
        )

        val first1 = charArrayOf('a', 'c','a', 'c','1','6','.')
        val second1 = charArrayOf('a', 'b', 'c','n')

        assertEquals(
            first1.joinToString("") + second1.joinToString(""),
            StringOfChars().concatenateCharArrays(first1, second1).joinToString("")
        )
    }

    @Test
    fun circumciseCharArrays() {
        val input = charArrayOf('a', 'b', 'c', 'a', 'b', 'c')
        val res = charArrayOf('a', 'b', 'c')

        assertEquals(
            res.joinToString(""),
            StringOfChars().circumciseCharArrays(input, 3).joinToString("")
        )

        val input1 = charArrayOf('a', '2', 'c', '2', '3', '1','7','7','0')
        val res1 = charArrayOf('a', '2')

        assertEquals(
            res1.joinToString(""),
            StringOfChars().circumciseCharArrays(input1, 7).joinToString("")
        )
    }

    @Test
    fun searchInArray() {
        val withing = charArrayOf('a', 'b', 'h', 'i', 'y', 'z')
        val finding = charArrayOf('b', 'h', 'i')

        assertEquals(true, StringOfChars().searchInArray(withing,finding))

        val withing1 = charArrayOf('1', '3', '4', '5', '1', '1')
        val finding1 = charArrayOf('4', '4', '4')

        assertEquals(false, StringOfChars().searchInArray(withing1,finding1))


    }

    @Test
    fun intToCharArray() {
        val value = 556
        assertEquals(charArrayOf('5', '5', '6').joinToString(""),
            StringOfChars().intToCharArray(value).joinToString(""))

        val value1 = 4568
        assertEquals(charArrayOf('4','5','6','8').joinToString(""),
            StringOfChars().intToCharArray(value1).joinToString(""))

    }

    @Test
    fun arrayToFloat() {
        val array = charArrayOf('5','6','2','.','8')
        assertEquals(562.8.toFloat(), StringOfChars().arrayToFloat(array))

        val array1 = charArrayOf('5','6')
        assertEquals(56.toFloat(), StringOfChars().arrayToFloat(array1))
    }
}