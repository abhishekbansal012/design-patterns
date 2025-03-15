# State Behavioral Design Pattern

The State behavioral design pattern allows an object to change its behavior when its internal state changes. It encapsulates state-specific behavior into separate classes, making the object appear as if it changes its class dynamically.

## Key Concepts
### 1. Context 
The main object whose behavior varies depending on its internal state.
## 2. State Interface
Defines the behavior that different state implementations must provide.
### 3. Concrete States
Implementations of the state interface that define specific behaviors.

## How It Works
1. Instead of using multiple if-else or switch statements to handle different states, the object delegates state-dependent behavior to separate state classes.
2. The Context holds a reference to the current State and delegates requests to it.
3. The State classes handle transitions between states.