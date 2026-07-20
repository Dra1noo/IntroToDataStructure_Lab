import java.util.LinkedList;
import java.util.Queue;

/**
 * Data Structures Lab 2: Queue - Customer Service Queue System
 * 
 * This lab demonstrates how Queue works through a customer service simulation.
 * You'll learn about:
 * - Creating queues using LinkedList
 * - Adding elements to the queue (offer/add)
 * - Removing elements from the queue (poll/remove)
 * - Peeking at the front element (peek/element)
 * - Checking queue properties (size, isEmpty)
 * - FIFO (First In, First Out) behavior
 * 
 * Instructions:
 * 1. Read each section carefully
 * 2. Uncomment the code blocks marked with TODO
 * 3. Fill in any missing variable names or method calls
 * 4. Run the program and observe the FIFO behavior
 */
public class QueueLab {
    
    public static void main(String[] args) {
        System.out.println("=== CUSTOMER SERVICE QUEUE SYSTEM ===");
        System.out.println("Learning Queue operations through customer service simulation\n");
        
        // ========== SECTION 1: Creating the Queue ==========
        System.out.println("1. Setting up the customer service queue...");
        
        // TODO: Create a Queue of String called customerQueue, use LinkedList class as the implementation
        Queue<String> customerQueue = new LinkedList<>();

        System.out.println("   Queue created successfully!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println();
        
        // ========== SECTION 2: Customers Arriving (Adding to Queue) ==========
        System.out.println("2. Customers arriving at the service desk...");
        
        // TODO: Add 5 customers to the queue using the offer() method
        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        customerQueue.offer("Diana");
        customerQueue.offer("Eve");

        System.out.println("   Customers added to queue!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Current queue: " + customerQueue);
        System.out.println();
        
        // ========== SECTION 3: Checking Who's Next (Peek Operations) ==========
        System.out.println("3. Checking who's next in line...");
        
        // TODO: Use peek() method to see who's next in line, store in String variable called nextCustomer
        String nextCustomer = customerQueue.peek();

        System.out.println("   Next customer to be served: " + nextCustomer);
        System.out.println("   Queue after peek: " + customerQueue); //showing that the queue didn't change
        System.out.println("   Queue size after peek: " + customerQueue.size());
        System.out.println("   (Notice: peek doesn't remove the element!)");
        System.out.println();
        
        // ========== SECTION 4: Serving Customers (Removing from Queue) ==========
        System.out.println("4. Serving customers one by one...");
        
        // TODO: Use poll() method to serve the first customer, print the result
        // Format: "   Serving customer: " + [result of poll()]
        System.out.println("   Serving customer: " + customerQueue.poll());


        // printing the queue state and size
        System.out.println("   Queue after serving the first customer: " + customerQueue);
        System.out.println("   Queue size after serving the first customer: " + customerQueue.size());

        
        System.out.println();
        
        // TODO: Serve another customer using poll(), print the result and queue state
        System.out.println("   Serving customer: " + customerQueue.poll());
        System.out.println("   Queue after serving the second customer: " + customerQueue);
        System.out.println("   Queue size after serving the second customer: " + customerQueue.size());

        System.out.println();
        
        // ========== SECTION 5: More Customers Arriving ==========
        System.out.println("5. More customers arriving while others are being served...");
        
        // TODO: Add 2 more customers to the queue using offer()
        customerQueue.offer("Frank");
        customerQueue.offer("Grace");

        System.out.println("   New customers added!");
        System.out.println("   Updated queue: " + customerQueue);
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println();
        
        // ========== SECTION 6: Processing All Remaining Customers ==========
        System.out.println("6. Processing all remaining customers...");
        
        // TODO: Create a while loop to process all remaining customers
        // While the queue is not empty, poll() a customer and print:
        // "   Serving: " + [customer name]
        // "   Remaining in queue: " + [queue size]
        while (!customerQueue.isEmpty()) {
            System.out.println("   Serving: " + customerQueue.poll());
            System.out.println("   Remaining in queue: " + customerQueue.size());
        }

        System.out.println();
        
        // ========== SECTION 7: Queue Operations with Empty Queue ==========
        System.out.println("7. Testing operations on empty queue...");
        
        System.out.println("   Queue after serving all customers: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Queue size: " + customerQueue.size());
        
        // TODO: Test empty queue behavior
        String emptyPeek = customerQueue.peek();
        String emptyPoll = customerQueue.poll();

        System.out.println("   Peek on empty queue: " + emptyPeek);
        System.out.println("   Poll on empty queue: " + emptyPoll);
        System.out.println("   (Notice: peek() and poll() return null for empty queue)");
        System.out.println();
        
        // ========== SECTION 8: Demonstrating FIFO Behavior ==========
        System.out.println("8. Demonstrating FIFO (First In, First Out) behavior...");
        
        // TODO: Uncomment the code below to demonstrate FIFO
        System.out.println("   Adding customers in order: John, Jane, Jack");
        customerQueue.offer("John");
        customerQueue.offer("Jane");
        customerQueue.offer("Jack");

        System.out.println("   Queue: " + customerQueue);
        System.out.println("   Serving in FIFO order:");
        System.out.println("   First out: " + customerQueue.poll());
        System.out.println("   Second out: " + customerQueue.poll());
        System.out.println("   Third out: " + customerQueue.poll());
        
        System.out.println();
        
        // ========== SECTION 9: Summary ==========
        System.out.println("9. Customer service session summary:");
        System.out.println("   Final queue state: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Final queue size: " + customerQueue.size());
        
        System.out.println("\n=== LAB COMPLETE ===");
        
    }
}