package sec02.exam01;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		int total = 0;
		for(int i=1; i<=10; i++) { // for(초기값; 최종값; 증가값){}
			System.out.print(i); // i=1(2) tot=21
			if(i < 10) {
				System.out.print("+");
			}
		}
		
	}
}

