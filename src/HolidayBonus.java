/*
 * @ authore Enchalew Abebe
 * 
 */
public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data,double high,double low, double other) {
// creating a varibale 
		double[] bonuses = new double[data.length];
		int maxCol = 0;
		// creating a for loop to validate
		for (int i = 0; i < data.length; i++) {
			if (maxCol < data[i].length) {
				maxCol = data[i].length;
			}
		}
			for (int j = 0; j < maxCol; j++) {
				int highBonusIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data,j);
				int lowBonusIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j);
				if (TwoDimRaggedArrayUtility.getHighestInColumn(data, j) > 0) {
					bonuses[highBonusIndex] +=high;
					}
				if(TwoDimRaggedArrayUtility.getLowestInColumn(data,j)> 0 && highBonusIndex!=lowBonusIndex) {
					bonuses[lowBonusIndex]+=low;
					}
				for (int i =0; i < data.length; i++) {
					if (j >= data[i].length || i == highBonusIndex|| i== lowBonusIndex || data[i][j] <= 0) {
						continue;
					}else {
						bonuses[i]+=other;
					}
					System.out.println();
				}
			}
			return bonuses;
			}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonusArray = calculateHolidayBonus(data,high,low,other);
		double total =0;
		// using for loop to validatealidate and return the total  value
		for (double bonus : bonusArray) {
			total +=bonus;
		}
		return total;
		
	}
}


