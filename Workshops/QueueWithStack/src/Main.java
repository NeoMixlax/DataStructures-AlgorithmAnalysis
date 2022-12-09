public class Main {

    public static void main(String[] args) {
	    QueueWithStack myQueue = new QueueWithStack();

	    myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
