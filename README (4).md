# Problem 2: Greatest Common Divisor

## Overview

Find the greatest common divisor (GCD) of two positive integers.

## Approach

Use the **Euclidean Algorithm**. Repeatedly replace the pair with `(B, A % B)` until `B` becomes zero. The remaining value of `A` is the GCD.

## Concepts

- Loops
- Modulo operator
- Euclidean Algorithm
- Mathematical problem solving

## Complexity

**Time:** `O(log(min(A, B)))`  
**Space:** `O(1)`
