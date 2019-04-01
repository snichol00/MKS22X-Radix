public class Radix{
  public void radixsort(int[]data){
    rsort(data);
  }

  public int max(int[]data){
    int max = 0;
    for (i = 0; i < data.length; i++){
      if (data[i] > max){
        max = data[i];
      }
    }
    for (x = 1; x > 0; x++){
      if (max % pow(10, x) < 0){
        return x;
      }
    }
    return 0;
  }
  public void rsort(int[]data){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[10];
    MyLinkedList<Integer> nums = new MyLinkedList;
    for (d = 0; d < max(data); d++){

    }
  }
}
