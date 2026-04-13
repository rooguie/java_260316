package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class Kakao {

	public List<DataFrame> kakao = new ArrayList<>(); // 카카오
	public double rate;

	public List<DataFrame> getKakao() {
		return kakao;
	}

	public void setKakao(List<DataFrame> kakao) {
		this.kakao = kakao;
	}

	public Kakao() {
		// 2020년
		kakao.add(new DataFrame(4500000, 30500, 31200, "2020", "1"));
		kakao.add(new DataFrame(5000000, 31200, 32500, "2020", "2"));
		kakao.add(new DataFrame(12000000, 32500, 26100, "2020", "3"));
		kakao.add(new DataFrame(8000000, 26100, 36200, "2020", "4"));
		kakao.add(new DataFrame(6500000, 36200, 52100, "2020", "5"));
		kakao.add(new DataFrame(9200000, 52100, 53200, "2020", "6"));
		kakao.add(new DataFrame(8500000, 53200, 69500, "2020", "7"));
		kakao.add(new DataFrame(9800000, 69500, 81400, "2020", "8"));
		kakao.add(new DataFrame(7200000, 81400, 72300, "2020", "9"));
		kakao.add(new DataFrame(6500000, 72300, 66100, "2020", "10"));
		kakao.add(new DataFrame(6800000, 66100, 74200, "2020", "11"));
		kakao.add(new DataFrame(8200000, 74200, 78200, "2020", "12"));

		// 2021년
		kakao.add(new DataFrame(15500000, 78200, 88200, "2021", "1"));
		kakao.add(new DataFrame(9500000, 88200, 97100, "2021", "2"));
		kakao.add(new DataFrame(8200000, 97100, 99500, "2021", "3"));
		kakao.add(new DataFrame(12000000, 99500, 113500, "2021", "4"));
		kakao.add(new DataFrame(8500000, 113500, 122500, "2021", "5"));
		kakao.add(new DataFrame(18000000, 122500, 163000, "2021", "6"));
		kakao.add(new DataFrame(9500000, 163000, 147500, "2021", "7"));
		kakao.add(new DataFrame(7500000, 147500, 155500, "2021", "8"));
		kakao.add(new DataFrame(15000000, 155500, 118000, "2021", "9"));
		kakao.add(new DataFrame(6200000, 118000, 125500, "2021", "10"));
		kakao.add(new DataFrame(5800000, 125500, 122500, "2021", "11"));
		kakao.add(new DataFrame(4500000, 122500, 112500, "2021", "12"));

		// 2022년
		kakao.add(new DataFrame(5500000, 112500, 85200, "2022", "1"));
		kakao.add(new DataFrame(4200000, 85200, 94100, "2022", "2"));
		kakao.add(new DataFrame(4800000, 94100, 105500, "2022", "3"));
		kakao.add(new DataFrame(4100000, 105500, 89500, "2022", "4"));
		kakao.add(new DataFrame(3800000, 89500, 83100, "2022", "5"));
		kakao.add(new DataFrame(4200000, 83100, 69500, "2022", "6"));
		kakao.add(new DataFrame(4500000, 69500, 72100, "2022", "7"));
		kakao.add(new DataFrame(3800000, 72100, 74500, "2022", "8"));
		kakao.add(new DataFrame(3500000, 74500, 55300, "2022", "9"));
		kakao.add(new DataFrame(12000000, 55300, 49500, "2022", "10"));
		kakao.add(new DataFrame(3800000, 49500, 56200, "2022", "11"));
		kakao.add(new DataFrame(3200000, 56200, 53100, "2022", "12"));

		// 2023년
		kakao.add(new DataFrame(3500000, 53100, 61500, "2023", "1"));
		kakao.add(new DataFrame(3800000, 61500, 62100, "2023", "2"));
		kakao.add(new DataFrame(4200000, 62100, 61000, "2023", "3"));
		kakao.add(new DataFrame(3800000, 61000, 58100, "2023", "4"));
		kakao.add(new DataFrame(4500000, 58100, 56200, "2023", "5"));
		kakao.add(new DataFrame(4100000, 56200, 49150, "2023", "6"));
		kakao.add(new DataFrame(4800000, 49150, 51000, "2023", "7"));
		kakao.add(new DataFrame(3500000, 51000, 48500, "2023", "8"));
		kakao.add(new DataFrame(3200000, 48500, 45200, "2023", "9"));
		kakao.add(new DataFrame(3800000, 45200, 38100, "2023", "10"));
		kakao.add(new DataFrame(4100000, 38100, 49800, "2023", "11"));
		kakao.add(new DataFrame(3500000, 49800, 54300, "2023", "12"));

		// 2024년
		kakao.add(new DataFrame(5500000, 54300, 51200, "2024", "1"));
		kakao.add(new DataFrame(6200000, 51200, 53500, "2024", "2"));
		kakao.add(new DataFrame(5800000, 53500, 47500, "2024", "3"));
		kakao.add(new DataFrame(5200000, 47500, 48200, "2024", "4"));
		kakao.add(new DataFrame(4800000, 48200, 45800, "2024", "5"));
		kakao.add(new DataFrame(5500000, 45800, 41200, "2024", "6"));
		kakao.add(new DataFrame(6800000, 41200, 39500, "2024", "7"));
		kakao.add(new DataFrame(6100000, 39500, 37200, "2024", "8"));
		kakao.add(new DataFrame(5500000, 37200, 36100, "2024", "9"));
		kakao.add(new DataFrame(4800000, 36100, 35500, "2024", "10"));
		kakao.add(new DataFrame(5200000, 35500, 36800, "2024", "11")); 
		kakao.add(new DataFrame(6500000, 36800, 38000, "2024", "12"));

		// 2025년
		kakao.add(new DataFrame(5500000, 38000, 41200, "2025", "1"));
		kakao.add(new DataFrame(6200000, 41200, 43500, "2025", "2"));
		kakao.add(new DataFrame(5800000, 43500, 46800, "2025", "3"));
		kakao.add(new DataFrame(5200000, 46800, 47200, "2025", "4"));
		kakao.add(new DataFrame(4800000, 47200, 51500, "2025", "5"));
		kakao.add(new DataFrame(5500000, 51500, 54500, "2025", "6"));
		kakao.add(new DataFrame(6800000, 54500, 56800, "2025", "7"));
		kakao.add(new DataFrame(6100000, 56800, 55200, "2025", "8"));
		kakao.add(new DataFrame(5500000, 55200, 58200, "2025", "9"));
		kakao.add(new DataFrame(4800000, 58200, 61500, "2025", "10"));
		kakao.add(new DataFrame(5200000, 61500, 64200, "2025", "11"));
		kakao.add(new DataFrame(6500000, 64200, 68500, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : kakao) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : kakao) {
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