package jianzhioffer;


//把字符串中的所有空格替换成%20
public class replaceblank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataString = "hello world ni hao";
		System.out.println(replaceblank(dataString));

	}

	public static String replaceblank(String data) {
		String[] itemStrings = data.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		for (; i < itemStrings.length - 1; i++) {
			stringBuilder.append(itemStrings[i]);
			stringBuilder.append("%20");
		}
		stringBuilder.append(itemStrings[i]);
		return stringBuilder.toString()
				.substring(0, stringBuilder.length() - 1);
	}

}
