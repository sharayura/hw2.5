import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Random;

public class Supermarket {
   private Queue<String> queue1;
   private Queue<String> queue2;
   private Queue<String> queue3;

   private static final String namesArr[] = {"Петя", "Вася", "Вика", "Саша", "Ира", "Коля"};
   private static final int MAX_SIZE = 5;


    public Supermarket() {
        queue1 = new ArrayDeque<>(MAX_SIZE);
        queue2 = new ArrayDeque<>(MAX_SIZE);

        Random rand = new Random();
        int iMax = rand.nextInt(MAX_SIZE);
        for (int i = 0; i < iMax; i++) {
            queue1.offer(namesArr[rand.nextInt(namesArr.length - 1)]);
        }
        iMax = rand.nextInt(MAX_SIZE);
        for (int i = 0; i < iMax; i++) {
            queue2.offer(namesArr[rand.nextInt(namesArr.length - 1)]);
        }
    }

    private void printQueue(Queue<String> queue) {
        if (queue == null) {
            return;
        }
        for (String current: queue) {
            System.out.println(current);
        }
    }

    public void printAllQueues() {
        System.out.println("Очередь 1:");
        printQueue(queue1);
        System.out.println("Очередь 2:");
        printQueue(queue2);
        System.out.println("Очередь 3:");
        printQueue(queue3);
        System.out.println();
    }

    public void addQueue() {
        Random rand = new Random();
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            if (queue3 == null) {
                System.out.println("Позвать Галю");
                queue3 = new ArrayDeque<>(MAX_SIZE);
            }
            queue3.offer(namesArr[rand.nextInt(namesArr.length - 1)]);
            return;
        }
        if (queue1.size() > queue2.size()) {
            queue2.offer(namesArr[rand.nextInt(namesArr.length - 1)]);
        } else {
            queue1.offer(namesArr[rand.nextInt(namesArr.length - 1)]);
        }
    }

    public void removeRndQueue() {
        Random rand = new Random();
        int randQueue = rand.nextInt(2);

        boolean pollDone = false;
        int count = 0;
        do {
            switch (randQueue) {
               case 0:
                   if (queue1.poll() != null) {
                       pollDone = true;
                       break;
                   }
                   count++;
               case 1:
                   if (queue2.poll() != null) {
                       pollDone = true;
                       break;
                   }
                   count++;
               case 2:
                   if (queue3.poll() != null) {
                       pollDone = true;
                       break;
                   }
                   randQueue = 0;
                   count++;
            }

        } while (!pollDone && count < 3);
    }
}
