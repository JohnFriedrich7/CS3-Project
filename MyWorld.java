import mayflower.*;

public class MyWorld extends World {

    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    private Block block;
    private Block block2;
	
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	cat = new Cat();
    	addObject(cat, 400, 100);
    	
    	dog = new Dog();
    	addObject(dog, 100, 10);
    	
    	ninja = new Ninja();
    	addObject(ninja, 300, 20);
    	
    	jack = new Jack();
    	addObject(jack, 40, 30);
    	
    	block = new Block();
    	addObject(block, 400, 500);
    	
    	block2 = new Block();
    	addObject(block2, 528, 372);
    }
    
    public void act()
    {
    }
    
}