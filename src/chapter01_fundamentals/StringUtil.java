package chapter01_fundamentals;

public class StringUtil {

	private static StringUtil instance = new StringUtil();
	
	private StringUtil() {
	}
	
	public static StringUtil getInstance() {
		return instance;
	}
	
	/**
	  * @Title: squeeze
	  * @Description: 从字符串中删除字符c,算法实现线性时间复杂度
	  * 阅读 《C程序设计语言》中文第二版P37页所感
	  * @author: xuwenping
	  * @date: 2017年11月15日
	  * @param str
	  * @param c
	  * @return
	 */
	public String squeeze(String str, char c) {
		int i = 0;
		int j = 0;
		char[] array = str.toCharArray();
		for (; i < array.length; i++) {
			if (array[i] != c) {
				array[j++] = array[i];
			}
		}
		return new String(array, 0, j);
	}
}
