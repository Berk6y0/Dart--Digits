/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Berkay BADANOZ
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        System.out.println("  "
                + "Digits Library Menu: \n" +
"1. Least significant digit   \n" +
"2. ith digit\n" +
"3. Sum of digits \n" +
"4. Count digits \n" +
"5. Remove digitK \n" +
"6. Remove digit with value \n" +
"7. Generate random number \n" +
"8. Reverse digits \n" +
"9. Check palindrome \n" +
"10. CharDigitSum\n" +
"11. Quit \n  ");
        Scanner b= new Scanner(System.in);
        System.out.print(" Choose action to perform: ");
        int s =b.nextInt();
        switch(s) {  

        
            case 1: 
                System.out.print("Enter the number to find least significant digit: ");
                int n1 = b.nextInt();
                System.out.println("significant number is "+digitZero(n1));  
               
            break;
             case 2:
                System.out.print("Enter the number to find ith digit: ");
                int n = b.nextInt();
                System.out.print("Choose .th digit: ");
                int i=b.nextInt();
                System.out.println(+i+".number is "+digitAt(+n, i));
            break;
            
            case 3 : System.out.print(" Enter the number to find digit sum:   ");
                int n3=b.nextInt();
                
                System.out.println("Enter a limit:   ");
                int l3=b.nextInt();
                System.out.print("The sum is 3"+digitSumLargerThan(n3,l3));
            break;
            case 4 :
                
                System.out.print("Enter to find how many times the number repeats ");
                int n4=b.nextInt();
                System.out.print("Enter the digit    ");
                int d4=b.nextInt();
                System.out.println(+d4+" repeats "+digitCount(n4,d4)+"times");
            break;
            case 5 : System.out.print("Enter the number to remove ");
                int n5=b.nextInt();
                System.out.print("Enter the digit to be removed ");
                int i5=b.nextInt();
                System.out.println("The new number is "+digitRemoveAt(n5,i5) );
            break;
            case 6 : System.out.print("Enter the number to remove digit with value  ");
            int n6= b.nextInt();
                System.out.print("Enter the digit");
                int d6=b.nextInt();
                 
                
                System.out.println("The new number is "+digitRemoveAll(n6,d6));
                break;
                    case 7 :System.out.print("Enter the number to check ");
                    int p=b.nextInt();
                        System.out.println(randomNumber(p));
                        
                        
                       
            break;
        case 8 : System.out.print("Enter the number for reverse form  ");
        int n8=b.nextInt();
            System.out.println("Reverse is found as: "+reverse(n8));
            break;
        case 9 : System.out.print("Enter the number to check ");
            int n9=b.nextInt();
            System.out.println(isPalindrome(n9));
            if(isPalindrome(n9)==true){
                System.out.println("This number is palindrome");
            }else{System.out.println("This number is not palindrome");}
            
            break;
        case 10:System.out.print("Enter the number to see the sum of the code equivalent of the word  ");
        String n10=b.next();
            System.out.println("The sum is  "+charDigitSum(n10));
            
            break;
        case 11:System.out.print("Ok, good bye.");
            break;
        }
        
     
 
    }


    public static int digitZero(int n){

    while(n>0){
     if(n%10!=0){
        return n%10;
     }
     
     else{
         n =n/10;
        return digitZero(n);  
      
     } 
    }
  return n;
    
    }
    public static int digitAt(int n,int i){

   String b = String.valueOf(n);
   int length = b.length();
        for (int c=i;i>0;i--) {
    n=n/10;

}
        
    
     return n%10;
    }
    public static int digitSumLargerThan(int n,int limit){
 
   int k,u=0;
        while(n>0){
 
            k=n%10;
  if(limit<k){u+=k;}
      n=n/10;

  
  
  
  }
      return u;
    
    
    
    
    }public static int digitCount(int n,int digit){
        int c=0;
        while(n>0){
        
        if(digit==n%10){//kaç tane aynı sayı var  onu buluyor
        c++;
        
        
        }
        n=n/10;       
        }
        return c;
    
    }
    public static int digitRemoveAt(int n, int i)  {
                
  int value=0;                                
   int c=0;                                   
         int place=1;                                  
     
     while (n > 0) {                                    
     if(c++!=i) {                       
     int digit=n%10;            
               value+=digit*place; //basamak kavramını kullarak sayıyı yeniden  yazdım
                place*=10;                 
                        }
                         n=n/10;                                   
 }
 
            return value;                                
        }
        public static int digitRemoveAll(int n, int digit)  {
                
  int value=0;                                
                                     
         int place=1;                                  
     
     while (n > 0) {                                    
     if(n%10!=digit) {                       
     int d=n%10;            
               value+=d*place; 
                place*=10;                 
                        }
                         n=n/10;                                   
 }
 
            return value;                                
        }
 
        public static int randomNumber(int k) {
     int numeral[]={0,1,2,3,4,5,6,7,8,9};
 int c=0;
int result=0;


   
            for(int i=0;k>i;i++){
                int n=(int) (Math.random()*10);
                int a=numeral[i];//numaral dizisinin i. elemanına a değeri koydum
                numeral[i]=numeral[n];/*swap yaptım herbiiri farklı bir array değeri olduğu için bir daha o
                değeri seçemicek numeral dan  bir sayı seçtiğinde bir daha aynı sayıyı alamayacak.*/
                numeral[n]=a;

              
               
              
            
            }
       
        for (int i = 0; i <k; i++) {
           
                boolean zero=numeral[0] !=0;//ilk basamak sıfır olmaz
               result = result+ numeral[i]*(int)Math.pow(10,c);//burda sayıyı  basamak kavramıyla  yeniden yazdırıyorum
               c++;
                if (numeral.length==k){
        break;
                  
        }

            }
        
      
           
      
      
   
            
       
          return result ;
        
            }
          

        public static int reverse(int n){
int rev=0;
           while(n>0){
       
       rev=rev*10+(n%10);//tersten yazıp basamak kavramıyla toplatıyorum.
       n=n/10;
           }
           return rev; 
        }
        public static boolean isPalindrome(int n){
   
                        
                
          
        
        if(reverse(n)==n){
            return true;
        }else{ 
            return false;
        }
   
        }

         public static int charDigitSum(String str) {
      String b = String.valueOf(str);
   int length = b.length();
   int sum=0;
            for(int c=0;length>c; c++){
                char k=str.charAt(c);
             
        int ascii =k ;
               sum += k;
            }
  
  return sum;
 }
        

        

  
    
}
