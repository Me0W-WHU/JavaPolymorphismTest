# Java Polymorphism Test

This demo shows that an object declared as a certain interface can only call methods defined in that interface. 

Even if the object is been instantiated by a class which implements the interface and has extended methods (Cat in this case), the object cannot call the extended methods (Cat.work() in this case) unless it is downcast to the implementation class.
