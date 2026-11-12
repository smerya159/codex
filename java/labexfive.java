import java.util.Scanner

public class labexfive {
	public static void  main(String[] args) {
	Scanner input = new Scanner(System.in);
String cname = "name";        // cashier name
String cpos = "position";     // cashier position
int piattos = 0;              // piattos pack
int ccase = 0;                // coke cases
double rkg = 0;               // rice kg
int cbig = 0;                 // coke big pieces
int ssachet = 0;              // shampoo sachet
double mkg = 0;               // malagkit kg
int gbot = 0;                 // gin bottles
int cream = 0;                // cigarette reams


System.out.println("please input your name: ");
cname = input.nextLine();

System.out.println("please input your position: ");
cpos = input.nextLine();

System.out.println("how many are the stock of piattos in packs?: "); // piattos
piattos = input.nextInt();

System.out.println("how many are the coke cases in stock?: "); //ccase
ccase = input.nextInt();

System.out.println("how many rice in kg is left?: "); //rkg double
rkg = input.nextDouble();

System.out.println("how many 1.5L coke in stock?: ");//cbig
cbig = input.nextInt();

System.out.println("how many shampoo sachet are left?: ");//ssachet
ssachet = input.nextInt();

System.out.println("how many malagkit kg in stock?: ");//mkg double
mkg = input.nextDouble();

System.out.println("how many gin bottles in stock?: ");//gbot
gbot = input.nextInt();

System.out.println("how many cigarette reams are in stock?: ");//cream
cream = input.nextInt();






System.out.println("================================================");
System.out.println("================================================");
System.out.print("name: ");
System.out.println(cname);
System.out.print("pos");
System.out.println(cpos)
System.out.pritnln("item:               qty:");
System.out.println("piattos              = ");
system.out.print("");



}
}
