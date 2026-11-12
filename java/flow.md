
javac <name>
compile the code

java <name>
take note, you dont have to put the ".java" file type on the name
run the code

flow:
nano <file name> .java -- create file
<write code>           -- write code
javac <file name.java> -- compile code
java <file name>       -- run code


file sample:

import java.util.Scanner

public class <file name> {
public static void main(String[] args) {
 
String reply = "asdasd"
Scanner input = new Scanner(System.in);
 System.out.print("hello world?");
 reply = input.nextLine();
System.out.println(reply);

} 
}
