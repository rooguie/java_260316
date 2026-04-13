package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class Kia {

	public List<DataFrame> kia = new ArrayList<>(); // 기아
	public double rate;

	public List<DataFrame> getKia() {
		return kia;
	}

	public void setKia(List<DataFrame> kia) {
		this.kia = kia;
	}

	public Kia() {
		// 2020년: 코로나 폭락 및 회복기
		kia.add(new DataFrame(2500000, 44000, 42000, "2020", "1"));
		kia.add(new DataFrame(2800000, 42000, 39000, "2020", "2"));
		kia.add(new DataFrame(7500000, 39000, 21500, "2020", "3")); // 저점
		kia.add(new DataFrame(5200000, 21500, 29000, "2020", "4"));
		kia.add(new DataFrame(4100000, 29000, 32000, "2020", "5"));
		kia.add(new DataFrame(4800000, 32000, 32500, "2020", "6"));
		kia.add(new DataFrame(6200000, 32500, 38500, "2020", "7"));
		kia.add(new DataFrame(8500000, 38500, 42000, "2020", "8"));
		kia.add(new DataFrame(7800000, 42000, 47000, "2020", "9"));
		kia.add(new DataFrame(7200000, 47000, 50500, "2020", "10"));
		kia.add(new DataFrame(8200000, 50500, 58000, "2020", "11"));
		kia.add(new DataFrame(9800000, 58000, 62400, "2020", "12"));

		// 2021년: 브랜드 로고 변경 및 전기차 EV6 기대감
		kia.add(new DataFrame(15500000, 62400, 83500, "2021", "1"));
		kia.add(new DataFrame(25000000, 83500, 80000, "2021", "2"));
		kia.add(new DataFrame(12000000, 80000, 83000, "2021", "3"));
		kia.add(new DataFrame(9500000, 83000, 81500, "2021", "4"));
		kia.add(new DataFrame(8800000, 81500, 84000, "2021", "5"));
		kia.add(new DataFrame(7500000, 84000, 89500, "2021", "6"));
		kia.add(new DataFrame(6200000, 89500, 86000, "2021", "7"));
		kia.add(new DataFrame(5500000, 86000, 83000, "2021", "8"));
		kia.add(new DataFrame(4800000, 83000, 80500, "2021", "9"));
		kia.add(new DataFrame(5200000, 80500, 84000, "2021", "10"));
		kia.add(new DataFrame(4200000, 84000, 81500, "2021", "11"));
		kia.add(new DataFrame(3800000, 81500, 82200, "2021", "12"));

		// 2022년: 고금리 하락세
		kia.add(new DataFrame(4200000, 82200, 75500, "2022", "1"));
		kia.add(new DataFrame(3800000, 75500, 73500, "2022", "2"));
		kia.add(new DataFrame(4500000, 73500, 76500, "2022", "3"));
		kia.add(new DataFrame(4100000, 76500, 82500, "2022", "4"));
		kia.add(new DataFrame(3500000, 82500, 83500, "2022", "5"));
		kia.add(new DataFrame(3800000, 83500, 76500, "2022", "6"));
		kia.add(new DataFrame(4200000, 76500, 79500, "2022", "7"));
		kia.add(new DataFrame(3500000, 79500, 77500, "2022", "8"));
		kia.add(new DataFrame(3200000, 77500, 73500, "2022", "9"));
		kia.add(new DataFrame(3800000, 73500, 65500, "2022", "10"));
		kia.add(new DataFrame(4100000, 65500, 67500, "2022", "11"));
		kia.add(new DataFrame(3500000, 67500, 59300, "2022", "12"));

		// 2023년: 실적 서프라이즈 및 반등
		kia.add(new DataFrame(3800000, 59300, 68500, "2023", "1"));
		kia.add(new DataFrame(4200000, 68500, 75500, "2023", "2"));
		kia.add(new DataFrame(4800000, 75500, 78500, "2023", "3"));
		kia.add(new DataFrame(4100000, 78500, 84500, "2023", "4"));
		kia.add(new DataFrame(3800000, 84500, 87500, "2023", "5"));
		kia.add(new DataFrame(4200000, 87500, 88500, "2023", "6"));
		kia.add(new DataFrame(4500000, 88500, 83500, "2023", "7"));
		kia.add(new DataFrame(3800000, 83500, 79500, "2023", "8"));
		kia.add(new DataFrame(3200000, 79500, 81500, "2023", "9"));
		kia.add(new DataFrame(3500000, 81500, 78500, "2023", "10"));
		kia.add(new DataFrame(4100000, 78500, 84500, "2023", "11"));
		kia.add(new DataFrame(4500000, 84500, 100000, "2023", "12"));

		// 2024년: 역사적 신고가 및 밸류업
		kia.add(new DataFrame(12000000, 100000, 115000, "2024", "1"));
		kia.add(new DataFrame(15000000, 115000, 125000, "2024", "2"));
		kia.add(new DataFrame(11000000, 125000, 112000, "2024", "3"));
		kia.add(new DataFrame(8500000, 112000, 118000, "2024", "4"));
		kia.add(new DataFrame(7200000, 118000, 122000, "2024", "5"));
		kia.add(new DataFrame(9500000, 122000, 129000, "2024", "6"));
		kia.add(new DataFrame(8200000, 129000, 115000, "2024", "7"));
		kia.add(new DataFrame(7500000, 115000, 105000, "2024", "8"));
		kia.add(new DataFrame(6200000, 105000, 102000, "2024", "9"));
		kia.add(new DataFrame(5800000, 102000, 95000, "2024", "10"));
		kia.add(new DataFrame(5200000, 95000, 98000, "2024", "11"));
		kia.add(new DataFrame(6500000, 98000, 105000, "2024", "12"));

		// 2025년: 글로벌 Top 3 도약 시나리오
		kia.add(new DataFrame(8500000, 105000, 118000, "2025", "1"));
		kia.add(new DataFrame(9200000, 118000, 125000, "2025", "2"));
		kia.add(new DataFrame(9800000, 125000, 132000, "2025", "3"));
		kia.add(new DataFrame(8500000, 132000, 138000, "2025", "4"));
		kia.add(new DataFrame(8200000, 138000, 145000, "2025", "5"));
		kia.add(new DataFrame(9500000, 145000, 155000, "2025", "6"));
		kia.add(new DataFrame(11000000, 155000, 168000, "2025", "7"));
		kia.add(new DataFrame(9500000, 168000, 162000, "2025", "8"));
		kia.add(new DataFrame(8800000, 162000, 175000, "2025", "9"));
		kia.add(new DataFrame(8200000, 175000, 185000, "2025", "10"));
		kia.add(new DataFrame(9200000, 185000, 192000, "2025", "11"));
		kia.add(new DataFrame(12000000, 192000, 205000, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : kia) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : kia) {
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