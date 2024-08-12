public class Main {
    public static void main(String [] args){
        LinkedList list=new LinkedList();
        list.inserAtBegining(20);
        list.inserAtBegining(30);
        list.inserAtBegining(50);
        System.out.println("Traverse after insert at begining => ");
        list.traverse();
System.out.println(list.length());
list.reverse();
    }
}
