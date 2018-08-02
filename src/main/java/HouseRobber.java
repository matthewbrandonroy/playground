import java.util.ArrayList;

public class HouseRobber {
    public Integer rob(ArrayList<Integer> houses) {
        Integer totalMoney = 0;

        for(int houseNumber = 0; houseNumber <= houses.size(); houseNumber += 2){
            totalMoney += houses.get(houseNumber);
        }

        return totalMoney;
    }
}
