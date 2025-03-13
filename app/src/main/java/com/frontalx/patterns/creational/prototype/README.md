# Prototype Design Pattern

## Problem Prototype Pattern Solves

Imagine you want to create an exact duplicate of an object. 
To do this, you would typically create a new object of the same class and then manually copy the values of all fields 
from the original object to the new one.

However, there are a few challenges with this approach. 
One issue is that some fields might be private, making them inaccessible from outside the object itself. 
Another problem is that this method requires knowing the object's class, 
which can make your code dependent on that specific class. 

Additionally, if you only know the interface an object implements 
(for example, when a method parameter accepts any object that follows a certain interface), 
you might not even know the concrete class of the object.

## Solution

The Prototype pattern delegates the cloning process to the actual objects that are being cloned. 
The pattern declares a common interface for all objects that support cloning. 
This interface lets you clone an object without coupling your code to the class of that object. 
Usually, such an interface contains just a single clone method.

The implementation of the clone method is very similar in all classes. 
The method creates an object of the current class and carries over all of the field values of the old object into the new one. 
You can even copy private fields because most programming languages let objects access private fields of other objects that belong to the same class.

An object that supports cloning is called a prototype. 
When your objects have dozens of fields and hundreds of possible configurations, 
cloning them might serve as an alternative to subclassing.

### The Prototype pattern is available in Java out of the box with a Cloneable interface.