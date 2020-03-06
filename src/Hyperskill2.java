import java.util.Scanner;

public class Hyperskill2 {
    
        final static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello! My name is Aid.");
            System.out.println("I was created in 2018.");
            System.out.println("Please, remind me your name.");

            String name = scanner.nextLine();

            System.out.println("What a great name you have, " + name + "!");
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

            int rem3 = scanner.nextInt();
            int rem5 = scanner.nextInt();
            int rem7 = scanner.nextInt();

            int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

            System.out.println("Your age is " + age + "; that's a good time to start programming!");
            System.out.println("Now I will prove to you that I can count to any number you want.");

            int countInput = scanner.nextInt();

            
            
            int[] vars = new int[countInput];
            int count = 0;
            for(int i = 0; i < vars.length; i++) {
              
              System.out.println(count + "!");
              count++;
              if (i == vars.length - 1){
                  System.out.println(i+1 + "!");
              }
  
            }
            
            
            System.out.println("Let's test your programming knowledge.\n"
            		+ "1. To repeat a statement multiple times.\n"
            		+ "2. To decompose a program into several small subroutines.\n"
            		+ "3. To determine the execution time of a program.\n"
            		+ "4. To interrupt the execution of a program.\n");       
            
        Scanner scanner2 = new Scanner(System.in);
        int answer = scanner2.nextInt();
        
        while (answer != 1) { 
            System.out.println("Please, try again."); 
            answer = scanner2.nextInt();
        } 
        
        System.out.println("Congratulations, have a nice day!");
        
        }
        }
