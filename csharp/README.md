# Swap Vowels - C# Implementation

## Description
This is a C# implementation of the Swap Vowels algorithm using the two-pointer technique.

## How to Run

### With .NET:
```bash
dotnet run
```

### With Mono Compiler (if available):
```bash
# Compile
mcs Program.cs

# Run on Windows
SwapVowels.exe

# Run on Linux/Mac
mono SwapVowels.exe
```

### With csc (Visual Studio):
```bash
csc Program.cs
SwapVowels.exe
```

## Code Structure
- `Swap(string str)`: Main method that swaps vowels in a string
- `IsVowel(char c)`: Helper method to check if a character is a vowel

## Requirements
- .NET 8.0 or higher, OR
- Mono runtime, OR
- Visual Studio with C# compiler

## Example Output
```
Input:  "hello"
Output: "holle"

Input:  "leetcode"
Output: "leotcede"
```

## Notes
- Uses modern C# features
- Fully documented with XML documentation comments
- Compatible with .NET Core, .NET Framework, and Mono
