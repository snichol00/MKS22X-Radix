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
  public E getData(){
    return data;
  }

  public Node<E> next(){
    return next;
  }

  public Node prev(){
    return prev;
  }
}
