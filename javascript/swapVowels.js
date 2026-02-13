/**
 * Checks if a character is a vowel (case-insensitive)
 * @param {string} c - The character to check
 * @returns {boolean} - true if the character is a vowel, false otherwise
 */
function isVowel(c) {
    const lowerC = c.toLowerCase();
    return lowerC === 'a' || lowerC === 'e' || lowerC === 'i' || 
           lowerC === 'o' || lowerC === 'u';
}

/**
 * Swaps (reverses) the positions of vowels in a string
 * while keeping consonants in their original positions.
 * @param {string} str - The input string
 * @returns {string} - The string with vowels swapped
 */
function swapVowels(str) {
    if (!str || str.length <= 1) {
        return str;
    }
    
    const chars = str.split('');
    let left = 0;
    let right = chars.length - 1;
    
    while (left < right) {
        // Move left pointer to the next vowel
        while (left < right && !isVowel(chars[left])) {
            left++;
        }
        
        // Move right pointer to the previous vowel
        while (left < right && !isVowel(chars[right])) {
            right--;
        }
        
        // Swap the vowels
        if (left < right) {
            const temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
    
    return chars.join('');
}

// Test cases
function main() {
    const testCases = [
        "hello",
        "leetcode",
        "aeiou",
        "programming",
        "Swap Vowels",
        "bcdfg"
    ];
    
    console.log("Swap Vowels - JavaScript Implementation");
    console.log("========================================\n");
    
    testCases.forEach(test => {
        console.log(`Input:  "${test}"`);
        console.log(`Output: "${swapVowels(test)}"`);
        console.log();
    });
}

// Run if executed directly (not imported as module)
if (typeof require !== 'undefined' && require.main === module) {
    main();
}

// Export for use as module
if (typeof module !== 'undefined' && module.exports) {
    module.exports = { swapVowels, isVowel };
}
