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
	  * @Description: ���ַ�����ɾ���ַ�c,�㷨ʵ������ʱ�临�Ӷ�
	  * �Ķ� ��C����������ԡ����ĵڶ���P37ҳ����
	  * @author: xuwenping
	  * @date: 2017��11��15��
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
