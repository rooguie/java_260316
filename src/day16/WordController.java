package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private String word;
	private List<String> mean=new ArrayList<String>();
	private Map<String, List<String>> vocabulary = new HashMap<String, List<String>>();

	public WordController() {
	}

	public WordController(String word) {
		this.word = word;
	}


	// 단어 더비 데이터
	public void addWord() {
		
	}

	// 단어 등록
	public void register(Scanner scan) {
		System.out.println("등록할 단어 입력:");
		this.word = scan.next();

		scan.nextLine();

		System.out.println("단어 뜻 입력:");
		this.mean.add(scan.nextLine());

		this.vocabulary.put(word, mean);

		System.out.println("단어 등록 완료");

	}

	// 단어 검색
	public void search(Scanner scan) {
		System.out.println("검색할 단어 선택:");
		String word = scan.next();

		if (!this.vocabulary.containsKey(word)) {
			System.out.println("해당 단어가 존재하지 않음");
			return;
		}

		System.out.println(word + ":" + this.vocabulary.get(word));

	}

	// 단어 수정
	public void modify(Scanner scan) {
		System.out.println("수정할 단어 입력:");
		String word = scan.next();

		if (!this.vocabulary.containsKey(word)) {
			System.out.println("해당 단어가 존재하지 않음");
			return;
		}
		scan.nextLine();

		System.out.println("수정할 내용:");
		String mean = scan.nextLine();

		vocabulary.put(word, mean);

		System.out.println("수정 완료");

	}

	// 단어 출력
	public void wordPrint() {
		int count = 1;
		for (String key : vocabulary.keySet()) {
			System.out.println(count + "." + key + ":" + vocabulary.get(key));
			count++;
		}
	}

	// 단어 삭제
	public void delete(Scanner scan) {
		System.out.println("삭제할 단어 입력:");
		String word = scan.next();

		if (!this.vocabulary.containsKey(word)) {
			System.out.println("해당 단어가 존재하지 않음");
			return;
		}

		vocabulary.remove(word);

		System.out.println("삭제 완료");
	}

	public Map<String, List<String>> getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(Map<String, List<String>> vocabulary) {
		this.vocabulary = vocabulary;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

}
