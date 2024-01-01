public class NumOfStepToReduceNumToZero {
static int count=0;
    static int numberOfSteps(int num) {
        if(num==0){
            return count;
        }
        if (num % 2 == 1) {
            num = num - 1;
            count=count+1;
            if(num==0){
                return count;
            }
        }
        num = num / 2;
        count=count+1;

        return numberOfSteps(num);
    }

    public static void main(String[] args) {
        numberOfSteps(14);
        System.out.println(count);
    }
}
