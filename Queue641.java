public class Queue641 {
    
    private int[] arr;
    private int front, rear, size;
    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        rear = -1;
        front = -1;
    }

        public boolean enQueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full");
                return false;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = value;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return false;
            }
            int val = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return true;
        }

        public int Front() {
             if(isFull()){
                return -1;
             }
             return arr[front];
        }

        public int Rear() {
             if(isEmpty()){
                return -1;
             }
             return arr[rear];
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
    }

