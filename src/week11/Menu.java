package week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Map;

class Menu {
	Scanner key;
	private HashMap<String, String> styleMap = new HashMap<>();
	
	void menuPrint() {
		System.out.println("\n---이화 패션 추천---");
		System.out.println("0. 검색");
		System.out.println("1. Spring");
		System.out.println("2. Summer");
		System.out.println("3. Fall");
		System.out.println("4. Winter");
		System.out.println("----------------");
		System.out.println("5. File Read");
		System.out.println("6. File Save");
		System.out.println("7. Exit");
		System.out.println("----------------");
		System.out.print("Choose an option:");
	}
	
	//추천 스타일 초기화
	private void initializeStyles() {
		styleMap.put("Spring_Warm", "가벼운 청바지와 블라우스");
		styleMap.put("Spring_Cool", "얇은 니트와 스커트");
		styleMap.put("Summer_Hot", "반바지와 민소매 티셔츠");
		styleMap.put("Summer_Cool", "얇은 가디건과 원피스");
		styleMap.put("Fall_Warm", "트렌치코트와 슬랙스");
		styleMap.put("Fall_Cool", "니트와 체크무늬 스커트");
		styleMap.put("Winter_Cold", "패팅과 목도리");
		styleMap.put("Winter_Cool", "울 코트와 부츠");
		
		System.out.println("기본 스타일 추천");
		System.out.println("Spring_Warm" + "=" + "가벼운 청바지와 블라우스");
		System.out.println("Spring_Cool" + "=" + "얇은 니트와 스커트");
		System.out.println("Summer_Hot" + "=" + "반바지와 민소매 티셔츠");
		System.out.println("Summer_Cool" + "=" + "얇은 가디건과 원피스");
		System.out.println("Fall_Warm" + "=" + "트렌치코트와 슬랙스");
		System.out.println("Fall_Cool" + "=" + "니트와 체크무늬 스커트");
		System.out.println("Winter_Cold" + "=" + "패팅과 목도리");
		System.out.println("Winter_Cool" + "=" + "울 코트와 부츠");
		
	}
	
	public String getRecommendedStyle(String season, String weather) {
		Scanner scanner = new Scanner(System.in);
		String key = season + "_" + weather;
		String result = styleMap.get(key);
		String style;
		
		if(result == null) {
			System.out.println("해당 season과 weather에 맞는 스타일이 없습니다.");
			System.out.print("추천 조합을 입력해주세요 : ");
			style = scanner.nextLine();
			styleMap.put(key, style);
			result = styleMap.get(key);
			System.out.println("해당 조합으로 입력되었습니다.");
		}
		
		return result;
	}
	
	private int getMenu() {
		key = new Scanner(System.in);
		menuPrint();
		int menu;
		while(true) {
			try {
				menu = key.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				key.nextLine();
				menuPrint();
				continue;
			}
			break;
		}
		key.nextLine();
		return menu;
	}
	
	public void run(String user) {
		System.out.println("========================================");
		System.out.println("[" + user + "]");
		System.out.println("========================================");
		initializeStyles();
		while(true) {
			int choice = getMenu();
			
			switch(choice) {
			case 0:
				search(key);
				break;
			case 1:
				spring(key);
				break;
			case 2:
				summer(key);
				break;
			case 3:
				fall(key);
				break;
			case 4:
				winter(key);
				break;
			case 5:
				readFashion(key);
				break;
			case 6:
				saveFashion(key);
				break;
			case 7:
				System.out.println(user);
				System.out.println("24년 이화 정원을 마음껏 누리세요^^");
				return;
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				break;
			}
		}
		
	}
	
	private void search(Scanner scanner) {
		String season;
		String weather;
		String result;
		System.out.print("season을 입력하세요: ");
		season = scanner.nextLine();
		System.out.print("weather을 입력하세요: ");
		weather = scanner.nextLine();
		result = getRecommendedStyle(season, weather);
		System.out.println("추천 스타일: " + result);
	}
	
	private void spring(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1:Spring_Warm   2:Spring_Cool: ");
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scanner.nextLine();
				continue;
			}
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Spring", "Warm");
				System.out.println("추천 스타일: " + result);
				break;
			
			case 2:
				result = getRecommendedStyle("Spring", "Cool");
				System.out.println("추천 스타일: " + result);
				break;
			
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				break;
			}
			break;
		}
	}
	
	private void summer(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1:Summer_Hot   2:Summer_Cool: ");
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scanner.nextLine();
				continue;
			}
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Summer", "Hot");
				System.out.println("추천 스타일: " + result);
				break;
			
			case 2:
				result = getRecommendedStyle("Summer", "Cool");
				System.out.println("추천 스타일: " + result);
				break;
				
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				break;
			}
			break;
		}
	}
	
	private void fall(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1:Fall_Warm   2:Fall_Cool: ");
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scanner.nextLine();
				continue;
			}
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Fall", "Warm");
				System.out.println("추천 스타일: " + result);
				break;
			
			case 2:
				result = getRecommendedStyle("Fall", "Cool");
				System.out.println("추천 스타일: " + result);
				break;
			
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				break;
			}
			break;
		}
	}
	
	private void winter(Scanner scanner) {
		int number;
		while(true) {
			try {
				System.out.print("1:Winter_Cold   2:Winter_Cool: ");
				number = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scanner.nextLine();
				continue;
			}
			
			String result;
			switch(number) {
			case 1:
				result = getRecommendedStyle("Winter", "Cold");
				System.out.println("추천 스타일: " + result);
				break;
			
			case 2:
				result = getRecommendedStyle("Winter", "Cool");
				System.out.println("추천 스타일: " + result);
				break;
			
			default:
				System.out.println("잘못 입력했습니다! 다시 입력하세요");
				break;
			}
			break;
		}
	}
	
	private void saveFashion(Scanner scanner) {
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		
		FileWriter writer = null;
		BufferedWriter bwr = null;
		
		try {
			writer = new FileWriter(filename);
			bwr = new BufferedWriter(writer);
			
			for (Map.Entry<String, String> entry : styleMap.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
				bwr.write(entry.getKey() + "=" + entry.getValue());
				bwr.newLine();
			}
		}catch(IOException e) {
			System.out.println("파일 닫기 오류: " + e.getMessage());
		}finally {
			try {
				if(bwr != null) {
					bwr.close(); //save
				}
				System.out.println("파일 저장 완료: " + filename);
			} catch(IOException e) {
				System.out.println("파일 닫기 오류: " + e.getMessage());
			}
		}
	}
	
	private void readFashion(Scanner scanner) {
		System.out.print("파일 이름을 작성하세요: ");
		String filename = scanner.next();
		
		FileReader reader = null;
		BufferedReader br;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			String line;
			
			while((line = br.readLine()) != null) {
				String[] fashionData = line.split("="); //구분자로 분리
				if(fashionData.length == 2) { //데이터 형식이 올바른지 확인
					String season = fashionData[0];
					String style = fashionData[1];
					System.out.println(season + "=" + style);
					styleMap.put(season, style);
				}
			}
			
			System.out.println(filename + " 파일에서 패션 정보를 불러왔습니다.");
			
		}catch(IOException e) {
			System.out.println("파일 읽기 오류: " + e.getMessage());
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch(IOException e) {
				System.out.println("파일 닫기 오류: " + e.getMessage());
			}
		}
	}
	
	
}
