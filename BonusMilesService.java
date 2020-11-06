
public class BonusMilesService {
    public int calculate(int cost) {
        int bonusOneMile = 20;
        int addMiles = cost / bonusOneMile;
        return addMiles;
    }
}