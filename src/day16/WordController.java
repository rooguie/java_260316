package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private String word;
	private List<String> mean = new ArrayList<>();
	private Map<String, List<String>> vocabulary = new HashMap<String, List<String>>();

	public WordController() {
	}

	public WordController(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}

	// 단어 더비 데이터
	public void addWord() {
		List<String> appleList = new ArrayList<>();
		appleList.add("사과");
		appleList.add("빨간 사과");
		vocabulary.put("apple", appleList);

		List<String> grapeList = new ArrayList<>();
		grapeList.add("포도");
		vocabulary.put("grape", grapeList);

	}

	// 단어 등록
	public void register(Scanner scan) {
		System.out.println("등록할 단어 입력:");
		this.word = scan.next();
		scan.nextLine();

		List<String> mean;
		System.out.println("단어 뜻 입력");
		String newMean = scan.next();

		if (vocabulary.containsKey(word)) {
			mean = vocabulary.get(word);
			mean.add(newMean);
			System.out.println("단어 추가 완료");
		} else {
			mean = new ArrayList<>();
			mean.add(newMean);
			vocabulary.put(word, mean);
			System.out.println("단어 등록 완료");
		}

	}

	// 단어 검색
	public void search(Scanner scan) {
		System.out.println("검색할 단어 선택:");
		String word = scan.next();

		if (!this.vocabulary.containsKey(word)) {
			System.out.println("해당 단어가 존재하지 않음");
			return;
		}

		System.out.println("검색한 단어:" + word);
		int i = 1;
		for (String tmp : this.vocabulary.get(word)) {
			System.out.println(i + "." + tmp);
			i++;
		}
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

		System.out.println("선택한 단어:" + word);

		// 단어 뜻 리스트 출력
		int count = 1;
		for (String tmp : this.vocabulary.get(word)) {
			System.out.println(count + "." + tmp);
			count++;
		}

		System.out.println("수정할 뜻 선택:");
		int index = scan.nextInt();

		scan.nextLine();

		System.out.println("수정할 내용:");
		String mean = scan.nextLine();

		this.vocabulary.get(word).remove(index - 1);

		this.vocabulary.get(word).add(mean);

		// vocabulary.put(word, mean);

		System.out.println("수정 완료");

	}

	// 단어 출력
	public void wordPrint() {
		int count = 1;

		for (String key : vocabulary.keySet()) {
			System.out.println(count + ")" + key);
			int count2 = 1;
			for (String tmp : this.vocabulary.get(key)) {
				System.out.println(count2 + "." + tmp);
				count2++;
			}
			System.out.println("-------------------");
			count++;
		}
	}

	// 단어 삭제
	public void delete(Scanner scan) {

		wordPrint();

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

	public List<String> getMean() {
		return mean;
	}

	public void setMean(List<String> mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "WordController [word=" + word + ", getMean()=" + getMean() + "]";
	}

}
