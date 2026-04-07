package day16;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class word implements Comparable<word> {

	



	private String word;
	private List<String> mean =new ArrayList<>();
	
	public word() {}
	
	public word(String word) {
		this.word=word;
	}
	
	public word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	} 
	
	
	
	@Override
	public String toString() {
		return  word + ":" + mean;
	}



	public String getWord() {
		return word;
	}


	@Override
	public int hashCode() {
		return Objects.hash(word);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		word other = (word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public int compareTo(word o) {
		// this와 o를 비교 => 오름차순
		return this.word.compareTo(o.getWord());
	}


	public void setWord(String word) {
		this.word = word;
	}


	public List<String> getMean() {
		return mean;
	}


	public void setMean(List<String> mean) {
		this.mean = mean;
	}



	
	
	
	
}
