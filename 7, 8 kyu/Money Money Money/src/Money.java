
public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired){
        double totalMoney = principal;
        int years = 0;
        double moneySpentOnTax;
        while (totalMoney < desired){
            years ++;
            moneySpentOnTax = totalMoney * interest * tax;
            totalMoney = (totalMoney * (1+interest)) - moneySpentOnTax;
        }
        return years;
    }
}
