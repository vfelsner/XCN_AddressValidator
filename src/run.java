public class run
{

	public static void test(String str)
	{
		if (XCN_AddressValidator.ValidateAddress(str))
			System.out.println(str + "\t:\tYES!");
		else
			System.out.println(str + "\t:\tNO!");
	}

	public static void main(String[] args)
	{
		// Valid addresses
		test("CT49DTNo5itqYoAD6XTGyTKbe8z5nGY2D5");
		test("CGTta3M4t3yXu8uRgkKvaWd2d8DQvDPnpL");
		test("Cco3zGiEJMyz3wrndEr6wg5cm1oUAbBoR2");
		test("CPzmjGCDEdQuRffmbpkrYQtSiUAm4oZJgt");
		test("CT49DTNo5itqYoAD6XTGyTKbe8z5nGY2D5");

		// invalid ones
		test("CT49DTNo5itqYoAD6XTGyTKbe8z5nGY2D4");
		test("CGTta3M4t3yXu8uRgkKvaWd2d8DQvDPnpl");
		test("Cco3zGiEJMyz3wrndEr6wg5cm1oUAbBoR1");
		test("CPzmjGCDEdQuRffmbpkrYQtSiUAm4oZJgT");
		test("CT49DTNo5itqYoAD6XTGyTKbe8z5nGY2Da");
		test("");
		test("asdasd");
		test("cT49DTNo5itqYoAD6XTGyTKbe8z5nGY2Da");
		test("No5itqYoAD6XTGyTKbe8z5nGY2Da");
	}

}
