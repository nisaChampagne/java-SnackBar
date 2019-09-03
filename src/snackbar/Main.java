package snackbar;

public class Main
{
	private static void processSnackapp()
	{
		Customer Fiona = new Customer(1, "Fiona", 45.25);
		Customer Robert = new Customer(2, "robert", 33.14);

		VendingMachine Food = new VendingMachine(1, "Food");
		VendingMachine Drink = new VendingMachine(2, "Drink");
		VendingMachine Office = new VendingMachine(3, "Office");

		Snack Pringles = new Snack(1, "pringles", 36, 1.75, Food.getId());
		Snack Twix = new Snack(2,"twix", 36, 1.00, Food.getId()); 
		Snack Jerky = new Snack(3, "jerky", 30, 2.00, Food.getId());

		Snack Pop = new Snack(4, "pop", 24, 2.50, Drink.getId());
		Snack Water = new Snack(5, "water", 20, 2.75, Drink.getId());


		////problem 1 w/pop
		Fiona.buySnack(Pop.getCost(3));
		Pop.buySnack(3);
		System.out.println("Fiona is pretty thirsty");
		System.out.println("there are"+Pop.getQuantity()+ " pops left in the vending machine");
		System.out.println("Fiona has $"+Fiona.getCash()+"left");
		System.out.println("-----------END#1----");


        ///problem 2 w/jerky
		Fiona.buySnack(Jerky.getCost(1));
		Jerky.buySnack(1);
		System.out.println("Fiona is pretty hungry");
		System.out.println("Fiona has $"+Fiona.getCash()+" left");
		System.out.println("there are " + Jerky.getQuantity()+" jerky bags left in the VendingMachine");
		System.out.println("-----------END#2----");

		//problem 3 w/Robert and pop
		Robert.buySnack(Pop.getCost(2));
		Pop.buySnack(2);
		System.out.println("Robert saw Fiona grab like 3 pops and thought that would hit the spot");
		System.out.println("Robert has $"+Robert.getCash()+"left");
		System.out.println("there are "+Pop.getQuantity()+ "pops left in the vending machine");
		System.out.println("-----------END#3----");

		///problem 4 with fiona finding $10
		System.out.println("Its Fionas lucky day, she found  ten bucks by the vending machine");
		Fiona.addCash(10.00);
		System.out.println("Fiona now has $"+Fiona.getCash());
		System.out.println("--------END#4");

		///problem 5 fiona buys twix
		Fiona.buySnack(Twix.getCost(1));
		Twix.buySnack(1);
		System.out.println("Fiona wants something sweet even though she started her diet like two hours ago");
		System.out.println("there is "+ Twix.getQuantity()+" more twixs left");
        System.out.println("fiona now has $"+Fiona.getCash());
        System.out.println("--------END#5-----");

        ///problem 6 restocking jerky
        System.out.println("restocking jerky!");
        Jerky.addQuantity(12);
        System.out.println("new inventory for jerky = "+ Jerky.getQuantity());
        System.out.println("--------END#6---------");


        ///problem 7 Robert buys jerky
        Robert.buySnack(Jerky.getCost(3));
        Jerky.buySnack(3);
        System.out.println("Robert wants some jerky");
        System.out.println("there are "+ Jerky.getQuantity()+ " containers of jerky left");
        System.out.println("Robert has $"+Robert.getCash());
        System.out.println("---------END#7--------");
	}

	public static void main(String[] args)
	{
		processSnackapp();
	}
}