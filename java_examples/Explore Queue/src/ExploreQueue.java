import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExploreQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> i = new LinkedList<Integer>();
		Integer ten = 10;
		i.add(ten);
		i.add(7);
		i.add(ten);
		i.offer(98);
		i.offer(64);
		i.offer(1);
		i.offer(79);
		
		Integer firstInLine = i.remove();
		
		Queue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(ten);
		pq.add(7);
		pq.add(ten);
		pq.offer(98);
		pq.offer(64);
		pq.offer(1);
		pq.offer(79);
		
		pq.remove(ten);
		
		firstInLine = i.remove();
		
		pq.element();
	}

}
