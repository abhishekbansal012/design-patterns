# Strategy Behavioral Design Pattern

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## Key Concepts
1. Context: Maintains a reference to a strategy object and allows the strategy to be changed dynamically.
2. Strategy Interface: Defines a common interface for all supported strategies.
3. Concrete Strategies: Implement different variations of an algorithm.


## When to Use?
1. When you need to select an algorithm at runtime.
2. When multiple classes differ only in their behavior.
3. When you want to avoid using multiple conditional statements (like if-else or switch).