# Design-Patterns-Tutorial-Factory
Factory pattern would be used whenever you would need a method to return one of several possible classes that share a common superclass. This pattern could be used to create an enemy in a game. It is used when: not knowing ahead of time what class objects are needed, all potential classes are of the same subclass hierarchy, to centralize class selection code, to encapsulate object creation, to prevent the user from knowing every subclass.

Unlike Factory pattern, Abstract Factory pattern has total encapsulation: the method that orders the object, the factories that build the object, the final objects, and the final objects contain objects that use the Strategy pattern which uses composition a.k.a. class fields that are objects themselves.

An abstract factory pattern allows you to create families of related objects without specifying a concrete class which is extremely important because it provides the most flexibility. Many objects can be added or changed dynamically during runtime. This can easily become quite complicated.
