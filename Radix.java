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
    //first digit copies from array
    for(int i = 0; i < data.length; i++){
      //get digit from number
      int dig = data[i] % 10;
      //add to correct bucket
      buckets[dig + 9].add(data[i]);
    }
    //temp to store values
    MyLinkedList<Integer> temp = new MyLinkedList<Integer>();
    //goes through rest of digits
    int digits = max(data);
    //looping through digits
    for (int d = 1; d <= digits; d++){
      Node<Integer> node = temp.start();
      int num = node.data();
      int dig = num / (int)(Math.pow(10, d)) % 10;
      buckets[dig + 9].add(num);
      //looping through and placing numbers in bucket
      while(node.hasNext()){
        // gets the digit
        dig = num / (int)(Math.pow(10, d)) % 10;
        node = node.next();
        num = node.data();
        // adds num to appropriate bucket
        buckets[dig + 9].add(num);
      }
    }
    for (int i = 0; i < 20; i++) {
      temp.extend(buckets[i]);
    }
    Node<Integer> node = temp.start();
    //set first value
    data[0] = node.data();
    //keeps track of index for data to loop through
    int idx = 1;
    //loop through linked list and copy into data
    while(node.hasNext()){
      node = node.next();
      data[idx] = node.data();
      idx++;
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
