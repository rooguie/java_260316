package stockProgram;

public class DataFrame {
	
	private int volume;
	private int startPrice;
	private int finishPrice;
	private String year;
	private String month;
	
	
	public DataFrame(int volume, int startPrice, int finishPrice, String year, String month) {
		this.volume = volume;
		this.startPrice = startPrice;
		this.finishPrice = finishPrice;
		this.year = year;
		this.month = month;
	}



	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getStartPrice() {
		return startPrice;
	}


	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}


	public int getFinishPrice() {
		return finishPrice;
	}


	public void setFinishPrice(int finishPrice) {
		this.finishPrice = finishPrice;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}
	

}
