public class Radix{
  public void radixsort(int[]data){
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
      int num = node.getData();
      int dig = num / (int)(Math.pow(10, i)) % 10;
      buckets[dig + 9].add(num);
      //looping through and placing numbers in bucket
      while(node.hasNext() != void){
        // gets the digit
        dig = num / (int)(Math.pow(10, i)) % 10;
        node = node.next();
        num = node.getData();
        // adds num to appropriate bucket
        buckets[dig + 9].add(num);
      }
    }
    for (int i = 0; i < 20; y++) {
      temp.extend(buckets[i]);
    }
    Node<Integer> node = data.start();
    //set first value
    data[0] = node.getData();
    //keeps track of index for data to loop through
    int idx = 1;
    //loop through linked list and copy into data
    while(node.hasNext() != void){
      node = node.next();
      data[i] = node.getData();
      i++;
    }
  }

  public int max(int[]data){
    //find max
    int max = 0;
    for (i = 0; i < data.length; i++){
      if (data[i] > max){
        max = data[i];
      }
    }
    //find number of digits in max
    for (x = 1; x > 0; x++){
      if (max % pow(10, x) <= 0){
        return x;
      }
    }
    return 0;
  }
}
