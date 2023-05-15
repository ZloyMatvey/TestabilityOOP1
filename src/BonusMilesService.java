public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20; // сумма за которую начисляется 1 миля
        int miles = price / bonus; // расчет бонусных миль
        return miles;
    }
}
