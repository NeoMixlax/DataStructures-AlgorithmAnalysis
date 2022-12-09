public class Main {

    public static void main(String[] args) {
        StackWithQueue myStack = new StackWithQueue();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("size: "+myStack.size());
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
    }
}