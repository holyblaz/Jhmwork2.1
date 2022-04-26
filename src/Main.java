public class Main {
    public static void main(String[] args) {
        int price = 5656; // цена билета
        int bonusForOneMile = 20; // количество рублей за 1 милю

        int bonusMileage = price / bonusForOneMile; // количество наичисленных мили за билет

        System.out.println("Ваш бонус за купленный билет: " + bonusMileage + " мили");
    }
}
