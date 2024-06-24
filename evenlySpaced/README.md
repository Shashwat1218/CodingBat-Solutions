# evenlySpaced

## Description
Given three integers, `a`, `b`, and `c`, the function `evenlySpaced(a, b, c)` checks if these integers are evenly spaced. This means that one of the integers is the smallest, another is the medium, and the third one is the largest, with equal spacing between them.

## Examples
- `evenlySpaced(2, 4, 6)` → returns `true`
- `evenlySpaced(4, 6, 2)` → returns `true`
- `evenlySpaced(4, 6, 3)` → returns `false`

In the examples:
- The first example (`2, 4, 6`) is evenly spaced because the difference between each consecutive number (`4 - 2 = 2` and `6 - 4 = 2`) is the same.
- The second example (`4, 6, 2`) is also evenly spaced despite the different order.
- The third example (`4, 6, 3`) is not evenly spaced because the difference between `4` and `6` (`2`) is not the same as the difference between `6` and `3` (`3`).
