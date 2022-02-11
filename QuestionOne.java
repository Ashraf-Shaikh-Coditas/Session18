//1)WHAT IF WE RESTART ANY THREAD?
//		=>t1.start();
//		=>t1.start();
//=> We can never start a single Thread twice . It will give an IllegalThreadStateException.
// For the first time thread get executed . But second time it throws exception.

package Week4.Session18;

public class QuestionOne extends Thread {

    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {

        QuestionOne t1 = new QuestionOne();
        t1.start();
        t1.start();
        System.out.println(Thread.currentThread());


    }
}

/*

Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.start(Thread.java:793)
	at Week4.Session18.QuestionOne.main(QuestionOne.java:12)

*/
