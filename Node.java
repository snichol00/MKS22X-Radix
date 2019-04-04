public class Node<E>{
  private E data;
  private Node<E> next,prev;

  //Constructor
  public Node(E myData, Node<E> nextNode, Node<E> prevNode) {
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

  public Node<E> next(){
    return next;
  }

  public Node prev(){
    return prev;
  }

  //Mutators
  public E setData(E value){
    E output = data;
    data = value;
    return output;
  }

  public void setNext(Node<E> nextNode){
    next = nextNode;
  }

  public void setPrev(Node<E> prevNode){
    prev = prevNode;
  }

  public String toString(){
    return "" + data;
  }
}
