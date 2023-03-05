public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //int s = 1_000_000;
        //float r = 9.99F;
        //int n = 1;
        //double monthlyPayment = service.calculate(s, r, n);
        //System.out.println("Ежемесячный платёж: " + monthlyPayment);
        System.out.println();
        System.out.println("Сумма кредита,руб = 1000000; Процентная ставка,% = 9.99; Срок кредита,месяцев = 12");
        System.out.println("Ежемесячный платёж: " + service.calculate(1000000, 9.99F, 1)+" руб.");
        System.out.println();
        System.out.println("Сумма кредита,руб = 1000000; Процентная ставка,% = 9.99; Срок кредита,месяцев = 24");
        System.out.println("Ежемесячный платёж: " + service.calculate(1000000, 9.99F, 2)+" руб.");
        System.out.println();
        System.out.println("Сумма кредита,руб = 1000000; Процентная ставка,% = 9.99; Срок кредита,месяцев = 36");
        System.out.println("Ежемесячный платёж: " + service.calculate(1000000, 9.99F, 3)+" руб.");
    }
}