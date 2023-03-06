public class Main {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        //list.addLast(564);
        System.out.println(list.asString());
        list.solve(3);
    }
}