# Finding the Matching Text

If matches are found, the following methods on the `Matcher` provide information on the match:
- `start()`, `end()`: returns the character position in the string of the starting and ending characters that matched.
- `groupCount()`: returns the number of parenthesized capture groups. Return 0 if no groups were used.
- `group(int i)`: returns the characters matched by group `i` of the current match. `group(0)` or `group()` returns 
the entire portion of the input that matched
- `start(int i)`, `end(int i)`: return the starting and ending position of the capture group