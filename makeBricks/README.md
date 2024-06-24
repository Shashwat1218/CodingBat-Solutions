# makeBricks

We want to make a row of bricks that is `goal` inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). The function `makeBricks(small, big, goal)` returns `true` if it is possible to make the `goal` by choosing from the given bricks, otherwise `false`.

### Example Scenarios:

- `makeBricks(3, 1, 8)` → returns `true`
  - Explanation: We have 3 small bricks and 1 big brick. We can use 1 big brick (5 inches) and 3 small bricks (totaling 8 inches) to reach the goal of 8 inches.

- `makeBricks(3, 1, 9)` → returns `false`
  - Explanation: With 3 small bricks and 1 big brick, the maximum length we can make is 8 inches (using 1 big brick and 3 small bricks). Hence, it's not possible to reach a goal of 9 inches.

- `makeBricks(3, 2, 10)` → returns `true`
  - Explanation: We have 3 small bricks and 2 big bricks. We can use 2 big bricks (10 inches) to directly reach the goal of 10 inches.

### Additional Notes:
- If the number of small and big bricks is not sufficient to reach the exact `goal`, the function should return `false`.
- The problem can be solved without using any loops, focusing instead on arithmetic calculations and condition checks.
