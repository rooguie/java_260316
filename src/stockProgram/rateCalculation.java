package stockProgram;

import java.lang.reflect.Method;

public class rateCalculation {

	private double rate;

	public rateCalculation() {}

	public void calRate(String stockName, String startYear, String startMonth, String finishYear, String finishMonth) {
		// List<String> stockNames = Arrays.asList("Samsung", "Kakao", "Hyundai", "SamsungBio", "SamsungCnt", "SkHynix",
		// 		"Kia", "LG", "Posco", "Naver");

		String name = "stockProgram." + stockName;

		try {

			Class<?> clazz = Class.forName(name);

			Object instance = clazz.getDeclaredConstructor().newInstance();

			Method calRateMethod = clazz.getMethod("rateCal", String.class, String.class, String.class, String.class);

			calRateMethod.invoke(instance, startYear, startMonth, finishYear, finishMonth);

			Method getRateMethod = clazz.getMethod("getRate");
			double resultRate = (double) getRateMethod.invoke(instance);
			
			this.rate=resultRate;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("뭔지 모를 오류");
			
		}

	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}