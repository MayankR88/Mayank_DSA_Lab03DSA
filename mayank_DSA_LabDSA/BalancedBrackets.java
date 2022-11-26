//Answer to Question No.1

package mayank_DSA_LabDSA;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BalancedBrackets {   
    
      
    public static void main(String[] args)   
    {   
          
        String inputStr;   
          
        Deque<Character> deque = new LinkedList<>();   
          
        Scanner sc = new Scanner(System.in);   
          
        System.out.print("Enter an expression to check whether it is balanced or not: \n");   
        inputStr = sc.nextLine();   
          
       
        sc.close();   
          
       
        for(char ch : inputStr.toCharArray()) {   
            
            if(ch == '{' || ch == '[' || ch == '(') {   
                deque.add(ch);   
            } else {   
                
                if(! deque.isEmpty()) {   
                    if((deque.peekFirst() == '{' && ch == '}')   
                       || (deque.peekFirst() == '[' && ch == ']')   
                       || (deque.peekFirst() == '(' && ch == ')')) {   
                           deque.removeFirst();   
                       }   
                }else {   
                    System.out.println("The entered Strings do not contain Balanced Brackets");   
                }   
            }   
        }   
        System.out.println("The entered String has Balanced Brackets");   
    }   
}   