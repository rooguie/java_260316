package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class SkHynix {

	public List<DataFrame> skHynix = new ArrayList<>(); // SK하이닉스
	public double rate;

	public List<DataFrame> getSkHynix() {
		return skHynix;
	}

	public void setSkHynix(List<DataFrame> skHynix) {
		this.skHynix = skHynix;
	}

	public SkHynix() {
		// 2020년
		skHynix.add(new DataFrame(8500000, 94100, 93500, "2020", "1"));
		skHynix.add(new DataFrame(9200000, 93500, 90000, "2020", "2"));
		skHynix.add(new DataFrame(22000000, 90000, 69000, "2020", "3"));
		skHynix.add(new DataFrame(15000000, 69000, 82000, "2020", "4"));
		skHynix.add(new DataFrame(12000000, 82000, 81500, "2020", "5"));
		skHynix.add(new DataFrame(13500000, 81500, 85000, "2020", "6"));
		skHynix.add(new DataFrame(12500000, 85000, 82000, "2020", "7"));
		skHynix.add(new DataFrame(14000000, 82000, 75000, "2020", "8"));
		skHynix.add(new DataFrame(15500000, 75000, 84000, "2020", "9"));
		skHynix.add(new DataFrame(13000000, 84000, 79000, "2020", "10"));
		skHynix.add(new DataFrame(18500000, 79000, 97000, "2020", "11"));
		skHynix.add(new DataFrame(21000000, 97000, 118000, "2020", "12"));

		// 2021년
		skHynix.add(new DataFrame(28000000, 118000, 122000, "2021", "1"));
		skHynix.add(new DataFrame(18000000, 122000, 141000, "2021", "2"));
		skHynix.add(new DataFrame(15000000, 141000, 132000, "2021", "3"));
		skHynix.add(new DataFrame(11000000, 132000, 128000, "2021", "4"));
		skHynix.add(new DataFrame(10500000, 128000, 123000, "2021", "5"));
		skHynix.add(new DataFrame(9800000, 123000, 125000, "2021", "6"));
		skHynix.add(new DataFrame(11000000, 125000, 112500, "2021", "7"));
		skHynix.add(new DataFrame(25000000, 112500, 103500, "2021", "8"));
		skHynix.add(new DataFrame(12000000, 103500, 103000, "2021", "9"));
		skHynix.add(new DataFrame(14500000, 103000, 103000, "2021", "10"));
		skHynix.add(new DataFrame(18000000, 103000, 114000, "2021", "11"));
		skHynix.add(new DataFrame(14000000, 114000, 131000, "2021", "12"));

		// 2022년
		skHynix.add(new DataFrame(18200000, 131000, 121000, "2022", "1"));
		skHynix.add(new DataFrame(12000000, 121000, 123000, "2022", "2"));
		skHynix.add(new DataFrame(15000000, 123000, 118000, "2022", "3"));
		skHynix.add(new DataFrame(11000000, 118000, 110000, "2022", "4"));
		skHynix.add(new DataFrame(9500000, 110000, 108000, "2022", "5"));
		skHynix.add(new DataFrame(12500000, 108000, 91000, "2022", "6"));
		skHynix.add(new DataFrame(11000000, 91000, 97000, "2022", "7"));
		skHynix.add(new DataFrame(10500000, 97000, 93000, "2022", "8"));
		skHynix.add(new DataFrame(12000000, 93000, 81000, "2022", "9"));
		skHynix.add(new DataFrame(11500000, 81000, 83000, "2022", "10"));
		skHynix.add(new DataFrame(10500000, 83000, 85000, "2022", "11"));
		skHynix.add(new DataFrame(12000000, 85000, 75000, "2022", "12"));

		// 2023년
		skHynix.add(new DataFrame(10500000, 75000, 88000, "2023", "1"));
		skHynix.add(new DataFrame(9500000, 88000, 89000, "2023", "2"));
		skHynix.add(new DataFrame(11000000, 89000, 88000, "2023", "3"));
		skHynix.add(new DataFrame(12500000, 88000, 89000, "2023", "4"));
		skHynix.add(new DataFrame(14500000, 89000, 108000, "2023", "5"));
		skHynix.add(new DataFrame(13200000, 108000, 115000, "2023", "6"));
		skHynix.add(new DataFrame(12000000, 115000, 123000, "2023", "7"));
		skHynix.add(new DataFrame(11500000, 123000, 121000, "2023", "8"));
		skHynix.add(new DataFrame(10500000, 121000, 114000, "2023", "9"));
		skHynix.add(new DataFrame(12500000, 114000, 131000, "2023", "10"));
		skHynix.add(new DataFrame(13500000, 131000, 133000, "2023", "11"));
		skHynix.add(new DataFrame(12000000, 133000, 141500, "2023", "12"));

		// 2024년
		skHynix.add(new DataFrame(15500000, 141500, 135000, "2024", "1"));
		skHynix.add(new DataFrame(13500000, 135000, 155000, "2024", "2"));
		skHynix.add(new DataFrame(18000000, 155000, 185000, "2024", "3"));
		skHynix.add(new DataFrame(16500000, 185000, 175000, "2024", "4"));
		skHynix.add(new DataFrame(14500000, 175000, 195000, "2024", "5"));
		skHynix.add(new DataFrame(18500000, 195000, 235000, "2024", "6"));
		skHynix.add(new DataFrame(21000000, 235000, 195000, "2024", "7"));
		skHynix.add(new DataFrame(18500000, 195000, 175000, "2024", "8"));
		skHynix.add(new DataFrame(16500000, 175000, 170000, "2024", "9"));
		skHynix.add(new DataFrame(14500000, 170000, 185000, "2024", "10"));
		skHynix.add(new DataFrame(13500000, 185000, 192000, "2024", "11"));
		skHynix.add(new DataFrame(15500000, 192000, 195000, "2024", "12"));

		// 2025년
		skHynix.add(new DataFrame(18500000, 195000, 210000, "2025", "1"));
		skHynix.add(new DataFrame(17500000, 210000, 225000, "2025", "2"));
		skHynix.add(new DataFrame(21000000, 225000, 245000, "2025", "3"));
		skHynix.add(new DataFrame(19500000, 245000, 240000, "2025", "4"));
		skHynix.add(new DataFrame(18500000, 240000, 265000, "2025", "5"));
		skHynix.add(new DataFrame(22500000, 265000, 285000, "2025", "6"));
		skHynix.add(new DataFrame(28500000, 285000, 310000, "2025", "7"));
		skHynix.add(new DataFrame(26500000, 310000, 305000, "2025", "8"));
		skHynix.add(new DataFrame(24500000, 305000, 325000, "2025", "9"));
		skHynix.add(new DataFrame(22500000, 325000, 335000, "2025", "10"));
		skHynix.add(new DataFrame(25500000, 335000, 355000, "2025", "11"));
		skHynix.add(new DataFrame(32500000, 355000, 385000, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : skHynix) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : skHynix) {
			if (tmp.getYear().equals(finishYear) && tmp.getMonth().equals(finishMonth)) {
				finishPrice = tmp.getFinishPrice();
			}
		}

		rate =(double)(finishPrice-startPrice)/startPrice*100;
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}