package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class SamsungCnt {

	public List<DataFrame> samsungCnt = new ArrayList<>(); // 삼성물산
	public double rate;

	public List<DataFrame> getSamsungCnt() {
		return samsungCnt;
	}

	public void setSamsungCnt(List<DataFrame> samsungCnt) {
		this.samsungCnt = samsungCnt;
	}

	public SamsungCnt() {
		// 2020년
		samsungCnt.add(new DataFrame(800000, 108000, 112000, "2020", "1"));
		samsungCnt.add(new DataFrame(750000, 112000, 105000, "2020", "2"));
		samsungCnt.add(new DataFrame(2100000, 105000, 75000, "2020", "3")); 
		samsungCnt.add(new DataFrame(1500000, 75000, 92000, "2020", "4"));
		samsungCnt.add(new DataFrame(1100000, 92000, 98000, "2020", "5"));
		samsungCnt.add(new DataFrame(1300000, 98000, 115000, "2020", "6"));
		samsungCnt.add(new DataFrame(1100000, 115000, 108000, "2020", "7"));
		samsungCnt.add(new DataFrame(1400000, 108000, 105000, "2020", "8"));
		samsungCnt.add(new DataFrame(1200000, 105000, 102000, "2020", "9"));
		samsungCnt.add(new DataFrame(1000000, 102000, 112000, "2020", "10"));
		samsungCnt.add(new DataFrame(1800000, 112000, 124000, "2020", "11"));
		samsungCnt.add(new DataFrame(1500000, 124000, 138000, "2020", "12"));

		// 2021년
		samsungCnt.add(new DataFrame(1200000, 138000, 142000, "2021", "1"));
		samsungCnt.add(new DataFrame(1100000, 142000, 135000, "2021", "2"));
		samsungCnt.add(new DataFrame(950000, 135000, 128000, "2021", "3"));
		samsungCnt.add(new DataFrame(880000, 128000, 131000, "2021", "4"));
		samsungCnt.add(new DataFrame(1050000, 131000, 138500, "2021", "5"));
		samsungCnt.add(new DataFrame(980000, 138500, 132000, "2021", "6"));
		samsungCnt.add(new DataFrame(850000, 132000, 128500, "2021", "7"));
		samsungCnt.add(new DataFrame(780000, 128500, 124000, "2021", "8"));
		samsungCnt.add(new DataFrame(820000, 124000, 121500, "2021", "9"));
		samsungCnt.add(new DataFrame(750000, 121500, 118000, "2021", "10"));
		samsungCnt.add(new DataFrame(880000, 118000, 115500, "2021", "11"));
		samsungCnt.add(new DataFrame(920000, 115500, 119000, "2021", "12"));

		// 2022년
		samsungCnt.add(new DataFrame(850000, 119000, 112000, "2022", "1"));
		samsungCnt.add(new DataFrame(780000, 112000, 108500, "2022", "2"));
		samsungCnt.add(new DataFrame(820000, 108500, 114000, "2022", "3"));
		samsungCnt.add(new DataFrame(750000, 114000, 111500, "2022", "4"));
		samsungCnt.add(new DataFrame(720000, 111500, 113000, "2022", "5"));
		samsungCnt.add(new DataFrame(950000, 113000, 105500, "2022", "6"));
		samsungCnt.add(new DataFrame(880000, 105500, 118500, "2022", "7"));
		samsungCnt.add(new DataFrame(820000, 118500, 116000, "2022", "8"));
		samsungCnt.add(new DataFrame(780000, 116000, 109500, "2022", "9"));
		samsungCnt.add(new DataFrame(750000, 109500, 112000, "2022", "10"));
		samsungCnt.add(new DataFrame(720000, 112000, 118500, "2022", "11"));
		samsungCnt.add(new DataFrame(850000, 118500, 113500, "2022", "12"));

		// 2023년
		samsungCnt.add(new DataFrame(920000, 113500, 115000, "2023", "1"));
		samsungCnt.add(new DataFrame(880000, 115000, 112500, "2023", "2"));
		samsungCnt.add(new DataFrame(950000, 112500, 108500, "2023", "3"));
		samsungCnt.add(new DataFrame(820000, 108500, 110500, "2023", "4"));
		samsungCnt.add(new DataFrame(880000, 110500, 109000, "2023", "5"));
		samsungCnt.add(new DataFrame(1150000, 109000, 105500, "2023", "6"));
		samsungCnt.add(new DataFrame(1250000, 105500, 104500, "2023", "7"));
		samsungCnt.add(new DataFrame(1120000, 104500, 106500, "2023", "8"));
		samsungCnt.add(new DataFrame(1050000, 106500, 112500, "2023", "9"));
		samsungCnt.add(new DataFrame(980000, 112500, 118500, "2023", "10"));
		samsungCnt.add(new DataFrame(1050000, 118500, 124500, "2023", "11"));
		samsungCnt.add(new DataFrame(1550000, 124500, 129800, "2023", "12"));

		// 2024년
		samsungCnt.add(new DataFrame(2500000, 129800, 162500, "2024", "1"));
		samsungCnt.add(new DataFrame(2200000, 162500, 168500, "2024", "2"));
		samsungCnt.add(new DataFrame(1800000, 168500, 155500, "2024", "3"));
		samsungCnt.add(new DataFrame(1500000, 155500, 148500, "2024", "4"));
		samsungCnt.add(new DataFrame(1300000, 148500, 152500, "2024", "5"));
		samsungCnt.add(new DataFrame(1200000, 152500, 158500, "2024", "6"));
		samsungCnt.add(new DataFrame(1100000, 158500, 145500, "2024", "7"));
		samsungCnt.add(new DataFrame(1000000, 145500, 138500, "2024", "8"));
		samsungCnt.add(new DataFrame(950000, 138500, 142500, "2024", "9"));
		samsungCnt.add(new DataFrame(900000, 142500, 135500, "2024", "10"));
		samsungCnt.add(new DataFrame(850000, 135500, 138500, "2024", "11"));
		samsungCnt.add(new DataFrame(1200000, 138500, 148500, "2024", "12"));

		// 2025년
		samsungCnt.add(new DataFrame(1500000, 148500, 158500, "2025", "1"));
		samsungCnt.add(new DataFrame(1600000, 158500, 165500, "2025", "2"));
		samsungCnt.add(new DataFrame(1700000, 165500, 172500, "2025", "3"));
		samsungCnt.add(new DataFrame(1800000, 172500, 185500, "2025", "4"));
		samsungCnt.add(new DataFrame(1900000, 185500, 192500, "2025", "5"));
		samsungCnt.add(new DataFrame(2100000, 192500, 205500, "2025", "6"));
		samsungCnt.add(new DataFrame(2300000, 205500, 218500, "2025", "7"));
		samsungCnt.add(new DataFrame(2100000, 218500, 210500, "2025", "8"));
		samsungCnt.add(new DataFrame(1900000, 210500, 225500, "2025", "9"));
		samsungCnt.add(new DataFrame(1800000, 225500, 238500, "2025", "10"));
		samsungCnt.add(new DataFrame(1900000, 238500, 245500, "2025", "11"));
		samsungCnt.add(new DataFrame(2500000, 245500, 260500, "2025", "12"));
	}

	public void rateCal(String starYear, String startMonth, String finishYear, String finishMonth) {
		int startPrice = 0;
		int finishPrice = 0;
		double rate = 0;

		for (DataFrame tmp : samsungCnt) {
			if (tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice = tmp.getStartPrice();
			}
		}

		for (DataFrame tmp : samsungCnt) {
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