/**
 * Swaps (reverses) the positions of vowels in a string
 * while keeping consonants in their original positions.
 */
fun swapVowels(str: String): String {
    if (str.length <= 1) return str
    
    val chars = str.toCharArray()
    var left = 0
    var right = chars.size - 1
    
    while (left < right) {
        // Move left pointer to the next vowel
        while (left < right && !isVowel(chars[left])) {
            left++
        }
        
        // Move right pointer to the previous vowel
        while (left < right && !isVowel(chars[right])) {
            right--
        }
        
        // Swap the vowels
        if (left < right) {
            val temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp
            left++
            right--
        }
    }
    
    return String(chars)
}

/**
 * Checks if a character is a vowel (case-insensitive)
 */
fun isVowel(c: Char): Boolean {
    val lowerC = c.lowercaseChar()
    return lowerC in "aeiou"
}

fun main() {
    // Test cases
    val testCases = listOf(
        "hello",
        "leetcode",
        "aeiou",
        "programming",
        "Swap Vowels",
        "bcdfg"
    )
    
    println("Swap Vowels - Kotlin Implementation")
    println("====================================\n")
    
    testCases.forEach { test ->
        println("Input:  \"$test\"")
        println("Output: \"${swapVowels(test)}\"")
        println()
    }
}
