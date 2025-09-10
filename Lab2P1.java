import java.util.Scanner;
class Lab2P1{
	public static void main(String...args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a value");
	int a=s.nextInt();
	/*s.nextLine();
	System.out.println("enter unary operator");
	String op=s.nextLine();
	switch(op){
		case "++":System.out.println("post inc:"+(a++)+"\t"+"pre inc:"+(++a));
			 break;
		case "--":System.out.println("post dec:"+(a--)+"\t"+"pre dec:"+(--a));
			break;
		case "+":a=+a;	
		         System.out.println("pov sign:"+(+a));
			break;
		case "-":a=-a;
		         System.out.println("neg sign:"+(-a));
			break;
		case "~":System.out.println("complement:"+(-a));
			break;	
		default:System.out.println("sorry you entered a wrong operator");
			break;
		}*/
	System.out.println("output is:"+(a++ + ++a));
		
	}	
}							 
