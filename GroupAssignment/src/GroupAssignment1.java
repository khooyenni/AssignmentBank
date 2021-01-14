import java.util.Scanner;
public class GroupAssignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		PersonalInformation();
		
	}
	
	public static void PersonalInformation () {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Personal Information:");
		
		System.out.print("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age : " + age);
		System.out.println();
		
		if(age>=18) {
			System.out.println("Congratulation, you are eligible to apply the bank service." );
			System.out.println();
			
			System.out.print("Enter your name :");
			String name = in.next();
			
			System.out.print("Enter your gender :");
			String gender = in.next();
			
			System.out.print("Enter your marital :");
			String marital = in.next();
			
			System.out.println();
			
			String[][] personal = { {"Name\t: ", "Gender\t: ", "Marital\t: "},
									{name, gender, marital}
			};
			
			Q1Array(personal);
			
			System.out.println();
			
			System.out.println("Please enter the number of service:");
			System.out.println("1. Business Loan \n2. Personal Account \n3. Credit Card \n4. Housing Loan \n5. Investment");
			System.out.print("Your choice:");
			int service = in.nextInt();
			System.out.println();
			
			if (service>0 && service<=1) {
				System.out.println("The service you choose is Business Loan");
			}
			else if (service>1 && service<=2) {
				System.out.println("The service you choose is Personal Account");
			}
			else if (service>2 && service<=3) {
				System.out.println("The service you choose is Credit Card");
			}
			else if (service>3 && service<=4) {
				System.out.println("The service you choose is Housing Loan");
			}
			else if (service>4 && service<=5) {
				System.out.println("The service you choose is Investment");
				Investment();
			}
			else {
				System.out.println("Please enter the valid number");
			}
			
			System.out.println();
			
		}else
			System.out.print("Sorry, you are not eligible to apply the bank service.");
		System.out.println();
		
	}

	public static void Investment () {
		Scanner in = new Scanner (System.in);
		Q2();
		Q3();
		Q4();
		
		in.close();
	}
	
	public static void Q1Array (String [][] x) {
		System.out.println(x[0][0] + x[1][0]);
		System.out.println(x[0][1] + x[1][1]);
		System.out.println(x[0][2] + x[1][2]);
		
	}
	
	public static void Q2 () {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the investment provide :");
		String invest1 = in.next();
		String invest2 = in.next();
		String invest3 = in.next();
		String invest4 = in.next();
		String invest5 = in.next();
		
		System.out.println();
		
		System.out.println("Investment provided :");
		String[] investmentprovide = {invest1, invest2, invest3, invest4, invest5};
		
		Q2Array(investmentprovide);
		
		System.out.println();
		
	}
	
	public static void Q2Array (String [] y) {
		int j=0;
		while (j<y.length) {
			System.out.println(y[j]);
			j++;
		}
	}
	
	public static void Q3 () {
		System.out.println("Price of investment :");
		String[][] investment = { {"Price of per property\t\t: ", "Price of per stock\t\t: ", "Price of gold per kg\t\t: ", "Price of bonds per year\t\t: ", "Price of annuity per year\t: "},
								{"RM 760000", "RM 150", "RM 7600", "RM 98", "RM 200"}
		};
		
		Q3Array(investment);
		System.out.println();
	}

	public static void Q3Array(String [][] z) {
		System.out.println(z[0][0] + z[1][0]);
		System.out.println(z[0][1] + z[1][1]);
		System.out.println(z[0][2] + z[1][2]);
		System.out.println(z[0][3] + z[1][3]);
		System.out.println(z[0][4] + z[1][4]);
	}

	public static void Q4 () {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter the number of investment:");
		int items = in.nextInt();
		System.out.print("Enter price of first investment:");
		double price1 = in.nextDouble();
		System.out.print("Enter quantity of first investment:");
		int quantity1 = in.nextInt();
		System.out.println();
		
		if (items<=2) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = ((price1*quantity1) + (price2*quantity2));
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>100000) {
				double discount = totalprice/100*10;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		if (items>2 && items<=3) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3);
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>200000) {
				double discount = totalprice/100*20;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
		
		
		if (items>3 && items<=4) {
			System.out.print("Enter price of second investment:");
			double price2 = in.nextDouble();
			System.out.print("Enter quantity of second investment:");
			int quantity2 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of third investment:");
			double price3 = in.nextDouble();
			System.out.print("Enter quantity of third investment:");
			int quantity3 = in.nextInt();
			System.out.println();
			
			System.out.print("Enter price of fourth investment:");
			double price4 = in.nextDouble();
			System.out.print("Enter quantity of fourth investment:");
			int quantity4 = in.nextInt();
			System.out.println();
			
			System.out.println("5.");
			double totalprice = (price1*quantity1) + (price2*quantity2) + (price3*quantity3) + (price4*quantity4);
			System.out.printf("Total price		:RM%.2f" , totalprice);
			System.out.println();
			
			if (totalprice>300000) {
				double discount = totalprice/100*30;
				System.out.printf("Discount received	:RM%.2f" , discount);
				System.out.println();
				double paid = totalprice-discount;
				System.out.printf("Price to be paid	:RM%.2f" , paid);
			}
			else {
				System.out.printf("Price to be paid	:RM%.2f" , totalprice);
			}
			
		}
	}
}