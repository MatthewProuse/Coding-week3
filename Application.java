
public class Application {

  public static void main1(String[] args) {
    // TODO Auto-generated method stub

   
   
      {
              int last=0,first=0;
              Object arr;
              for(int i=0; i<arr.length; i++)
              {
                  if( i==0)
                      {
                                        first=arr[i];
                      }
                 
                       else{
                                          last= arr [i];
                      }
              }
              return last-first;
      }
      
      
      
      
      //calculate sum of array elements.
      
      
      public static int calculatesum(int arr[])
      {
              int total=0;
                      for(int i=0; i<arr.length; i++)
              {
                      total+=arr[i];
              }
              return total;
      }
    
      public static String Concatenate(String word,int n)
      {
              String answer="";
              for(int i=0; i<n; i++)
              {
                      answer+= word;
              }
             
              return answer;
      } 
      
      public static String ConcatenateFirstLast(String first,String last)
      {
              return first+" "+last;
      }
     
      public static boolean isGreaterthan(int arr[])
      {
             
                     int sum=calculatesum(arr);
              
               if(sum>100)
              {
                 
                return true;
              }
             
              return false;
      }
    
      public static double Averagedouble(double arr[])
      {
              double sum=0.0;
             
              for(int i=0; i<arr.length; i++)
              {
                      sum+= arr[i];
              }
              return sum/arr.length;
      }
    
      public static boolean isGreaterAverage(double array1[],double array2[])
      {
             
              double avg1=Averagedouble(array1);
              double avg2=Averagedouble(array2);
              if(avg1>avg2)
              {
                      return true;
              }
              return false;
      }
     
      public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
      {
        
        
       // if it is hot outside and you have more than 10.50 then true.
        
              if(isHotOutside==true && moneyInPocket>10.50)
              {
                      return true;
              }
              return false;
      }
      public static void main(String []argv)
      {
            
       int[] arr =new int[]{3,9,23,64,2,8,28,93};
      
       int diff1=subtract(arr);
      
       System.out.println("Sum is " + diff1);
      
       int[] arr1=new int[]{3,9,23,64,2,8,28,93,100};
      
                    int diff2= subtract (arr1);
                    
                               System.out.println("Sum after adding new age is " + diff2);
       
       int sum=0;
       sum=calculatesum(arr1);
       
       int average=sum/arr1.length;
     
       System.out.println("Average number is " + average);
      
       String name[]={" Sam"," Tommy"," Tim"," Sally"," Buck"," Bob"};
      
       int count=0;
       for(int i=0;i<name.length;i++)
       {
              String temp=name[i];
              count+=temp.length();
       }
       int word=count/name.length;
       
       System.out.println("Average letters are " + word);
      
       String concat="";
       for(int i=0;i<name.length;i++)
       {
              concat+=name[i];
              concat+=" ";
       }
       
       System.out.println("the string together is  " + concat);
       
       int []nameLengths= new int[name.length];
       for(int i=0; i<name.length; i++)
       {
              String temp= name[i];
              nameLengths[i]= temp.length();
              
              
              
              
       }
       // calculate the sum
       
       
       int sumLength=calculatesum(nameLengths);
      
       System.out.println("Sum of lengths are "+sumLength);
      
                   String hello=Concatenate("Hello",3);
                           System.out.println("hello typed out three times "+hello);
      
       String names=ConcatenateFirstLast("Matthew","Prouse");
       System.out.println("First and last name " + names);
       
       if(isGreaterthan(arr))
       {
         
         
       
                             System.out.println("Sum is greater than 100");
       }
       
       
       else{
              
         
                            System.out.println("Sum is not greater than 100");
       }
       
       
       
             double[] darray=new double[]{1.12,9.6,5.4,3,18.7,0.6};
                         double avgdouble=Averagedouble(darray);
       
       
                          System.out.println("Average is " + avgdouble);
      
        double[] darray1=new double[]{1.0,7.0,5.4,3,12.7};
       if(isGreaterAverage(darray,darray1))
       {
              System.out.println("First average is greater ");
       }
       else{
               
         System.out.println("Second average is greater ");
       }
       
       if(willBuyDrink(true,11.76))
       {
                 System.out.println("Buy the drink");
       }
       else{
                    System.out.println("Can't buy the drink");
       }
      
}
      private static int subtract(int[] arr) {
        // TODO Auto-generated method stub
        return 0;
      }
 }
  

