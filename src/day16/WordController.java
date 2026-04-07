package day16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {
	
	private List<word> wordBook=new ArrayList<word>();
	
	public void addWord() {
		List<String> tmp = new ArrayList<String>();
		String word1="dog";
		tmp.add("개");
		tmp.add("개과 동물");
		tmp.add("강아지");
		wordBook.add(new word(word1,tmp));
		
		List<String> tmp2 = new ArrayList<String>();
		String word2="cat";
		tmp.add("고양이");
		tmp.add("야옹");
		wordBook.add(new word(word2,tmp2));
		
		List<String> tmp3 = new ArrayList<String>(Arrays.asList("돼지"));
		String word3="pig";
		wordBook.add(new word(word3,tmp3));
	}
	
	public void insertWord(Scanner scan) {
		//List 먼저 선언
		List<String> tmp=new ArrayList<String>();
		
		System.out.println("단어>");
		String word=scan.next();
		
		String end="a";
		while(!end.toLowerCase().equals("y")) {
			System.out.println("뜻>");
			scan.nextLine();
			tmp.add(scan.nextLine());
			System.out.println("계속 입력하시겠습니까?");
			end=scan.next();
		}
		wordBook.add(new word(word,tmp));
		
	}

	public void searchWord(Scanner scan) {
		//단어 검색
		System.out.println("단어>");
		String word=scan.next();
		
		int index=wordBook.indexOf(new word(word));
		
		if(index==-1) {
			System.out.println("검색 단어가 없습니다.");
			return;
		}
		
	}
	
	
	public void modifyWord(Scanner scan) {
		//단어 수정
		System.out.println("단어>");
		String word = scan.next();
		
		int index=wordBook.indexOf(new word(word));
		if(index==-1) {
			System.out.println("검색된 단어가 없습니다.");
			return;
		}
		
		//단어가 존재하는 경우
		List<String> mean =wordBook.get(index).getMean();
		int cnt=0;
		for(String tmp:mean) {
			cnt++;
			System.out.println(cnt+"."+tmp);
		}
		
		System.out.println("수정할 뜻의 번호를 선택>");
		int i=scan.nextInt();
		System.out.println("변경할 뜻 입력:");
		String modify=scan.nextLine();
		
		mean.set(i-1, modify);
		wordBook.set(index, new word(word,mean));
		System.out.println("수정완료");
		
	}
	
	public void removeWord(Scanner scan) {
		//단어 삭제
		System.out.println("단어>");
		String word=scan.next();
		
		if(wordBook.remove(new word(word))) {
			System.out.println("삭제 완료");
			return;
		}
		System.out.println("-----------------");
	}
//	private String word;
//	private List<String> mean = new ArrayList<>();
//	private Map<String, List<String>> vocabulary = new HashMap<String, List<String>>();
//
//	public WordController() {
//	}
//
//	public WordController(String word, List<String> mean) {
//		this.word = word;
//		this.mean = mean;
//	}
//
//	// 단어 더비 데이터
//	public void addWord() {
//		List<String> appleList = new ArrayList<>();
//		appleList.add("사과");
//		appleList.add("빨간 사과");
//		vocabulary.put("apple", appleList);
//
//		List<String> grapeList = new ArrayList<>();
//		grapeList.add("포도");
//		vocabulary.put("grape", grapeList);
//
//	}
//
//	// 단어 등록
//	public void register(Scanner scan) {
//		System.out.println("등록할 단어 입력:");
//		this.word = scan.next();
//		scan.nextLine();
//
//		List<String> mean;
//		System.out.println("단어 뜻 입력");
//		String newMean = scan.next();
//
//		if (vocabulary.containsKey(word)) {
//			mean = vocabulary.get(word);
//			mean.add(newMean);
//			System.out.println("단어 추가 완료");
//		} else {
//			mean = new ArrayList<>();
//			mean.add(newMean);
//			vocabulary.put(word, mean);
//			System.out.println("단어 등록 완료");
//		}
//
//	}
//
//	// 단어 검색
//	public void search(Scanner scan) {
//		System.out.println("검색할 단어 선택:");
//		String word = scan.next();
//
//		if (!this.vocabulary.containsKey(word)) {
//			System.out.println("해당 단어가 존재하지 않음");
//			return;
//		}
//
//		System.out.println("검색한 단어:" + word);
//		int i = 1;
//		for (String tmp : this.vocabulary.get(word)) {
//			System.out.println(i + "." + tmp);
//			i++;
//		}
//	}
//
//	// 단어 수정
//	public void modify(Scanner scan) {
//		System.out.println("수정할 단어 입력:");
//		String word = scan.next();
//
//		if (!this.vocabulary.containsKey(word)) {
//			System.out.println("해당 단어가 존재하지 않음");
//			return;
//		}
//		scan.nextLine();
//
//		System.out.println("선택한 단어:" + word);
//
//		// 단어 뜻 리스트 출력
//		int count = 1;
//		for (String tmp : this.vocabulary.get(word)) {
//			System.out.println(count + "." + tmp);
//			count++;
//		}
//
//		System.out.println("수정할 뜻 선택:");
//		int index = scan.nextInt();
//
//		scan.nextLine();
//
//		System.out.println("수정할 내용:");
//		String mean = scan.nextLine();
//
//		this.vocabulary.get(word).remove(index - 1);
//
//		this.vocabulary.get(word).add(mean);
//
//		// vocabulary.put(word, mean);
//
//		System.out.println("수정 완료");
//
//	}
//
//	// 단어 출력
//	public void wordPrint() {
//		int count = 1;
//
//		for (String key : vocabulary.keySet()) {
//			System.out.println(count + ")" + key);
//			int count2 = 1;
//			for (String tmp : this.vocabulary.get(key)) {
//				System.out.println(count2 + "." + tmp);
//				count2++;
//			}
//			System.out.println("-------------------");
//			count++;
//		}
//	}
//
//	// 단어 삭제
//	public void delete(Scanner scan) {
//
//		wordPrint();
//
//		System.out.println("삭제할 단어 입력:");
//		String word = scan.next();
//
//		if (!this.vocabulary.containsKey(word)) {
//			System.out.println("해당 단어가 존재하지 않음");
//			return;
//		}
//
//		vocabulary.remove(word);
//
//		System.out.println("삭제 완료");
//	}
//
//	public Map<String, List<String>> getVocabulary() {
//		return vocabulary;
//	}
//
//	public void setVocabulary(Map<String, List<String>> vocabulary) {
//		this.vocabulary = vocabulary;
//	}
//
//	public String getWord() {
//		return word;
//	}
//
//	public void setWord(String word) {
//		this.word = word;
//	}
//
//	public List<String> getMean() {
//		return mean;
//	}
//
//	public void setMean(List<String> mean) {
//		this.mean = mean;
//	}
//
//	@Override
//	public String toString() {
//		return "WordController [word=" + word + ", getMean()=" + getMean() + "]";
//	}

}
