package dataStructure;

public class QueueUsingArrayClient {

	public static void main(String[] args) throws Exception {
	   QueueUsingArray queue=new QueueUsingArray(5);
       for(int i=1;i<=5;i++)   
	   queue.enqueue(i*10);
       queue.display();
     //  System.out.println(queue.front());
       
      queue.dequeue();
       queue.dequeue();
    //   System.out.println(queue.isEmpty());
    //   System.out.println(queue.front());
         queue.display();
         queue.enqueue(60);
         queue.enqueue(70);
         queue.display();
	}

}
