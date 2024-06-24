# blackjack

Given two integer values greater than 0, the function `blackjack(int a, int b)` returns whichever value is nearest to 21 without going over. If both values exceed 21, it returns 0.

### Example Scenarios:

- `blackjack(19, 21)` → returns `21`
  - Explanation: Both values are under 21, but 21 is closer to 21 itself compared to 19.

- `blackjack(21, 19)` → returns `21`
  - Explanation: Both values are under 21, but 21 is closer to 21 itself compared to 19.

- `blackjack(19, 22)` → returns `19`
  - Explanation: 19 is under 21, while 22 exceeds 21, making 19 the closest valid value.

- `blackjack(23, 22)` → returns `0`
  - Explanation: Both values exceed 21, so the function returns 0.