interface Queue<D>{
    public void enqueue(D o);
    public D dequeue();
    public int size();
}