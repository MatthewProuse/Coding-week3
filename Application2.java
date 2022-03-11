
public class Application2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
    {
      int last=0,first=0;
      for(int i=0;i<arr.length;i++)
      {
              if(i==0)
              {
                      first=arr[i];
              }
              else{
                      last=arr[i];
              }
      }
      return last-first;
}
// method to calculate sum of array elements.
public static int calculatesum(int arr[])
{
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
              sum+=arr[i];
      }
      return sum;
}
// method to concatenate string with arguments as a word and integer
public static String Concatenate(String word,int n)
{
      String answer="";
      for(int i=0;i<n;i++)
      {
              answer+=word;
      }
      // return the answer String
      return answer;
} 
// method to concatenate two strings with a space
public static String ConcatenateFirstLast(String first,String last)
{
      return first+" "+last;
}
// method to check if sum of array element is greater than 100
public static boolean isGreaterthan(int arr[])
{
      // call calculatesum method to calculate the sum.
      int sum=calculatesum(arr);
      // if greater than 100 return true
      if(sum>100)
      {
              return true;
      }
      // else return false.
      return false;
}
// method to find average of array of double.
public static double Averagedouble(double arr[])
{
      double sum=0.0;
      for(int i=0;i<arr.length;i++)
      {
              sum+=arr[i];
      }
      return sum/arr.length;
}
// method to check if average of first array is greater
public static boolean isGreaterAverage(double array1[],double array2[])
{
      // calculate average and then compare
      double avg1=Averagedouble(array1);
      double avg2=Averagedouble(array2);
      if(avg1>avg2)
      {
              return true;
      }
      return false;
}
// willBuyDrink method
public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
{
      // if it is hot outside and money in pocket is greater than 10.50 return true.
      if(isHotOutside==true && moneyInPocket>10.50)
      {
              return true;
      }
      return false;
}
public static void main(String []argv)
{
      // create an array named arr.
int[] arr =new int[]{3,9,23,64,2,8,28,93};
// subtract first and last element;
int diff1=subtract(arr);
// print the result
System.out.println("Sum of first and last element is " + diff1);
// add new element to array
int[] arr1=new int[]{3,9,23,64,2,8,28,93,100};
// again calculate difference and print result
int diff2=subtract(arr1);
System.out.println("Sum of first and last element after adding a element is " + diff2);
// calculate the average of ages
int sum=0;
sum=calculatesum(arr1);
// average is sum divided by length of array.
int average=sum/arr1.length;
// print the result
System.out.println("Average is " + average);
// create array of string (name)
String name[]={"Sam","Tommy","Tim","Sally","Buck","Bob"};
// calculate average number of letters per name 
// count the number of characters in each string and then divide it by array size
int count=0;
for(int i=0;i<name.length;i++)
{
      String temp=name[i];
      count+=temp.length();
}
int apword=count/name.length;
System.out.println("Average number of letters per name is " + apword);
// concatenate all the names together with a space after each String
String concat="";
for(int i=0;i<name.length;i++)
{
      concat+=name[i];
      concat+=" ";
}
System.out.println("Concatenation of all String is  " + concat);
// new array named (nameLengths) for keeping record of length of each String in name array
int []nameLengths=new int[name.length];
for(int i=0;i<name.length;i++)
{
      String temp=name[i];
      nameLengths[i]=temp.length();
}
// calculate the sum of all elements in nameLengths array
int sumLength=calculatesum(nameLengths);
// print the result
System.out.println("Sum of nameLengths Array is "+sumLength);
// call the Concatenate() method to add up the strings
String conc1=Concatenate("Hello",3);
System.out.println("Concatenation of string after calling Concatenate method is "+conc1);
// call the method to concatenate first name and last name with a space 
String conc2=ConcatenateFirstLast("Xyz","LastXyz");
System.out.println("Concatenation of First and last name " + conc2);
// check if array arr have sum greater than 100 by calling isGreater function
if(isGreaterthan(arr))
{
      System.out.println("Sum is greater than 100");
}
else{
      System.out.println("Sum is not greater than 100");
}
// method to find the average of array of double
double[] darray=new double[]{1.6,9.0,5.4,3,12.7,0.99};
double avgdouble=Averagedouble(darray);
System.out.println("Average of array of double is " + avgdouble);
// check if first array have average greater than second.
double[] darray1=new double[]{1.0,7.0,5.4,3,12.7};
if(isGreaterAverage(darray,darray1))
{
      System.out.println("Average of first array is greater than second ");
}
else{
      System.out.println("Average of first array is less than second ");
}
// call willBuyDrink method 
if(willBuyDrink(true,11.76))
{
      System.out.println("You can buy Drink");
}
else{
      System.out.println("You cannot buy Drink!!");
}
}
}