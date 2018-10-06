#DESIGN PATTERN INTERVIEW QUESTIONS

#### 1. GIVE AN EXAMPLE WHERE YOU PREFER ABSTRACT CLASS OVER INTERFACE?

This is common but yet tricky design interview question. both interface and abstract class
follow "writing code for interface than implementation" design principle which adds flexibility
in code, quite important to tackle with changing requirement. here are some pointers which help
you to answer this question:

###### R1: In Java you can only extend one class but implement multiple interface. So if you extend a class you lost your chance of extending another class.
###### R2: Interface are used to represent adjective or behavior e.g. Runnable, Clonable, Serializable etc, so if you use an abstract class to represent behavior your class can not be Runnable and Clonable at same time because you can not extend two class in Java but if you use interface your class can have multiple behavior at same time.
###### R3: On time critical application prefer abstract class is slightly faster than interface.
###### R4: If there is a genuine common behavior across the inheritance hierarchy which can be coded better at one place than abstract class is preferred choice. Some time interface and abstract class can work together also where defining function in interface and default functionality on abstract class.


#### 2. You have a Smartphone class and will have derived classes like IPhone, AndroidPhone,WindowsMobilePhone can be even phone names with brand, how would you design this system of Classes.
This is another design pattern exercise where you need to apply your object oriented design skill to come with a design which is flexible enough to support future products and stable enough to support changes in existing model.
        
#### 3. When do you overload a method in Java and when do you override it?
###### R: Rather a simple question for experienced designer in Java. if you see different implementation of a class has different way of doing certain thing than overriding is the way to go while overloading is doing same thing but with different input. method signature varies in case of overloading but not in case of overriding in java.
        

#### 4. Design ATM Machine ?
We all use ATM (Automated Teller Machine) , Just think how will you design an ATM ? for designing
financial system one must requirement is that they should work as expected in all situation. so no
matter whether its power outage ATM should maintain correct state (transactions), think about locking,
transaction, error condition, boundary condition etc. even if you not able to come up exact design but
if you be able to point out non functional requirement, raise some question , think about boundary
condition will be good progress.
        
#### 5. You are writing classes to provide Market Data and you know that you can switch to different vendors overtime like Reuters, wombat and may be even to direct exchange feed , how do you design your Market Data system.
This is very interesting design interview question and actually asked in one of big investment bank and
rather common scenario if you have been writing code in Java. Key point is you will have a MarketData
interface which will have methods required by client e.g. getBid(), getPrice(), getLevel() etc and MarketData
should be composed with a MarketDataProvider by using dependency injection. So when you change your MarketData
provider Client won't get affected because they access method form MarketData interface or class.
        










