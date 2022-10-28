package crackingTheCodingInterview.Ch1_Arrays_and_Strings.urLify;

public class Solution1 {
    
    public static void replaceWhiteSpaces(char[] str, int actualLength) {
        int whiteSpaces = 0;

		for (int i = 0; i < actualLength; i++) {
			if (str[i] == ' ') {
				whiteSpaces++;
			}
		}

        int index = actualLength + (whiteSpaces*2);
        if (actualLength < str.length) str[actualLength] = '\0';

        for(int i = actualLength-1; i >= 0 ; i--) {
            if(str[i] == ' ') {
                str[index -1] = '0';
                str[index -2] = '2';
                str[index -3] = '%';
                index-=3;
            }
            else{
                str[index-1] = str[i];
                index--;
            }
        }
    }
    public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
        replaceWhiteSpaces(arr,trueLength);
        System.out.println(arr);
    }
}
