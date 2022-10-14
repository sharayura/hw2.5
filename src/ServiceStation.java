import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Car> {

    private Queue<T> carQueue = new LinkedList<>();

    public void addCarQueue(T car) {
        if (car instanceof Bus) {
            System.out.println("Автобусы не обслуживаем");
        } else { carQueue.offer(car); }
    }

    public void doService() {
        if (carQueue.peek() == null) {
            System.out.println("Нет машин");
            return;
        }
        System.out.println(carQueue.peek().getBrand() + " обслужена");
        carQueue.poll();
    }
}
