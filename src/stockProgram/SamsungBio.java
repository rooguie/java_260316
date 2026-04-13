package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class SamsungBio {

	public List<DataFrame> samsungBio = new ArrayList<>(); // 삼성바이오
	public double rate;

	public List<DataFrame> getSamsungBio() {
		return samsungBio;
	}

	public void setSamsungBio(List<DataFrame> samsungBio) {
		this.samsungBio = samsungBio;
	}

	public SamsungBio() {
		// 2020년: 위탁생산(CMO) 수요 폭증 및 우상향 시작
		samsungBio.add(new DataFrame(450000, 420000, 451000, "2020", "1"));
		samsungBio.add(new DataFrame(500000, 451000, 472500, "2020", "2"));
		samsungBio.add(new DataFrame(1500000, 472500, 421000, "2020", "3"));
		samsungBio.add(new DataFrame(1100000, 421000, 582000, "2020", "4"));
		samsungBio.add(new DataFrame(950000, 582000, 611000, "2020", "5"));
		samsungBio.add(new DataFrame(1200000, 611000, 772000, "2020", "6"));
		samsungBio.add(new DataFrame(1100000, 772000, 741000, "2020", "7"));
		samsungBio.add(new DataFrame(1000000, 741000, 772000, "2020", "8"));
		samsungBio.add(new DataFrame(900000, 772000, 681000, "2020", "9"));
		samsungBio.add(new DataFrame(850000, 681000, 692000, "2020", "10"));
		samsungBio.add(new DataFrame(920000, 692000, 792000, "2020", "11"));
		samsungBio.add(new DataFrame(1100000, 792000, 825000, "2020", "12"));

		// 2021년: '100만 바이오' 달성기
		samsungBio.add(new DataFrame(1200000, 825000, 842000, "2021", "1"));
		samsungBio.add(new DataFrame(950000, 842000, 752000, "2021", "2"));
		samsungBio.add(new DataFrame(820000, 752000, 821000, "2021", "3"));
		samsungBio.add(new DataFrame(780000, 821000, 812000, "2021", "4"));
		samsungBio.add(new DataFrame(1500000, 812000, 882000, "2021", "5"));
		samsungBio.add(new DataFrame(1200000, 882000, 852000, "2021", "6"));
		samsungBio.add(new DataFrame(1100000, 852000, 912000, "2021", "7"));
		samsungBio.add(new DataFrame(2100000, 912000, 1022000, "2021", "8"));
		samsungBio.add(new DataFrame(1500000, 1022000, 882000, "2021", "9"));
		samsungBio.add(new DataFrame(950000, 882000, 875000, "2021", "10"));
		samsungBio.add(new DataFrame(850000, 875000, 885000, "2021", "11"));
		samsungBio.add(new DataFrame(750000, 885000, 902000, "2021", "12"));

		// 2022년: 견고한 박스권 흐름
		samsungBio.add(new DataFrame(650000, 902000, 852000, "2022", "1"));
		samsungBio.add(new DataFrame(580000, 852000, 775000, "2022", "2"));
		samsungBio.add(new DataFrame(620000, 775000, 822000, "2022", "3"));
		samsungBio.add(new DataFrame(550000, 822000, 835000, "2022", "4"));
		samsungBio.add(new DataFrame(510000, 835000, 842000, "2022", "5"));
		samsungBio.add(new DataFrame(680000, 842000, 792000, "2022", "6"));
		samsungBio.add(new DataFrame(750000, 792000, 862000, "2022", "7"));
		samsungBio.add(new DataFrame(850000, 862000, 832000, "2022", "8"));
		samsungBio.add(new DataFrame(950000, 832000, 805000, "2022", "9"));
		samsungBio.add(new DataFrame(1100000, 805000, 885000, "2022", "10"));
		samsungBio.add(new DataFrame(980000, 885000, 892000, "2022", "11"));
		samsungBio.add(new DataFrame(850000, 892000, 821000, "2022", "12"));

		// 2023년: 4공장 가동 및 수주 확대
		samsungBio.add(new DataFrame(550000, 821000, 802000, "2023", "1"));
		samsungBio.add(new DataFrame(580000, 802000, 785000, "2023", "2"));
		samsungBio.add(new DataFrame(620000, 785000, 792000, "2023", "3"));
		samsungBio.add(new DataFrame(550000, 792000, 782000, "2023", "4"));
		samsungBio.add(new DataFrame(510000, 782000, 775000, "2023", "5"));
		samsungBio.add(new DataFrame(680000, 775000, 752000, "2023", "6"));
		samsungBio.add(new DataFrame(750000, 752000, 782000, "2023", "7"));
		samsungBio.add(new DataFrame(850000, 782000, 765000, "2023", "8"));
		samsungBio.add(new DataFrame(950000, 765000, 682000, "2023", "9"));
		samsungBio.add(new DataFrame(1100000, 682000, 712000, "2023", "10"));
		samsungBio.add(new DataFrame(980000, 712000, 725000, "2023", "11"));
		samsungBio.add(new DataFrame(850000, 725000, 760000, "2023", "12"));

		// 2024년: 역사적 고점 회복 시도
		samsungBio.add(new DataFrame(650000, 760000, 842000, "2024", "1"));
		samsungBio.add(new DataFrame(580000, 842000, 811000, "2024", "2"));
		samsungBio.add(new DataFrame(620000, 811000, 831000, "2024", "3"));
		samsungBio.add(new DataFrame(550000, 831000, 782000, "2024", "4"));
		samsungBio.add(new DataFrame(510000, 782000, 791000, "2024", "5"));
		samsungBio.add(new DataFrame(680000, 791000, 812000, "2024", "6"));
		samsungBio.add(new DataFrame(1250000, 812000, 952000, "2024", "7"));
		samsungBio.add(new DataFrame(850000, 952000, 981000, "2024", "8"));
		samsungBio.add(new DataFrame(950000, 981000, 1052000, "2024", "9"));
		samsungBio.add(new DataFrame(1100000, 1052000, 1082000, "2024", "10"));
		samsungBio.add(new DataFrame(980000, 1082000, 1021000, "2024", "11"));
		samsungBio.add(new DataFrame(850000, 1021000, 1052000, "2024", "12"));

		// 2025년: 황제주 등극 및 150만 시나리오
		samsungBio.add(new DataFrame(920000, 1052000, 1095000, "2025", "1"));
		samsungBio.add(new DataFrame(880000, 1095000, 1122000, "2025", "2"));
		samsungBio.add(new DataFrame(950000, 1122000, 1152000, "2025", "3"));
		samsungBio.add(new DataFrame(820000, 1152000, 1141000, "2025", "4"));
		samsungBio.add(new DataFrame(880000, 1141000, 1182000, "2025", "5"));
		samsungBio.add(new DataFrame(1150000, 1182000, 1222000, "2025", "6"));
		samsungBio.add(new DataFrame(1250000, 1222000, 1282000, "2025", "7"));
		samsungBio.add(new DataFrame(1120000, 1282000, 1252000, "2025", "8"));
		samsungBio.add(new DataFrame(1050000, 1252000, 1312000, "2025", "9"));
		samsungBio.add(new DataFrame(980000, 1312000, 1351000, "2025", "10"));
		samsungBio.add(new DataFrame(1050000, 1351000, 1392000, "2025", "11"));
		samsungBio.add(new DataFrame(1550000, 1392000, 1452000, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : samsungBio) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : samsungBio) {
			if (tmp.getYear().equals(finishYear) && tmp.getMonth().equals(finishMonth)) {
				finishPrice = tmp.getFinishPrice();
			}
		}

		rate =finishPrice-startPrice/startPrice*100.0;
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}