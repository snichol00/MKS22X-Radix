public class MyLinkedList<E>{
  private int size;
  private Node<E> start,end;

  //Constructor
  public MyLinkedList(){
    size = 0;
    start = null;
    end = null;
  }

  public void add(E value){
    if (size == 0){
      Node<E> only = new Node<E>(value, null, null);
      end = only;
      start = only;
      size++;
    }
    else{
      //creates new node to set value to
      Node<E> endAddition = new Node<E>(value, end, null);
      end.setNext(endAddition);
      //makes sure end is updated
      end = endAddition;
      size++;
    }
  }

  public String toString(){
    if (size == 0){
      return "[]";
    }
    String output = "[";
    //currentNode acts like the index, but uses next()
    Node current = start;
    //when next() is null, you've reached the end
    while (current.next() != null){
      output += current.data() + ", ";
      //iterate the current, like doing x++
      current = current.next();
    }
    //won't account for last comma
    return output + end.data() + "]";
  }

  public void clear(){
    size = 0;
    start = null;
    end = null;
  }

  public int size(){
    return size;
  }

  public Node<E> start(){
    return start;
  }

  public void extend(MyLinkedList other){
    if(size == 0){
      start = other.start;
      end = other.end;
    }
    else if(other.size != 0){
        //in O(1) runtime, move the elements from other onto the end of this
        this.end.setNext(other.start);
        other.start.setPrev(this.end);
        end = other.end;
    }
    //The size of this is now the combined sizes of both original lists
    size += other.size;
    //The size of other is reduced to 0
    other.clear();
  }
  public E iterator(Node<E> node){
    return node.next().data();
  }
}
