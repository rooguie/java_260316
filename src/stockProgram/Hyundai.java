package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class Hyundai {

	public List<DataFrame> hyundai = new ArrayList<>(); // 현대차
	public double rate;

	public List<DataFrame> getHyundai() {
		return hyundai;
	}

	public void setHyundai(List<DataFrame> hyundai) {
		this.hyundai = hyundai;
	}

	public Hyundai() {
		// 2020년
		hyundai.add(new DataFrame(2100000, 120000, 125000, "2020", "1"));
		hyundai.add(new DataFrame(2500000, 125000, 115000, "2020", "2"));
		hyundai.add(new DataFrame(8500000, 115000, 65000, "2020", "3"));
		hyundai.add(new DataFrame(5500000, 65000, 93000, "2020", "4"));
		hyundai.add(new DataFrame(4200000, 93000, 98000, "2020", "5"));
		hyundai.add(new DataFrame(5100000, 98000, 97000, "2020", "6"));
		hyundai.add(new DataFrame(7800000, 97000, 126000, "2020", "7"));
		hyundai.add(new DataFrame(11000000, 126000, 176000, "2020", "8"));
		hyundai.add(new DataFrame(9200000, 176000, 182000, "2020", "9"));
		hyundai.add(new DataFrame(8200000, 182000, 164000, "2020", "10"));
		hyundai.add(new DataFrame(8800000, 164000, 181000, "2020", "11"));
		hyundai.add(new DataFrame(9500000, 181000, 192000, "2020", "12"));

		// 2021년
		hyundai.add(new DataFrame(25000000, 192000, 230000, "2021", "1"));
		hyundai.add(new DataFrame(12000000, 230000, 235000, "2021", "2"));
		hyundai.add(new DataFrame(9500000, 235000, 218000, "2021", "3"));
		hyundai.add(new DataFrame(7800000, 218000, 212000, "2021", "4"));
		hyundai.add(new DataFrame(6200000, 212000, 235000, "2021", "5"));
		hyundai.add(new DataFrame(5800000, 235000, 238000, "2021", "6"));
		hyundai.add(new DataFrame(4800000, 238000, 222000, "2021", "7"));
		hyundai.add(new DataFrame(4200000, 222000, 212000, "2021", "8"));
		hyundai.add(new DataFrame(3800000, 212000, 201000, "2021", "9"));
		hyundai.add(new DataFrame(4100000, 201000, 210000, "2021", "10"));
		hyundai.add(new DataFrame(4500000, 210000, 202000, "2021", "11"));
		hyundai.add(new DataFrame(3800000, 202000, 209000, "2021", "12"));

		// 2022년
		hyundai.add(new DataFrame(4500000, 209000, 189000, "2022", "1"));
		hyundai.add(new DataFrame(4200000, 189000, 175000, "2022", "2"));
		hyundai.add(new DataFrame(4800000, 175000, 180000, "2022", "3"));
		hyundai.add(new DataFrame(4100000, 180000, 185000, "2022", "4"));
		hyundai.add(new DataFrame(3800000, 185000, 188000, "2022", "5"));
		hyundai.add(new DataFrame(4200000, 188000, 175000, "2022", "6"));
		hyundai.add(new DataFrame(4500000, 175000, 195000, "2022", "7"));
		hyundai.add(new DataFrame(3800000, 195000, 188000, "2022", "8"));
		hyundai.add(new DataFrame(3500000, 188000, 175000, "2022", "9"));
		hyundai.add(new DataFrame(4100000, 175000, 162000, "2022", "10"));
		hyundai.add(new DataFrame(3800000, 162000, 168000, "2022", "11"));
		hyundai.add(new DataFrame(4200000, 168000, 151000, "2022", "12"));

		// 2023년
		hyundai.add(new DataFrame(3500000, 151000, 165000, "2023", "1"));
		hyundai.add(new DataFrame(3800000, 165000, 175000, "2023", "2"));
		hyundai.add(new DataFrame(4200000, 175000, 180000, "2023", "3"));
		hyundai.add(new DataFrame(3800000, 180000, 192000, "2023", "4"));
		hyundai.add(new DataFrame(4500000, 192000, 205000, "2023", "5"));
		hyundai.add(new DataFrame(4100000, 205000, 202000, "2023", "6"));
		hyundai.add(new DataFrame(4800000, 202000, 195000, "2023", "7"));
		hyundai.add(new DataFrame(3500000, 195000, 185000, "2023", "8"));
		hyundai.add(new DataFrame(3200000, 185000, 191000, "2023", "9"));
		hyundai.add(new DataFrame(3800000, 191000, 188000, "2023", "10"));
		hyundai.add(new DataFrame(4100000, 188000, 182000, "2023", "11"));
		hyundai.add(new DataFrame(3500000, 182000, 203500, "2023", "12"));

		// 2024년
		hyundai.add(new DataFrame(8500000, 203500, 245000, "2024", "1"));
		hyundai.add(new DataFrame(9500000, 245000, 265000, "2024", "2"));
		hyundai.add(new DataFrame(7500000, 265000, 242000, "2024", "3"));
		hyundai.add(new DataFrame(6500000, 242000, 251000, "2024", "4"));
		hyundai.add(new DataFrame(5500000, 251000, 268000, "2024", "5"));
		hyundai.add(new DataFrame(8500000, 268000, 285000, "2024", "6"));
		hyundai.add(new DataFrame(6500000, 285000, 252000, "2024", "7"));
		hyundai.add(new DataFrame(5500000, 252000, 241000, "2024", "8"));
		hyundai.add(new DataFrame(4500000, 241000, 238000, "2024", "9"));
		hyundai.add(new DataFrame(5200000, 238000, 222000, "2024", "10"));
		hyundai.add(new DataFrame(4800000, 222000, 218000, "2024", "11"));
		hyundai.add(new DataFrame(4200000, 218000, 228000, "2024", "12"));

		// 2025년
		hyundai.add(new DataFrame(5500000, 228000, 245000, "2025", "1"));
		hyundai.add(new DataFrame(6200000, 245000, 258000, "2025", "2"));
		hyundai.add(new DataFrame(5800000, 258000, 275000, "2025", "3"));
		hyundai.add(new DataFrame(5200000, 275000, 282000, "2025", "4"));
		hyundai.add(new DataFrame(4800000, 282000, 295000, "2025", "5"));
		hyundai.add(new DataFrame(5500000, 295000, 315000, "2025", "6"));
		hyundai.add(new DataFrame(6800000, 315000, 325000, "2025", "7"));
		hyundai.add(new DataFrame(6100000, 325000, 318000, "2025", "8"));
		hyundai.add(new DataFrame(5500000, 318000, 335000, "2025", "9"));
		hyundai.add(new DataFrame(4800000, 335000, 342000, "2025", "10"));
		hyundai.add(new DataFrame(5200000, 342000, 355000, "2025", "11"));
		hyundai.add(new DataFrame(6500000, 355000, 375000, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : hyundai) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : hyundai) {
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