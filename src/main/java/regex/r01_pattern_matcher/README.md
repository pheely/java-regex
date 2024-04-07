# `Pattern` and `Matcher`

The normal steps for regex matching are as follows:
1. Create a `Pattern` by calling the static method `Pattern.compile()`
2. Request a `Matcher` from the `Pattern` by calling `pattern.matcher(CharSequence)` 
for each `String` or `CharSequence`
3. Call one of the finder methods in the resulting `Matcher`.

Alternatively, we can use the convenience methods defined in the `Pattern` or `String` class.
This approach is convenient if the regex is used only once.

The `Matcher` has several finder methods:
1. `match()` - compare the entire string against the pattern
2. `lookingAt()` - match the pattern at the beginning of the string
3. `find()` - match the pattern in the string (not necessarily at the beginning of the string),
starting at the beginning of the string or, if the method was previously called and succeeded, 
at the fist character not matched by the previous match