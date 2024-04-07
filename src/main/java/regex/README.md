# Regex Metacharacter Syntax

General

| Subexpression | Matches | 
| - | - | 
| `\^` | Start of line/string | 
| `$` | End of line/string | 
| `\b` | Word boundary | 
| `\B` | Not a word boundary | 
| `\A` | Beginning of entire string | 
| `\z` | End of entire string | 
| `\Z` | End of entire string (except allowable final line terminator) |
| `.` | Any one character (except line terminator) |
| `[...]` | "Character class"; any one character from those listed |
| `[\^...]` | Any one character not from those listed |

Alternation and grouping

| Subexpression | Matches |
|---------------| - |
| `(...)`       | Grouping (capture group) |
| `\|`          | Alternation |
| `(?:_re_)`    | Nocapturing parenthesis |
| `\G`          | End of previous match |
| `+\+n`        | Back-reference to capture group number `n` |

Normal (greedy) quantifier

| Subexpression   | Matches                                                                      |
|-----------------|------------------------------------------------------------------------------|
| `{m, n}`        | Quantifier for from `m` to `n` repetitions                                   |
| `{m,}`          | Quantifier for `m` or more repetitions                                       |
| `{m}`           | Quantifier for exact `m` repetitions                                         |
| `{, n}`         | Quantifier for 0 up to `n` repetitions                                       |
| `\*` or `{0,}`  | Quantifier for 0 or more repetitions                                         |
| `+`  or `{1,}`  | Quantifier for 1 or more repetitions                                         |
| `?`  or `{0,1}` | Quantifier for 0 or 1 repetitions (i.e., present exactly once or not at all) |

Reluctant (nongreedy) quantifier

| Subexpression    | Matches                                                                      |
|------------------|------------------------------------------------------------------------------|
| `{m, n}?`        | Reluctant quantifier for from `m` to `n` repetitions                         |
| `{m,}?`          | Reluctant quantifier for `m` or more repetitions                                       |
| `{, n}?`         | Reluctant quantifier for 0 up to `n` repetitions                                       |
| `\*?`            | Reluctant quantifier for 0 or more repetitions                                         |
| `+?`  | Reluctant quantifier for 1 or more repetitions                                         |
| `??` | Reluctant quantifier for 0 or 1 repetitions |

Progressive (very greedy) quantifier

| Subexpression | Matches                                                                      |
|---------------|------------------------------------------------------------------------------|
| `{m, n}+`     | Progressive quantifier for from `m` to `n` repetitions                         |
| `{m,}+`       | Progressive quantifier for `m` or more repetitions                                       |
| `{, n}+`      | Progressive quantifier for 0 up to `n` repetitions                                       |
| `\*+`         | Progressive quantifier for 0 or more repetitions                                         |
| `++`          | Progressive quantifier for 1 or more repetitions                                         |
| `?+`          | Progressive quantifier for 0 or 1 repetitions |

Escapes and shorthands

| Subexpression | Matches                                                                      |
|---------------|------------------------------------------------------------------------------|
| `\ `          | Escape (quote) characters: turns most metacharacters off; turns subsequent alphabetic into matacharacters |
| `\Q`          | Escape (quote) all characters up to `\E` |
| `\t`          | Tab character |
| `\r`          | Return (carriage return) character |
| `\n`          | Newline character |
| `\f`          | Format feed |
| `\w`          | Character in a word, use `\w+` for a word |
| `\d`          | Numeric digit, use `\d+` for an integer |
| `\D` | A nondigit character |
| `\s` | Whitespace: space, tab, etc. as determined by `java.lang.Character.isWhitespace()` |
| `\S` | A nonwhitespace character |

Unicode blocks (representative samples)

| Subexpression | Matches                                                                      |
|---------------|------------------------------------------------------------------------------|
| `\p{InGreek}` | A character in the Greek block |
| `\P{InGreek}` | Any character not in the Greek block |
| `\p{Lu}` | An uppercase letter |
| `\p{Sc}` | A currency symbol |

POSIX-style character classes (defined only for US-ASCII)

| Subexpression | Matches                                                               |
|---------------|-----------------------------------------------------------------------|
| `\p{Alnum}`   | Alphanumeric characters `[A-za-z0-9]`                                 |
| `\p{Alpha}`   | Alphabetic characters `[A-za-z]`                                      |
| `\p{ASCII}`   | Any ASCII character `[\x00-\x7F]`                                     |
| `\p{Blank}`   | Space and tab characters                                              |
| `\p{Cntrl}`   | Control character `[\x00-\x1F\x7F]`                                   |
| `\p{Digit}`   | Numeric digit characters `[0-9]`                                      |
| `\p{Graph}`   | Printable and visible characters (not spaces or control characters)   |
| `\p{Print}`   | Printable character, same as `\p{Graph}`                              |
| `\p{Punct}`   | Punctuation character, one of `!"#$%&'()\*+-,./:;<=>?@[]\^_``{\|}\\~` |
| `\p{Lower}`   | Lowercase character `[a-z]`                                           |
| `\p{Upper}`   | Uppercase character `[A-Z]`                                           |
| `\p{XDigit}`  | Hexadecimal digit characters `[0-9a-fA-F]`                            |