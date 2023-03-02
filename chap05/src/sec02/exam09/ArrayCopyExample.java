package sec02.exam09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		/* 두번째 0은 복사를 시작하는 인덱스,  네번째 0은 붙여넣기를 시작하는 인덱스 , 다섯번째 숫자는 복사할 갯수 
		for(int i=0; i<3; i++) { 
			newIntArray[0] = oldIntArray[1]; 
		}
		 */	
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
