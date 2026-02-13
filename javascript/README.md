# Swap Vowels - JavaScript Implementation

## Description
This is a JavaScript implementation of the Swap Vowels algorithm using the two-pointer technique.

## How to Run

### With Node.js:
```bash
node swapVowels.js
```

### In a Browser:
Include the script in your HTML file:
```html
<script src="swapVowels.js"></script>
<script>
    const result = swapVowels("hello");
    console.log(result);  // Output: "holle"
</script>
```

## Code Structure
- `swapVowels(str)`: Main function that swaps vowels in a string
- `isVowel(c)`: Helper function to check if a character is a vowel

## Requirements
- Node.js (for command-line execution)
- Or any modern web browser (for browser execution)

## Example Output
```
Input:  "hello"
Output: "holle"

Input:  "leetcode"
Output: "leotcede"
```

## Usage as Module
The code can be imported as a CommonJS module:
```javascript
const { swapVowels } = require('./swapVowels');

const result = swapVowels("hello");
console.log(result);  // Output: "holle"
```
