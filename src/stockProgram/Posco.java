package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class Posco {

	public List<DataFrame> posco = new ArrayList<>(); // 포스코
	public double rate;

	public List<DataFrame> getPosco() {
		return posco;
	}

	public void setPosco(List<DataFrame> posco) {
		this.posco = posco;
	}

	public Posco() {
		// 2020년
		posco.add(new DataFrame(800000, 235000, 225000, "2020", "1"));
		posco.add(new DataFrame(950000, 225000, 210000, "2020", "2"));
		posco.add(new DataFrame(3500000, 210000, 138000, "2020", "3"));
		posco.add(new DataFrame(2200000, 138000, 175500, "2020", "4"));
		posco.add(new DataFrame(1800000, 175500, 182500, "2020", "5"));
		posco.add(new DataFrame(2100000, 182500, 174500, "2020", "6"));
		posco.add(new DataFrame(2300000, 174500, 192500, "2020", "7"));
		posco.add(new DataFrame(2800000, 192500, 185500, "2020", "8"));
		posco.add(new DataFrame(2400000, 185500, 200500, "2020", "9"));
		posco.add(new DataFrame(2200000, 200500, 205500, "2020", "10"));
		posco.add(new DataFrame(2500000, 205500, 235500, "2020", "11"));
		posco.add(new DataFrame(2800000, 235500, 272000, "2020", "12"));

		// 2021년
		posco.add(new DataFrame(3500000, 272000, 312000, "2021", "1"));
		posco.add(new DataFrame(3800000, 312000, 335000, "2021", "2"));
		posco.add(new DataFrame(4200000, 335000, 321000, "2021", "3"));
		posco.add(new DataFrame(3800000, 321000, 365000, "2021", "4"));
		posco.add(new DataFrame(4500000, 365000, 351000, "2021", "5"));
		posco.add(new DataFrame(4100000, 351000, 345000, "2021", "6"));
		posco.add(new DataFrame(4800000, 345000, 355000, "2021", "7"));
		posco.add(new DataFrame(3500000, 355000, 321000, "2021", "8"));
		posco.add(new DataFrame(3200000, 321000, 301000, "2021", "9"));
		posco.add(new DataFrame(3800000, 301000, 295000, "2021", "10"));
		posco.add(new DataFrame(4100000, 295000, 285000, "2021", "11"));
		posco.add(new DataFrame(3500000, 285000, 274500, "2021", "12"));

		// 2022년
		posco.add(new DataFrame(3200000, 274500, 261000, "2022", "1"));
		posco.add(new DataFrame(2800000, 261000, 275000, "2022", "2"));
		posco.add(new DataFrame(3100000, 275000, 292000, "2022", "3"));
		posco.add(new DataFrame(2500000, 292000, 281000, "2022", "4"));
		posco.add(new DataFrame(2200000, 281000, 288000, "2022", "5"));
		posco.add(new DataFrame(3500000, 288000, 235000, "2022", "6"));
		posco.add(new DataFrame(3100000, 235000, 245000, "2022", "7"));
		posco.add(new DataFrame(2800000, 245000, 258000, "2022", "8"));
		posco.add(new DataFrame(4200000, 258000, 235000, "2022", "9"));
		posco.add(new DataFrame(3800000, 235000, 251000, "2022", "10"));
		posco.add(new DataFrame(3500000, 251000, 288000, "2022", "11"));
		posco.add(new DataFrame(3200000, 288000, 276500, "2022", "12"));

		// 2023년
		posco.add(new DataFrame(3500000, 276500, 312000, "2023", "1"));
		posco.add(new DataFrame(3800000, 312000, 321000, "2023", "2"));
		posco.add(new DataFrame(4200000, 321000, 381000, "2023", "3"));
		posco.add(new DataFrame(4800000, 381000, 375000, "2023", "4"));
		posco.add(new DataFrame(3500000, 375000, 355000, "2023", "5"));
		posco.add(new DataFrame(3200000, 355000, 395000, "2023", "6"));
		posco.add(new DataFrame(15000000, 395000, 642000, "2023", "7"));
		posco.add(new DataFrame(8500000, 642000, 581000, "2023", "8"));
		posco.add(new DataFrame(6200000, 581000, 532000, "2023", "9"));
		posco.add(new DataFrame(4800000, 532000, 428000, "2023", "10"));
		posco.add(new DataFrame(5200000, 428000, 478000, "2023", "11"));
		posco.add(new DataFrame(4500000, 478000, 499500, "2023", "12"));

		// 2024년
		posco.add(new DataFrame(4200000, 499500, 432000, "2024", "1"));
		posco.add(new DataFrame(3800000, 432000, 442000, "2024", "2"));
		posco.add(new DataFrame(4100000, 442000, 412000, "2024", "3"));
		posco.add(new DataFrame(3500000, 412000, 395000, "2024", "4"));
		posco.add(new DataFrame(3200000, 395000, 382000, "2024", "5"));
		posco.add(new DataFrame(2800000, 382000, 365000, "2024", "6"));
		posco.add(new DataFrame(2500000, 365000, 351000, "2024", "7"));
		posco.add(new DataFrame(2400000, 351000, 321000, "2024", "8"));
		posco.add(new DataFrame(2300000, 321000, 365000, "2024", "9"));
		posco.add(new DataFrame(2100000, 365000, 342000, "2024", "10"));
		posco.add(new DataFrame(2000000, 342000, 318000, "2024", "11"));
		posco.add(new DataFrame(1900000, 318000, 335000, "2024", "12"));

		// 2025년
		posco.add(new DataFrame(2500000, 335000, 355000, "2025", "1"));
		posco.add(new DataFrame(2800000, 355000, 385000, "2025", "2"));
		posco.add(new DataFrame(3200000, 385000, 412000, "2025", "3"));
		posco.add(new DataFrame(3500000, 412000, 445000, "2025", "4"));
		posco.add(new DataFrame(3800000, 445000, 482000, "2025", "5"));
		posco.add(new DataFrame(4200000, 482000, 521000, "2025", "6"));
		posco.add(new DataFrame(5500000, 521000, 565000, "2025", "7"));
		posco.add(new DataFrame(5100000, 565000, 542000, "2025", "8"));
		posco.add(new DataFrame(4800000, 542000, 582000, "2025", "9"));
		posco.add(new DataFrame(4500000, 582000, 612000, "2025", "10"));
		posco.add(new DataFrame(5200000, 612000, 655000, "2025", "11"));
		posco.add(new DataFrame(6500000, 655000, 698500, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : posco) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : posco) {
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