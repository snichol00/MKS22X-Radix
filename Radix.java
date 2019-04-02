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
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    MyLinkedList<Integer> nums = new MyLinkedList;
    //initialize buckets
    for(int i = 0; i < buckets.length; i++){
      buckets[i] = new MyLinkedList<Integer>();
    }
    for (int d = 0; d < max(data); d++){
      for(int i = 0; i < data.length; i++){

      }
    }
  }
}
