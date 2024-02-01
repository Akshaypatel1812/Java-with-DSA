
public class queueCircular {

    static class que {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        que(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isFull() {
            if ((rear + 1) % size == front) {
                return true;
            } else {
                return false;
            }
        }

        public void enQue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int Dque() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

       
    }

    public static void main(String[] args) {
        que q = new que(5);
        q.enQue(1);
        q.enQue(2);
        q.enQue(3);
        q.enQue(4);
        q.enQue(5);
        

        System.out.println(q.Dque());
        q.enQue(6);
        System.out.println(q.Dque());
        q.enQue(7);
    }
}
