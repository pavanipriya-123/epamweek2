package com.epam.epamtask;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
       // System.out.println( "Hello World!" );
    	 ArrayList<Sweets> allsweets=new ArrayList<Sweets>();
         allsweets.add(new choc(10,100,"barone","brown"));
         allsweets.add( new choc(50,500,"bournvilla","dark"));
         allsweets.add( new choc(20,150,"dairymilk","brown"));
         allsweets.add(new jelly(10,5,"mango","green"));
         allsweets.add(new jelly(50,20,"strawberry","pink"));
         allsweets.add(new waffers(50,20,"gonemad","white"));
         allsweets.add(new candy(2,1,"chocalate","Brown"));
         allsweets.add(new candy(10,5,"orange","orange"));
         allsweets.add(new candy(15,15,"apple","lightyellow"));
         allsweets.add(new candy(12,8,"pineapple","yellow"));
         allsweets.add(new candy(20,10,"mango","green"));
         ArrayList<Sweets> onlychoc=new ArrayList<>();
         ArrayList<Sweets> onlycandy=new ArrayList<>();
         for(int i=0;i<allsweets.size();i++)
          {
                if(allsweets.get(i) instanceof candy)
                   onlycandy.add(allsweets.get(i));
           }
         int lessthan5=0;
         int lessthan10=0;
         int lessthan15=0;
         for(int i=0;i<onlycandy.size();i++)
         {
        	 if(onlycandy.get(i).cost<=5)
        		 lessthan5++;
        	 else  if(onlycandy.get(i).cost<=10)
        		 lessthan10++;
        	 else if(onlycandy.get(i).cost<=15)
        		 lessthan15++;
         }
         System.out.println("Candies in the predetermined range of 1-5 : "+ lessthan5);
         System.out.println("Candies in the predetermined range of 5-10 : "+ lessthan10);
         System.out.println("Candies in the predetermined range of 10-15 : "+ lessthan15);
         int totalweight=0;
         for(int i=0;i<allsweets.size();i++)
         {
             totalweight += allsweets.get(i).weight;
         }
          System.out.println("Total Sweets Weight is : "+totalweight+"gms");
          for(int i=0;i<allsweets.size();i++)
          {
              if(allsweets.get(i) instanceof choc)
              onlychoc.add(allsweets.get(i));
          }
          int jellycount=0;
          for(int i=0;i<allsweets.size();i++)
          {
              if(allsweets.get(i) instanceof jelly){
              jellycount++;
              }
          }
          
          Collections.sort(onlychoc,new sortbyweight());
          System.out.println("Jelly count is : "+ jellycount);
          for(int i=0;i<onlychoc.size();i++)
          {
              System.out.println(onlychoc.get(i).name + " "+onlychoc.get(i).weight+"gms");
          }


    }
}
