package Collection;

import java.util.PriorityQueue;

public class Priority 
{
public static void main(String args[])
{
	        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
	        pQueue.add(10);
	        pQueue.add(20);
	        pQueue.add(15);

	        System.out.println(pQueue.peek()); // prints 10
	        System.out.println(pQueue.poll()); // prints 10
	        System.out.println(pQueue.peek()); // prints 15
	    }
	}