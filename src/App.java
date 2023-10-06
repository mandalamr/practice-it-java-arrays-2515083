import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    double [] loterryNums={12,34,42,56,68};
    System.out.println(loterryNums[2]);
    loterryNums [4]=80;
    System.out.println(loterryNums[4]);
    System.out.println("**********************");
    int[] arr= new int[] {12,14,16,18,20};

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);

    }
    System.out.println();

    //Reverse an array

    int[] array=new int[]{12,14,16,18,20};
    //System.out.printl("***********************");
    for(int i=array.length-1;i>=0;i--){
      System.out.println(array[i]);
    }
    System.out.println();

    //For each loop:With this type of loop we donot have access
    //to the index but we do have acess in each item of the array
    //It is simpler approach but we have less control on how
    //we iterate through the structure
    // In newer versions of Java  we use Java streams

    for(int item: array){
      System.out.println(item);
    }
    System.out.println();

    //Java Streams

    Arrays.stream(array).forEach(System.out::println);
    //Arrays.stream(array).filter();
    
  }
}