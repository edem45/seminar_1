package dz2seminar2;

public interface QueueBehavior {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
