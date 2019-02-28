public class QueueLL<D> implements Queue<D>{
    ListObject<D> head,tail; Integer size;
     QueueLL(){
        size = 0;
        head = null;
        tail = null;
        }
      public void enqueue(D o){
        ListObject<D> ob = new ListObject<D>(o);
        if(head == null){
            head = ob;
            tail = ob;
        }
        else{
            tail.next = ob;
            tail = ob;
        }
        size++;
        }  
        public D dequeue(){
            Object o = head.val;
            head = head.next;
            return (D)o;
        }
        public int size(){
            return size;
        }
}