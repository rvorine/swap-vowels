# Swap Vowels

A collection of implementations for the "Swap Vowels" problem in multiple programming languages.

## Problem Statement

Given a string, swap (reverse) the positions of all vowels in the string while keeping consonants in their original positions.

**Vowels**: a, e, i, o, u (both uppercase and lowercase)

### Examples

| Input | Output | Explanation |
|-------|--------|-------------|
| `"hello"` | `"holle"` | Vowels 'e' and 'o' are swapped |
| `"leetcode"` | `"leotcede"` | Vowels 'e', 'e', 'o', 'e' → 'e', 'o', 'e', 'e' |
| `"aeiou"` | `"uoiea"` | All vowels are reversed |
| `"programming"` | `"pragrammong"` | Vowels 'o', 'a', 'i' → 'i', 'a', 'o' |
| `"bcdfg"` | `"bcdfg"` | No vowels, string remains unchanged |

## Algorithm

The solution uses a **two-pointer approach**:

1. Initialize two pointers: one at the start (left) and one at the end (right) of the string
2. Move the left pointer forward until it finds a vowel
3. Move the right pointer backward until it finds a vowel
4. Swap the vowels at both pointers
5. Continue until the pointers meet or cross each other

**Time Complexity**: O(n) - where n is the length of the string  
**Space Complexity**: O(n) - for converting string to character array

## Implementations

This repository contains implementations in the following programming languages:

### 1. Java
**Location**: [`java/SwapVowels.java`](java/SwapVowels.java)

**Run**:
```bash
cd java
javac SwapVowels.java
java SwapVowels
```

### 2. Kotlin
**Location**: [`kotlin/SwapVowels.kt`](kotlin/SwapVowels.kt)

**Run**:
```bash
cd kotlin
kotlinc SwapVowels.kt -include-runtime -d SwapVowels.jar
java -jar SwapVowels.jar
```

Or with Kotlin script:
```bash
cd kotlin
kotlin SwapVowels.kt
```

### 3. C
**Location**: [`c/swap_vowels.c`](c/swap_vowels.c)

**Run**:
```bash
cd c
gcc swap_vowels.c -o swap_vowels
./swap_vowels
```

### 4. C#
**Location**: [`csharp/SwapVowels.cs`](csharp/SwapVowels.cs)

**Run**:
```bash
cd csharp
csc SwapVowels.cs
./SwapVowels.exe  # Windows
mono SwapVowels.exe  # Linux/Mac
```

Or with .NET:
```bash
cd csharp
dotnet run
```

### 5. JavaScript
**Location**: [`javascript/swapVowels.js`](javascript/swapVowels.js)

**Run**:
```bash
cd javascript
node swapVowels.js
```

### 6. Python
**Location**: [`python/swap_vowels.py`](python/swap_vowels.py)

**Run**:
```bash
cd python
python swap_vowels.py
```

Or:
```bash
cd python
python3 swap_vowels.py
```

## Repository Structure

```
swap-vowels/
├── README.md
├── java/
│   └── SwapVowels.java
├── kotlin/
│   └── SwapVowels.kt
├── c/
│   └── swap_vowels.c
├── csharp/
│   └── SwapVowels.cs
├── javascript/
│   └── swapVowels.js
└── python/
    └── swap_vowels.py
```

## Key Features

- ✅ Handles both uppercase and lowercase vowels
- ✅ Preserves the case of each character
- ✅ Works with empty strings and strings with no vowels
- ✅ Efficient two-pointer algorithm with O(n) time complexity
- ✅ Clean, readable code with proper documentation

## Contributing

Feel free to contribute by:
- Adding implementations in other programming languages
- Improving existing implementations
- Adding more test cases
- Fixing bugs or improving documentation

## Connect With Me

Follow me on social media for more coding content:

- 🎥 **YouTube**: [@rvorine](https://youtube.com/@rvorine)
- 📸 **Instagram**: [@lacopydepastel](https://instagram.com/lacopydepastel)

---

## License

This project is open source and available for educational purposes.

**Tags**: #SwapVowels #TwoPointers #StringManipulation #CodingInterview #Algorithm #Java #Kotlin #C #CSharp #JavaScript #Python #@rvorine #lacopydepastel