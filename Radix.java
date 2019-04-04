import java.util.*;
@SuppressWarnings({"unchecked", "rawtypes"})

public class Radix{

  public static void radixsort(int[]data){
    @SuppressWarnings("unchecked")
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    //initialize buckets
    for(int i = 0; i < buckets.length; i++){
      buckets[i] = new MyLinkedList<Integer>();
    }
    //temp to store values
    MyLinkedList<Integer> temp = new MyLinkedList<Integer>();
    //goes through rest of digits
    int digits = max(data);

    //looping through digits
    for (int d = 1; d <= digits; d++){
      if (d == 1){
        //first digit copies from array
        for(int i = 0; i < data.length; i++){
          int num = data[i];
          int dig = (int)(num / (Math.pow(10,d - 1))) % 10;
          //add to correct bucket
          buckets[dig + 9].add(data[i]);
        }
        temp.clear();
        for (int i = 0; i < buckets.length; i++) {
          temp.extend(buckets[i]);
          buckets[i].clear();
        }
      }
      else{
      //looping through and placing numbers in bucket
      for (int x = 0; x < data.length; x++) {
        // gets the digit
        int num = temp.remove(0);
        int dig = num / (int)(Math.pow(10, d - 1)) % 10;
        // adds num to appropriate bucket
        buckets[dig + 9].add(num);
        temp.clear();
        for (int i = 0; i < 20; i++) {
          temp.extend(buckets[i]);
          buckets[i].clear();
        }
      }
    }
  }
    for (int i = 0; i < data.length; i++) {
      data[i] = temp.remove(0);
    }
  }

  public static int max(int[]data){
    if (data.length == 0){
      return 0;
    }
    //find max
    int max = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] > max){
        max = data[i];
      }
    }
    //string will tell length
    String str = "" + max;
    return str.length() - 1;
  }
}
