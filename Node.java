public class Node<E>{
  private E data;
  private Node next,prev;

  //Constructor
  public Node(E myData, Node nextNode, Node prevNode) {
    data = myData;
    next = nextNode;
    prev = prevNode;
  }

  public boolean hasNext(){
    if(next == null){
      return false;
    }
    return true;
  }

  //Accessors
  public E data(){
    return data;
  }

  public Node next(){
    return next;
  }

  public Node prev(){
    return prev;
  }

  //Mutators
  public void setData(E value){
    data = value;
  }

  public void setNext(Node nextNode){
    next = nextNode;
  }

  public void setPrev(Node prevNode){
    prev = prevNode;
  }
}
