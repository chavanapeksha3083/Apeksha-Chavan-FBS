

interface Vehicle 
{
	
	void travel();
	
}

interface Racer 
{
	void racing();
}


interface Product
{
	
	void buy();
	void cell();
	
}

class Animal implements Product
{

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
		System.out.println("Product bought");
	}

	@Override
	public void cell() {
		// TODO Auto-generated method stub
		
		System.out.println("Product Sold");
	}

}

class Horse extends Animal implements Vehicle ,Racer
{
	
	public void travel()
	{
		System.out.println("Travelling by Horse");
	}
	
	public void racing()
	{
	  System.out.println("Racing with Horse ");	
	}
	
	
	
	
}

class Bull extends Animal implements Vehicle ,Racer
{

	@Override
	public void racing() {
		// TODO Auto-generated method stub
		System.out.println(" Travelling by bull");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		 System.out.println("Racing with bull ");
		
	}
	
	
}

class Cow extends Animal 
{
	
}

class Buffelo extends Animal
{
	
}

class Elephant extends Animal
{
	
}

class Car implements Vehicle,Racer
{

	@Override
	public void racing() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Racing by car");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println(" Travelling by car");
		
	}
	
}

class Bike implements Vehicle,Racer
{

	@Override
	public void racing() {
		// TODO Auto-generated method stub
		System.out.println("Racing with bike ");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println(" Travelling by bike");
	}
	
	
}

class TestAnimal
{
	
	public static void main(String[] args) 
	{
		Racer r1;
	
		r1= new Bike();
		r1.racing();
		r1= new Car();
		r1.racing();
	
		
		
	}
}