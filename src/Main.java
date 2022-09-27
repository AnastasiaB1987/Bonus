public class Main {
    public static void main(String[] args) {
        int startCash = 1000;
        int plus = 700;
        int account = (startCash + plus);
        int bonus = (account / 100 + 100);

        if (account < 1000) {
            System.out.println(account);
        } else {
            System.out.println(bonus + account);
        }


    }
}