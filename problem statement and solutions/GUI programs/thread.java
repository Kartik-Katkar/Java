/**
 * thread
 */


// public class thread extends Thread {
// public static void main(String[] args) {
// thread thread = new thread();
// thread.start();
// System.out.println("This code is outside of the thread");
// }

// public void run() {
// System.out.println("This code is running in a thread");
// }
// }

// public class thread implements Runnable {
// public static void main(String[] args) {
// thread obj = new thread();
// Thread thread = new Thread(obj);
// thread.start();
// System.out.println("This code is outside of the thread");
// }
// public void run() {
// System.out.println("This code is running in a thread");
// }
// }

// public class thread extends Thread {
//     public static int amount = 0;

//     public static void main(String[] args) {
//         thread thread = new thread();
//         thread.start();
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//     }

//     public void run() {
//         amount++;
//     }
// }

// TALELE
// implementing runnable interface does not give developer any control over the thread as it simply defines
// the unit of logic that will be implemented in the thread
// By implementing the runnable interface, the class can still extend other base classes if necessary

// if the program needs more flexiblity of extending other base classes implementing the runnable interface would
// be preferable

//TALELE OVER

// To avoid concurrency problems, it is best to share as few attributes between
// threads as possible. If attributes need to be shared, one possible solution
// is to use the isAlive() method of the thread to check whether the thread has
// finished running before using any attributes that the thread can change.

// Use isAlive() to prevent concurrency problems:

// public class thread extends Thread {
//   public static int amount = 0;

//   public static void main(String[] args) {
//     thread thread = new thread();
//     thread.start();
//     // Wait for the thread to finish
//     while(thread.isAlive()) {
//     System.out.println("Waiting...");
//   }
//   // Update amount and print its value
//   System.out.println("Main: " + amount);
//   amount++;
//   System.out.println("Main: " + amount);
//   }
//   public void run() {
//     amount++;
//   }
// }


// WAP to solve producer consumer problem where there are two producer threads and one consumer thread

// write difference between t.start() and t.run()

// start method of thread class is implemented as when it is called a new Thread is created and code inside run() method 
// is executed in that new Thread. While if run method is executed directly than no new Thread is created and code inside
// run() will execute on current Thread and no multi-threading will take place.

/*
// 1	Implementation	start method of thread class is implemented as when it is called a new Thread is created and
code inside run() method is executed in that new Thread.	While if run method is executed directly than no new Thread
is created and code inside run() will execute on current Thread and no multi-threading will take place.
// 2	Definition	start method is defined in thread class and its package is java.lang.	run is a method of Runnable
interface and also define in java.lang package
// 3	Invocation	start method can't be invoked more than once on same object otherwise it will throw 
java.lang.IllegalThreadStateException.	run method on other hand do not throws any type of exception if it is being 
get called more than once.So multiple invocation is possible in case of run method.
// 4	Number of threads	As already stated that in case of calling start method a new thread is created along with
the current thread so atleast two threads are there and hence multithreading is introduced.	On other hand in case
of direct calling of run method no new thread is created and task is made to be executed on same current thread so
only one thread is there and hence no multithreading is introduced.
// 5	Calling	As thread class implements Runnable interface so it implementing its run method also in such a way 
that start method internally called run method after creating a new thread.	On other hand run method executed by start
 method or get called directly if we implement Runnable interface and call run method.

 */

 