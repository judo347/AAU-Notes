# OOP-workshop, design patterns

3 slides, so the rest is *code notes*. He will be writing the code in C#.

#### Important differences

- Ingen throws-erklæringer.

- Kolon(:) i stedet for extends og implements .

  - Java: public class Number implement something
  - C#: public class Number : something 

- Metoder er default final, virual og override er keywords

  - C#: abstract: public virtual string Something();
  - C#: class: public override string Something();

- Properties i stedet for get/set

  - ```c#
    public string Name{
        get {return name;}
        set {name = value;}
    }
    
    //Short version of above
    public string Name { get; set; }
    
    //How to use it
    p.Name = "Thomas";
    string n = p.Name;
    ```

#### Starting point

- Medlemssystem
  - Klub
  - Medlemmer
  - Regninger



## Knowledge

##### Constructor (Builder Pattern)

```C#
public class Member{
    
    private string name;
    private string city;
    
    public Member WithCity(string city){
        City = city;
        return this;
    }
    
    public Member WithName(string name){
        Name = name;
        return this;
    }
}

Member m = new Member().WithCity("Aalborg").WithName("Thomas");
Member n = new Member().WithCity("Aalborg");
var members = new List<Member>(){new Member().WithName("Thomas"), new Member.WithName("Mikkel").WithCity("Aalborg")};
```

How it is done: parameter checking with builder pattern. Restrictions is "hard" to do when using a builder pattern (methods as contructor). 

```
class MemberBuilder{
    public MemberBuilder WithName(string n){
    	Name = n;
        return this;
    }
    
    public MemberBuilder WithCity(string c){
        City = c;
        return this
    }
    
    //If class have field: Birthdate. Then we could create two methods. One could take and set birthdate, the other could take an age and calculate and set birthdate.
}
```

StringBuilder is a great example.

Builder pattern using an interface. SLIDE 21-22!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#### Pattern: Fluent interface

Can be used for a fluent interface. Ex:

```
 //Without fluent interface
 Order o1 = new Order();
 customer.addOrder(o1);
 OrderLine line1 = new OrderLine(6, Product.find("TAL"));
 o1.addLine(line1);
 OrderLine line2 = new OrderLine(5, Product.find("HPK"));
 o1.addLine(line2);
 OrderLine line3 = new OrderLine(3, Product.find("LGV"));
 o1.addLine(line3);
 line2.setSkippable(true);
 o1.setRush(true);

//As fluent interface
customer.newOrder()
	.with(6, "TAL")
	.with(5, "HPK").skippable()
	.with(3, "LGV").priorityRush();
```



