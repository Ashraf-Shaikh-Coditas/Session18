// Question 4
package Week4.Session18;

public class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int bound = 10;
                for(int i=0; i<bound;i++) {
                    if(i%2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);

        Thread arr[] = new Thread[4];
        arr[0] =t1;
        arr[1] =t2;
        arr[2] =t3;
        arr[3] =t4;

        for(int i=0;i< arr.length;i++) {
            arr[i].start();
        }
    }

}

/*
1
3
5
7
9

1
3
5
7
9

1
3
5
7
9

1
3
5
7
9

* */
