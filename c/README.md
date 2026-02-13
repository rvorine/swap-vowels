# Swap Vowels - C Implementation

## Description
This is a C implementation of the Swap Vowels algorithm using the two-pointer technique.

## How to Run

### Compile:
```bash
gcc swap_vowels.c -o swap_vowels
```

### Execute:
```bash
./swap_vowels
```

## Code Structure
- `swap_vowels(char* str)`: Main function that swaps vowels in a string (modifies in-place)
- `is_vowel(char c)`: Helper function to check if a character is a vowel

## Requirements
- GCC compiler or any C compiler (C99 or later)
- Standard C library

## Example Output
```
Input:  "hello"
Output: "holle"

Input:  "leetcode"
Output: "leotcede"
```

## Notes
- The function modifies the input string in-place
- Uses the `stdbool.h` library for boolean types
- Handles both uppercase and lowercase vowels
