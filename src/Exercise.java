import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) throws Exception {



 
           
            /**
             * @param args
             */
             
                ///Ex1
             Scanner scanStart=new Scanner(System.in);
             Scanner scanEnd=new Scanner(System.in);
            
        
             System.out.println("Input the start: ");
             int start = scanStart.nextInt();
             System.out.println("Input the end: ");
             int end = scanEnd.nextInt();
        
            for(int i=start; i<=end; i++){
            System.out.println(i);
            };
        
           scanStart.close();
           scanEnd.close();
            
        ////////Ex2
            Scanner scanN=new Scanner(System.in);
        
            System.out.println("Input the N: ");
        
            int num=scanN.nextInt();
            int sum=num*(num+1)/2;
        
            System.out.println("The sum of 1 to " +num+ "is" +sum);
            
            scanN.close();
        
              ///Ex3
              Scanner scanStr=new Scanner(System.in);
        
              System.out.println("Enter a word: ");
              String word=scanStr.next();
              int i=1;
              while(i<=word.length()){
                  System.out.println(word);
                  i++;
              }
              scanStr.close();
        //E/x4
         Scanner addNum=new Scanner(System.in);
         Scanner enterNum=new Scanner(System.in);
         System.out.println("How many integers will be added?");
         int num1=addNum.nextInt();
         int sum1=0;
         int j=1;
        while(j<=num1){
        
        System.out.println("Enter an integer");
        sum1 +=enterNum.nextInt();
        j++;
        
        }
        
        System.out.printf("%11s%d%n", "The sum is ", sum1);
        
        addNum.close();
        
        enterNum.close();
        
        };
        };

