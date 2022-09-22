import java.util.Random;

public class Duplicate {
    public static void main(String[] args) {
      int []  array1= new int[10];
      int [] array2=new int[10];
        Random rand= new Random();
      for (int i=0;i<10;i++)
      {array1[i]= rand.nextInt(10);
      array2[i]= rand.nextInt(20);
      System.out.println(" array1 item "+array1[i]+" array2 item "+array2[i]);}
        for (int i=0;i<10;i++)
        { for (int j=0;j<10;j++)
        {if(array2[j]==array1[i]*2)
        {System.out.println("The number in array2 "+array2[j]+" is duplicated number of array1 "+array1[i]);}
        }
    }}
}
