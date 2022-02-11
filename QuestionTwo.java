//2)WHAT IF WE CALL run() EXPLICITLY?
//=> If we use run() instead of start() , then execution of each thread will start on same stack .
// So no context switching takes place between different threads . So no use of multithreading .
// It will work like a normal method call for object .

package Week4.Session18;

public class QuestionTwo extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(" Exception Occurred .");
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        QuestionTwo t1 = new QuestionTwo();
        QuestionTwo t2 = new QuestionTwo();
        QuestionTwo t3 = new QuestionTwo();
         t1.run();
         t2.run();
         t3.run();
    }
}

/*

0
1
2
3
4
0
1
2
3
4
0
1
2
3
4

* */