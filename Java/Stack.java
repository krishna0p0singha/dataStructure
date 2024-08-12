public class Stack {
    private int [] items;
    private int top;
    private int capacity;
    Stack(int capacity){
        this.capacity=capacity;
        items=new int[capacity];
        top=-1;
    }
    public void push(int element){
        if(top== capacity-1){
            System.out.println("Stack is Full");
        }
        items[++top]=element;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return items[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return items[top];
    }
    public boolean isEmpty(){
       return top==-1;
    }
    public int size(){
        return top+1;
    }
    public void clear(){
        top=-1;
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<capacity;i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
Stack st= new Stack(3);
st.push(20);
st.push(30);
st.push(50);
System.out.println(st.peek());
st.print();
st.pop();
System.out.println("After First pop "+st.peek());
st.pop();
System.out.println("After second pop "+st.peek());
st.print();
st.clear();
st.push(40);
st.push(60);
st.push(70);
st.print();
    }
}
