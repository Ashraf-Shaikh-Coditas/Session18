package Week4.Session18;
// Question Three
public class ThreadMethodsDemo {


    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Currently Running "+new Thread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread());
            }
        };

        Thread t1 = new Thread(runnable);
        t1.setName("A_Thread");
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.setName("B_Thread");
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.setName("C_Thread");
        t3.start();

        System.out.println("The name of first thread is :: "+t1.getName());
        System.out.println("The name of second thread is :: "+t2.getName());
        System.out.println("The name of third thread is :: "+t3.getName());

        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(5);

        System.out.println("Thread First Priority "+t1.getPriority());
        System.out.println("Thread Second Priority "+t2.getPriority());
        System.out.println("Thread Third Priority "+t3.getPriority());

        System.out.println("Active Threads "+Thread.activeCount());

        System.out.println("Thread id is :: "+t1.getId());
        System.out.println("Thread id is :: "+t2.getId());
        System.out.println("Thread id is :: "+t3.getId());

        System.out.println("Thread First state :: "+t1.getState());
        System.out.println("Thread Second state :: "+t2.getState());
        System.out.println("Thread Third state :: "+t3.getState());

        System.out.println("Is thread a daemon thread :: "+t1.isDaemon());
        System.out.println("Is thread a Alive thread :: "+t1.isAlive());

        t1.join();
        t2.join();
        t3.join();

    }
}

/*
The name of first thread is :: A_Thread
The name of second thread is :: B_Thread
The name of third thread is :: C_Thread

Currently Running Thread-3
Currently Running Thread-4
Currently Running Thread-5

Thread First Priority 10
Thread Second Priority 1
Thread Third Priority 5

Active Threads 5

Thread id is :: 15
Thread id is :: 16
Thread id is :: 17

Thread First state :: TIMED_WAITING
Thread Second state :: TIMED_WAITING
Thread Third state :: TIMED_WAITING

Is thread a daemon thread :: false

Is thread a Alive thread :: true

Thread[A_Thread,10,main]
Thread[C_Thread,5,main]
Thread[B_Thread,1,main]

* */