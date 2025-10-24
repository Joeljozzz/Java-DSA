public class Printz{

public static void main(String[] args){
/*
System.out.println("*****");
System.out.println("   *");
System.out.println("  *");
System.out.println(" *");
System.out.println("*****");
*/

// System.out.print("*****\n   *\n  *\n *\n*****");

System.out.println("*****");
for(int i=3;i>0;i--){
System.out.println(" ".repeat(i) +"*");
}
System.out.println("*****");

}

}

/*
noncode driver logic

5 stars -> next line 3 spaces star -> nextline 2 spaces star -> nextline 1 space star nextline and then 5 stars

*/

