import java.util.*;
class Test{
	public static void main(String args[]){
		ArrayDeque deque=new ArrayDeque();
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		 System.out.println(deque);

        deque.remove();
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);

	}
}