# Composite structural Design Pattern

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

```
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
```


## When to Use the Composite Pattern?
1. When you need to represent a hierarchical structure (e.g., tree-based structures like file systems, UI components, or organizational structures).
2. When both individual objects and composite objects should be treated uniformly.
3. When you need to perform operations recursively on the entire structure.

## Key Components of Composite Pattern
1. Component (Common Interface/Abstract Class)
   - Declares the interface for all objects in the composition.
Both Leaf and Composite must implement this interface.
2. Leaf (Individual Object)
   - Represents an individual object in the hierarchy.Implements the common interface but does not contain child objects.
3. Composite (Container Object)
   - Can contain child objects, both Leaf and Composite.
   Implements methods to manage child objects (add, remove, getChildren, etc.).


