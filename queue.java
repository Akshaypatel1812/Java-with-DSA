public class queue {

    static class que{
        static int [] arr;
        static int size;
        static int rear;

        que(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public boolean isEmpty(){
            return rear==-1;
        }

        public void enQue(int data){
            if(rear==size-1){
               System.out.println("Queue is full");
               return;
            }

            rear=rear+1;
            arr[rear]=data;
        }

        public int Dque(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int val=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return val;
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        que myQueue = new que(5);
        myQueue.enQue(1);
        myQueue.enQue(2);
        myQueue.enQue(3);

        myQueue.printQueue();

        myQueue.Dque();

        myQueue.printQueue();
        
        
    }
}
