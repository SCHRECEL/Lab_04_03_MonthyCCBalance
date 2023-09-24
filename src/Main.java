public class Main {
    public static void main(String[] args)
    {
        double credit_card_balance = 5000.0;
        double interest_rate = .17;

        System.out.println("Your interest due after one month is: " + ((credit_card_balance * interest_rate) + credit_card_balance));
        credit_card_balance = credit_card_balance + (credit_card_balance * interest_rate);
        System.out.println("Your intereset due after two months is: " +((credit_card_balance * interest_rate) + credit_card_balance));
    }
}