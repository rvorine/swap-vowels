# Swap Vowels - Kotlin Implementation

## Description
This is a Kotlin implementation of the Swap Vowels algorithm using the two-pointer technique.

## How to Run

### Compile and Run with JAR:
```bash
kotlinc SwapVowels.kt -include-runtime -d SwapVowels.jar
java -jar SwapVowels.jar
```

### Run as Kotlin Script (if kotlin command is available):
```bash
kotlin SwapVowels.kt
```

## Code Structure
- `swapVowels(str: String)`: Main function that swaps vowels in a string
- `isVowel(c: Char)`: Helper function to check if a character is a vowel

## Requirements
- Kotlin compiler (kotlinc)
- JRE/JDK 8 or higher

## Example Output
```
Input:  "hello"
Output: "holle"

Input:  "leetcode"
Output: "leotcede"
```

## Features
- Modern Kotlin syntax
- Idiomatic Kotlin code using `in` operator
- Extension functions for character manipulation
- Null-safe by default
