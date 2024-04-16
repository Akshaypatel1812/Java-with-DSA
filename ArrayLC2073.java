public class ArrayLC2073 {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != 0) {
                    tickets[i] = tickets[i] - 1;
                    count++;
                    if (i == k && tickets[i] == 0) // Check if person at position k has finished buying tickets
                        return count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] tickets = { 2, 3, 2 };
        int k = 2;

        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
