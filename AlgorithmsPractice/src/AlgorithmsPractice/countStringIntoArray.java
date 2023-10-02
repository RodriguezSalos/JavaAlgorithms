package AlgorithmsPractice;

public class countStringIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String splitWord;
		int count128 = 0;
		int countNot128 = 0;
		String[] employeeInfo = { "123456,A321,128", "234567,A321,128", "345678,A321,144", "123789,A320,128",
				"234567,A321,132" };

		for (int i = 0; i < employeeInfo.length; i++) {
				splitWord = employeeInfo[i];
				
			if (splitWord.endsWith("128")) {
				count128 += 1;
			} else {
				countNot128 += 1;
			}
		}
		System.out.println("Total of records = " + employeeInfo.length + "\nRecords with code 128 = " + count128
				+ "\nRecords without code 128 = " + countNot128);

	}

}
