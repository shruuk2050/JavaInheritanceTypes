class Animal
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Dog extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  
class Cat extends Dog
{  
	void meow()
	{
		System.out.println("meowing...");
	}  
}  
class HierarchicalInheritance
{  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		c.bark(); 
	}
}  