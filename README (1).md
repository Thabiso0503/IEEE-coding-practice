# Problem 4: Word Ordering

## Overview

Sort a list of strings using a custom alphabet provided as input instead of the normal English alphabetical order. Lowercase letters are ordered according to the custom alphabet, while uppercase letters are treated as greater than lowercase letters.

## Approach

Create a rank array containing the position of each lowercase letter in the custom alphabet. Then use a custom Java comparator to compare strings character by character.

The comparison handles:

1. Different letter cases.
2. Custom alphabet ranking.
3. Prefixes, where the shorter string comes first.

## Concepts

- Strings
- Arrays
- Custom comparators
- Lexicographical ordering
- Character handling
- Sorting

## Complexity

Approximately **`O(N log N × L)`**, where `N` is the number of strings and `L` is the average comparison length.

**Space:** `O(N)` excluding the input strings.
