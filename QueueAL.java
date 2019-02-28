public class QueueAL<D> implements Queue<D>{
    Object arr[];
    Integer size;
    Integer buffer;
    QueueAL(){
        arr = new Object[buffer];
        size = 0;
        buffer = 10;
    }
    public void enqueue(D o){
        arr[size] = o;
        size++;
        if(size==buffer){
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for(int i = 0; i<size;i++){
                   arr2[i] = arr[i];
            }
            arr = arr2;
        }
    }
    public int size(){
        return size;
    }
    public D dequeue(){
        Object o = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = null;
        size--;
        return (D)o;
    }
}