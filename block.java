class Main 
{
    // Static block
    static {
        System.out.println("This is a static block.");
    }

    // Instance variables
    private int id;
    private String name;

    // Default constructor
    public Main() {
        System.out.println("This is the default constructor.");
		System.out.println(name+ " " +id);
    }

    // Parameterized constructor
    public Main(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("This is the parameterized constructor.");
    }
	public void disp()
	{
		System.out.println(name+ " " +id);
	}
}
class block
{
    // Main method
    public static void main(String[] args) {
        // Create an object using the default constructor
        Main obj1 = new Main();

        // Create an object using the parameterized constructor
        Main obj2 = new Main(10, "David");
		obj2.disp();

        // Print the values of the instance variables
        //System.out.println("obj1.id: " + obj1.id);
        //System.out.println("obj1.name: " + obj1.name);
        //System.out.println("obj2.id: " + obj2.id);
        //System.out.println("obj2.name: " + obj2.name);
    }
}