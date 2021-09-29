public class Main { 
  public static void main(String[] args) 
  { 
    System.out.println("Welcome to Java program to add two binary numbers"); 
    Scanner scnr = new Scanner(System.in); 
    System.out.println("Please enter first binary number"); 
    String first = scnr.nextLine(); 
    System.out.println("Please enter second binary number"); 
    String second = scnr.nextLine(); 
    String difference = subtract(first, second); 
    System.out.println("difference between two binary number is : " + difference); 
    scnr.close(); 
  }
