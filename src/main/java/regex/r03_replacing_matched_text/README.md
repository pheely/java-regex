# Replacing the Matched Text

The `Matcher` class provides several methods for replacing the text that matched the pattern.
- `replaceAll(newString)`
- `replaceFirst(newString)`: used in a loop, we can change each matching occurrence to a different value
- `appendReplacement(StringBuffer, newString)`: It reads characters from the input sequence, 
starting at the append position, and appends them to the StringBuffer. It stops after reading 
the last character preceding the previous match, that is, the character at index `start() - 1`. 
It appends the `newString` to the StringBuffer. It sets the append position of this matcher 
to the index of the last character matched, plus one, that is, to `end()`.
- `appendTail(StringBuffer)`: append text after the last match, normally used after `appendReplacement`
