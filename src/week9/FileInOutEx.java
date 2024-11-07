package week9;

import java.util.Scanner;

public class FileInOutEx {
	
	public static int getMenu() {
		Scanner key = new Scanner(System.in);
		System.out.println("==이화여자대학교 컴퓨터공학과 2371049 이홍연==");
		System.out.println("==문자 스트림 FILE I/O==");
		System.out.println("[1] Write");
		System.out.println("[2] Read");
		System.out.println("[3] 종료");
		System.out.print(">>>>>>>>>>>>>>메뉴 선택: ");
		int menu = key.nextInt();
		return menu;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriterNotBufEx ewha1 = new FileWriterNotBufEx();
		FileReaderNotBufEx ewha2 = new FileReaderNotBufEx();
		while(true) {
			int menu = getMenu();
			switch(menu) {
			case 1:
				ewha1.writer();
				break;
			case 2:
				ewha2.reader();
				break;
			case 3:
				System.out.println("이홍연 종료합니다.");
				return;
			}
				
		}
	}
	

	

}
