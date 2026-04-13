package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class Samsung {

	public List<DataFrame> samsung = new ArrayList<>(); // 삼성전자
	public double rate;

	public List<DataFrame> getSamsung() {
		return samsung;
	}

	public void setSamsung(List<DataFrame> samsung) {
		this.samsung = samsung;
	}

	

	public Samsung() {
		// 2020년: 코로나 폭락 후 동학개미 열풍으로 인한 V자 반등
		samsung.add(new DataFrame(35000000, 55800, 52100, "2020", "1"));
		samsung.add(new DataFrame(42000000, 52100, 54200, "2020", "2"));
		samsung.add(new DataFrame(98000000, 54200, 47700, "2020", "3")); 
		samsung.add(new DataFrame(65000000, 47700, 50000, "2020", "4"));
		samsung.add(new DataFrame(52000000, 50000, 50700, "2020", "5"));
		samsung.add(new DataFrame(58000000, 50700, 52800, "2020", "6"));
		samsung.add(new DataFrame(55000000, 52800, 57900, "2020", "7"));
		samsung.add(new DataFrame(62000000, 57900, 54000, "2020", "8"));
		samsung.add(new DataFrame(65000000, 54000, 58200, "2020", "9"));
		samsung.add(new DataFrame(58000000, 58200, 56600, "2020", "10"));
		samsung.add(new DataFrame(85000000, 56600, 66700, "2020", "11"));
		samsung.add(new DataFrame(92000000, 66700, 81000, "2020", "12"));

		// 2021년: '9만전자' 달성 후 지루한 조정장 (실제 종가 기준 최고점 반영)
		samsung.add(new DataFrame(150000000, 81000, 82000, "2021", "1")); 
		samsung.add(new DataFrame(85000000, 82000, 82500, "2021", "2"));
		samsung.add(new DataFrame(78000000, 82500, 81400, "2021", "3"));
		samsung.add(new DataFrame(65000000, 81400, 81500, "2021", "4"));
		samsung.add(new DataFrame(58000000, 81500, 80500, "2021", "5"));
		samsung.add(new DataFrame(52000000, 80500, 80700, "2021", "6"));
		samsung.add(new DataFrame(48000000, 80700, 78500, "2021", "7"));
		samsung.add(new DataFrame(82000000, 78500, 76700, "2021", "8"));
		samsung.add(new DataFrame(55000000, 76700, 74100, "2021", "9"));
		samsung.add(new DataFrame(52000000, 74100, 69800, "2021", "10"));
		samsung.add(new DataFrame(58000000, 69800, 71300, "2021", "11"));
		samsung.add(new DataFrame(62000000, 71300, 78300, "2021", "12"));

		// 2022년: 인플레이션 및 금리 인상 공포로 인한 하락장 (5만전자 회귀)
		samsung.add(new DataFrame(65000000, 78300, 73300, "2022", "1"));
		samsung.add(new DataFrame(45000000, 73300, 72100, "2022", "2"));
		samsung.add(new DataFrame(58000000, 72100, 69600, "2022", "3"));
		samsung.add(new DataFrame(42000000, 69600, 67400, "2022", "4"));
		samsung.add(new DataFrame(38000000, 67400, 67400, "2022", "5"));
		samsung.add(new DataFrame(62000000, 67400, 57000, "2022", "6"));
		samsung.add(new DataFrame(55000000, 57000, 61400, "2022", "7"));
		samsung.add(new DataFrame(41000000, 61400, 58400, "2022", "8"));
		samsung.add(new DataFrame(48000000, 58400, 53100, "2022", "9"));
		samsung.add(new DataFrame(45000000, 53100, 59400, "2022", "10"));
		samsung.add(new DataFrame(38000000, 59400, 62200, "2022", "11"));
		samsung.add(new DataFrame(32000000, 62200, 55300, "2022", "12"));

		// 2023년: 메모리 감산 선언 및 AI 반도체 기대감으로 반등
		samsung.add(new DataFrame(42000000, 55300, 61000, "2023", "1"));
		samsung.add(new DataFrame(35000000, 61000, 60600, "2023", "2"));
		samsung.add(new DataFrame(38000000, 60600, 64000, "2023", "3"));
		samsung.add(new DataFrame(45000000, 64000, 65500, "2023", "4"));
		samsung.add(new DataFrame(48000000, 65500, 70400, "2023", "5"));
		samsung.add(new DataFrame(41000000, 70400, 72200, "2023", "6"));
		samsung.add(new DataFrame(45000000, 72200, 70500, "2023", "7"));
		samsung.add(new DataFrame(38000000, 70500, 66900, "2023", "8"));
		samsung.add(new DataFrame(35000000, 66900, 68400, "2023", "9"));
		samsung.add(new DataFrame(42000000, 68400, 67300, "2023", "10"));
		samsung.add(new DataFrame(39000000, 67300, 72800, "2023", "11"));
		samsung.add(new DataFrame(45000000, 72800, 78500, "2023", "12"));

		// 2024년: HBM 공급 본격화 및 엔비디아 협력 이슈 (변동성 극대화)
		samsung.add(new DataFrame(48000000, 78500, 73400, "2024", "1"));
		samsung.add(new DataFrame(41000000, 73400, 73400, "2024", "2"));
		samsung.add(new DataFrame(55000000, 73400, 82400, "2024", "3"));
		samsung.add(new DataFrame(62000000, 82400, 77500, "2024", "4"));
		samsung.add(new DataFrame(48000000, 77500, 73500, "2024", "5"));
		samsung.add(new DataFrame(51000000, 73500, 81500, "2024", "6"));
		samsung.add(new DataFrame(85000000, 81500, 87800, "2024", "7")); 
		samsung.add(new DataFrame(65000000, 87800, 74300, "2024", "8"));
		samsung.add(new DataFrame(52000000, 74300, 61500, "2024", "9"));
		samsung.add(new DataFrame(48000000, 61500, 59100, "2024", "10"));
		samsung.add(new DataFrame(45000000, 59100, 56300, "2024", "11"));
		samsung.add(new DataFrame(42000000, 56300, 58000, "2024", "12"));

		// 2025년: 2나노 양산 성공 및 파운드리 반격 (10만전자 돌파 시나리오)
		samsung.add(new DataFrame(42000000, 58000, 65000, "2025", "1"));
		samsung.add(new DataFrame(38000000, 65000, 72000, "2025", "2"));
		samsung.add(new DataFrame(45000000, 72000, 78500, "2025", "3"));
		samsung.add(new DataFrame(42000000, 78500, 83000, "2025", "4"));
		samsung.add(new DataFrame(48000000, 83000, 89500, "2025", "5"));
		samsung.add(new DataFrame(55000000, 89500, 95000, "2025", "6"));
		samsung.add(new DataFrame(72000000, 95000, 102000, "2025", "7")); 
		samsung.add(new DataFrame(68000000, 102000, 105500, "2025", "8"));
		samsung.add(new DataFrame(62000000, 105500, 108000, "2025", "9"));
		samsung.add(new DataFrame(58000000, 108000, 114000, "2025", "10"));
		samsung.add(new DataFrame(65000000, 114000, 122000, "2025", "11"));
		samsung.add(new DataFrame(85000000, 122000, 128500, "2025", "12"));
	}
	
	
	public void rateCal(String starYear,String startMonth,String finishYear,String finishMonth) {
		int startPrice=0;
		int finishPrice=0;
		double rate=0;
		
		
		for(DataFrame tmp:samsung) {
			if(tmp.getYear().equals(starYear) && tmp.getMonth().equals(startMonth)) {
				startPrice=tmp.getStartPrice();
			}
		}
		
		for(DataFrame tmp:samsung) {
			if(tmp.getYear().equals(finishYear) && tmp.getMonth().equals(finishMonth)) {
				finishPrice=tmp.getFinishPrice();
			}
		}
		
		rate =(double)(finishPrice-startPrice)/startPrice*100;
		
		this.rate=rate;
		
	}
	

	
	
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}