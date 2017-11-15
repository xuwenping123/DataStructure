package chapter01_fundamentals.part02;

/**
 * @ClassName: StringOperation 
 * @Description: 字符串的典型操作，见书p50
 * @author xuwenping
 * @date 2017年11月6日 下午8:27:13 
 * @version V1.0
 */
public class StringOperation {

	/**
	 * @Title: checkString 
	 * @Description: 校验字符串 
	 * @param object
	 */
	private static void checkString(Object object) {
		
	}
	
	/**
	 * @Title: isPalindrome 
	 * @Description: 判断字符串是否为回字文
	 * @param s
	 * @return boolean
	 * 	if s is palindrome ,return true
	 * 	else return false
	 */
	public static boolean isPalindrome(String s) {
		checkString(s);
/*		boolean flag = true;
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				flag = false;
				break;
			}
			start++;
			end--;
		}
		return flag;*/
		/* book
		 * 1. 变量定义少
		 * 2. 当数组长度为奇数时，不需要比较中间的值
		 * 3. 当判断不等于时直接返回false
		 *   */
		int N = s.length();
		for (int i = 0; i < N / 2; i++) {
			if (s.charAt(i) != s.charAt(N - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
