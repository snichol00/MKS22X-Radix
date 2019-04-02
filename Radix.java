public class Radix{
  public void radixsort(int[]data){
    rsort(data);
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
  public void rsort(int[]data){
    @SuppressWarnings("unchecked")
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    //initialize buckets
    for(int i = 0; i < buckets.length; i++){
      buckets[i] = new MyLinkedList<Integer>();
    }
    //first digit copies from array
    for(int i = 0; i < data.length; i++){
      //get digit from number
      int dig = (int)(data[i] / (Math.pow(10, i - 1))) % 10;
      //add to correct bucket
      buckets[dig].add(data[i]);
    }
    //link lists in new linked list
    MyLinkedList<Integer> temp = buckets[0];
    for (int i = 0; i < 20; y++) {
      temp.extend(buckets[i]);
    }
    int digits = max(data);
    //looping through digits
    for (int d = 1; d <= digits; d++){
      //looping through numbers
      while(temp.next() != void){
        
      }
  }
}
