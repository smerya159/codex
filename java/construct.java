import java.util.Scanner;

public class construct {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int pcheck = 0;
int mcheck = 0;
int num1 = 0;
int num2 = 0;
int num3 = 0;
int num4 = 0;
int num5 = 0;
int prod = 0;
int ave1 = 0;
int ave2 =0;
System.out.print("positive/negative checker: ");
pcheck = input.nextInt();




// positive or negative start
// positive or negative end

//month swtich

System.out.print("number to month converter: ");
mcheck = input.nextInt();


// product and average
System.out.println("please input 5 numbers to get the product and average:");
num1 = input.nextInt();
num2 = input.nextInt();
num3 = input.nextInt();
num4 = input.nextInt();
num5 = input.nextInt();

prod = (num1 * num2 * num3 * num4 * num5);
ave1 = (num1 + num2 + num3 + num4 + num5);
ave2 = (ave1 /5);



// output

System.out.println("==============================================");
System.out.println("                 == OUTPUT==");
System.out.println("==============================================");

//poscheck
System.out.println("your number is: " + pcheck);
if (pcheck >= 0) {
System.out.println("your number is positive");
}else{
System.out.println("your number is negative");
}
System.out.println("");

//poscheck

// moncheck
System.out.print("your month number is: ");
System.out.println(mcheck);
switch (mcheck) {
case 1:
	System.out.println("your month is January");
	break;
case 2:
	System.out.println("your month is February");
	break;
case 3:
	System.out.println("your month isMarch");
	break;
case 4: 
	System.out.println("your month is April");
	break;
case 5:
	System.out.println("your month is May");
	break;
case 6:
	System.out.println("your month is June");
	break;
case 7:
	System.out.println("your month is July");
	break;
case 8:
	System.out.println("your month is August");
	break;
case 9:
	System.out.println("your month is September");
	break;
case 10:
	System.out.println("your month is October");
	break;
case 11:
	System.out.println("your month is November");
	break;
case 12:
	System.out.println("your month is December");
	break;
}
System.out.println("");

//moncheck

//prod/ave
System.out.println("your numbers are:");
System.out.print("num1: ");
System.out.print("("+num1+")");
System.out.print(" num2: ");
System.out.print("("+num2+")");
System.out.print(" num3: ");
System.out.print("("+num3+")");
System.out.print(" num4: ");
System.out.print("("+num4+")");
System.out.print(" num5: ");
System.out.println("("+num5+")");
System.out.println("");
System.out.print("your product is: ");
System.out.println(prod);
System.out.print("your average is: ");
System.out.println(ave2);
//prod/ave
System.out.println("==============================================");
System.out.println("==============================================");


} // argus
} // class 


