package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class LG {

	public List<DataFrame> lg = new ArrayList<>(); // LG전자
	public double rate;

	public List<DataFrame> getLg() {
		return lg;
	}

	public void setLg(List<DataFrame> lg) {
		this.lg = lg;
	}

	public LG() {
		// 2020년: 코로나 가전 수요 폭증
		lg.add(new DataFrame(1100000, 72100, 68500, "2020", "1"));
		lg.add(new DataFrame(1250000, 68500, 62200, "2020", "2"));
		lg.add(new DataFrame(3500000, 62200, 48200, "2020", "3")); // 저점
		lg.add(new DataFrame(1800000, 48200, 56500, "2020", "4"));
		lg.add(new DataFrame(1400000, 56500, 58200, "2020", "5"));
		lg.add(new DataFrame(1650000, 58200, 63200, "2020", "6"));
		lg.add(new DataFrame(1950000, 63200, 72500, "2020", "7"));
		lg.add(new DataFrame(2850000, 72500, 84200, "2020", "8"));
		lg.add(new DataFrame(1850000, 84200, 91200, "2020", "9"));
		lg.add(new DataFrame(1550000, 91200, 88500, "2020", "10"));
		lg.add(new DataFrame(2150000, 88500, 94200, "2020", "11"));
		lg.add(new DataFrame(8500000, 94200, 135000, "2020", "12")); // 마그나 합작 발표 폭등

		// 2021년: 휴대폰 사업 철수 및 전장 기대감 피크
		lg.add(new DataFrame(12500000, 135000, 167500, "2021", "1")); // 고점
		lg.add(new DataFrame(5500000, 167500, 155000, "2021", "2"));
		lg.add(new DataFrame(4800000, 155000, 148500, "2021", "3"));
		lg.add(new DataFrame(6200000, 148500, 158500, "2021", "4"));
		lg.add(new DataFrame(4500000, 158500, 152500, "2021", "5"));
		lg.add(new DataFrame(3800000, 152500, 163500, "2021", "6"));
		lg.add(new DataFrame(4200000, 163500, 158000, "2021", "7"));
		lg.add(new DataFrame(3500000, 158000, 147500, "2021", "8"));
		lg.add(new DataFrame(2800000, 147500, 128500, "2021", "9"));
		lg.add(new DataFrame(3100000, 128500, 123500, "2021", "10"));
		lg.add(new DataFrame(2500000, 123500, 124500, "2021", "11"));
		lg.add(new DataFrame(3200000, 124500, 138000, "2021", "12"));

		// 2022년: 인플레이션 및 원자재값 상승 하락장
		lg.add(new DataFrame(2500000, 138000, 126500, "2022", "1"));
		lg.add(new DataFrame(2200000, 126500, 121500, "2022", "2"));
		lg.add(new DataFrame(2800000, 121500, 118500, "2022", "3"));
		lg.add(new DataFrame(2100000, 118500, 112500, "2022", "4"));
		lg.add(new DataFrame(1950000, 112500, 104500, "2022", "5"));
		lg.add(new DataFrame(2250000, 104500, 91200, "2022", "6"));
		lg.add(new DataFrame(2100000, 91200, 94500, "2022", "7"));
		lg.add(new DataFrame(1850000, 94500, 98200, "2022", "8"));
		lg.add(new DataFrame(1750000, 98200, 81500, "2022", "9"));
		lg.add(new DataFrame(1950000, 81500, 78500, "2022", "10"));
		lg.add(new DataFrame(2100000, 78500, 85200, "2022", "11"));
		lg.add(new DataFrame(1850000, 85200, 86500, "2022", "12"));

		// 2023년: 전장 사업 흑자 전환 및 실적 반등
		lg.add(new DataFrame(2100000, 86500, 102500, "2023", "1"));
		lg.add(new DataFrame(2500000, 102500, 114500, "2023", "2"));
		lg.add(new DataFrame(2800000, 114500, 112500, "2023", "3"));
		lg.add(new DataFrame(2100000, 112500, 108500, "2023", "4"));
		lg.add(new DataFrame(2400000, 108500, 122500, "2023", "5"));
		lg.add(new DataFrame(2800000, 122500, 126500, "2023", "6"));
		lg.add(new DataFrame(2100000, 126500, 115500, "2023", "7"));
		lg.add(new DataFrame(1850000, 115500, 102500, "2023", "8"));
		lg.add(new DataFrame(1650000, 102500, 104500, "2023", "9"));
		lg.add(new DataFrame(1950000, 104500, 101500, "2023", "10"));
		lg.add(new DataFrame(1800000, 101500, 103500, "2023", "11"));
		lg.add(new DataFrame(1550000, 103500, 101700, "2023", "12"));

		// 2024년: 가전 구독 모델 및 기업가치 제고
		lg.add(new DataFrame(1850000, 101700, 95200, "2024", "1"));
		lg.add(new DataFrame(2100000, 95200, 98200, "2024", "2"));
		lg.add(new DataFrame(1950000, 98200, 94500, "2024", "3"));
		lg.add(new DataFrame(1750000, 94500, 96500, "2024", "4"));
		lg.add(new DataFrame(2500000, 96500, 108500, "2024", "5"));
		lg.add(new DataFrame(3200000, 108500, 112500, "2024", "6"));
		lg.add(new DataFrame(2800000, 112500, 105500, "2024", "7"));
		lg.add(new DataFrame(2100000, 105500, 102500, "2024", "8"));
		lg.add(new DataFrame(1950000, 102500, 108200, "2024", "9"));
		lg.add(new DataFrame(1800000, 108200, 100500, "2024", "10"));
		lg.add(new DataFrame(1650000, 100500, 98500, "2024", "11"));
		lg.add(new DataFrame(1850000, 98500, 102500, "2024", "12"));

		// 2025년: 스마트 라이프 솔루션 기업 변모 시나리오
		lg.add(new DataFrame(2500000, 102500, 115000, "2025", "1"));
		lg.add(new DataFrame(2800000, 115000, 122000, "2025", "2"));
		lg.add(new DataFrame(2600000, 122000, 131000, "2025", "3"));
		lg.add(new DataFrame(2400000, 131000, 128000, "2025", "4"));
		lg.add(new DataFrame(2200000, 128000, 135000, "2025", "5"));
		lg.add(new DataFrame(2800000, 135000, 148000, "2025", "6"));
		lg.add(new DataFrame(3500000, 148000, 155000, "2025", "7"));
		lg.add(new DataFrame(3100000, 155000, 151000, "2025", "8"));
		lg.add(new DataFrame(2800000, 151000, 158000, "2025", "9"));
		lg.add(new DataFrame(2500000, 158000, 165000, "2025", "10"));
		lg.add(new DataFrame(2900000, 165000, 172000, "2025", "11"));
		lg.add(new DataFrame(3800000, 172000, 185000, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : lg) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : lg) {
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