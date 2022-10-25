/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abdalla OG
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        
        //Scanner reader = new Scanner(System.in);
        //String password = "RIGHT";
        //int correct = 0 ;
        //while (correct !=1)
        //{
          //  System.out.println("Enter:");
            //String user_password = reader.nextLine();
            //if(!password.equals(user_password)){
             //   System.out.println("WRONG");
            //}
            //else{
             //   correct=1;
              //  System.out.println("DOOG JOB");
            //}
        //}
        //int sum=0;
        //int num;
        //for(int i=0;i<3;i++){
          //  System.out.println("type the"+(i+1)+". number:");
            //num = Integer.parseInt(reader.nextLine());
            //sum += num;
        //}
        //System.out.println(sum);
    //}
    Scanner reader = new Scanner(System.in);
    //int sum=0;
    //int num=1;
    //while(true){
      //  System.out.println("type:");
        //num=Integer.parseInt(reader.nextLine());
        //if(num==0)
        //{
          //  break;
        //}
        //sum+=num;
    //}
   // System.out.println(sum);
    
    //System.out.println("first:");
    //int start = Integer.parseInt(reader.nextLine());
    //System.out.println("second:");
    //int end = Integer.parseInt(reader.nextLine());
    //while(start<end)
    //{
      // System.out.println(start);
       //start++;
    //}
    System.out.println("POWER!:");
    int power = Integer.parseInt(reader.nextLine());
    int sum=1;
    for(int i =1;i<=power;i++)
    {
        sum =sum+ (int)Math.pow(2, i);
    }
    System.out.println(sum);
    
    
}  
}
