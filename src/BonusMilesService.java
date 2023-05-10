public class BonusMilesService {
    public int calculate(int priceTicket) {
        int result;
        if (priceTicket > 20) {
            result = priceTicket / 20;
        } else {
            result = 0;
        }
        return result;

    }
}
