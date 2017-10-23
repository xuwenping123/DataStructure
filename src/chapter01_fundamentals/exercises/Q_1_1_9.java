package chapter01_fundamentals.exercises;

public class Q_1_1_9 {

	/**
	 * @Title: test 
	 * @Description: 将N 转换成二进制并返回字符串表示方式
	 * @param N 正整数
	 * @return String N的字符串形式
	 */
	public static String changeBinary(int N) {
		// 1. 创建字符串StringBuilder, 将 N%2获取位数 ，N = N / 2进行位移， 将获得的数字放置于StringBuilder进行存储，最后转为String
		StringBuilder sb = new StringBuilder();
		if (N == 0) { // 正整数，无需判断
			return "0";
		}
		while (N > 0) {
			sb.append(N & 1); // sb.append( N % 2);
			N >>>= 1;
		}
		return	sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(changeBinary2(0));
	}
	
	/**
	 * @Title: changeBinary2 
	 * @Description: 书中所载！p33
	 * @param N
	 * @return String
	 */
	public static String changeBinary2(int N) {
		String s = "";
		for (int n = N; n > 0; n = N / 2) {
			s += n % 2;
		}
		return s;
	}

}

/**
 * 摘自JDK (v1.7) Integer.totoBinaryString()
 */
class JDKToBinary {
	
    final static char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'a' , 'b' ,
            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
    
    public static String toBinaryString(int i) {
        return toUnsignedString(i, 1);
    }
    
    // shitft 表示该进制是2的倍数    在2进制下shitf = 1; 在八进制下shitf = 3; 在十六进制下shift = 4
    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32]; // 创建char 数组用于存储每个字符
        int charPos = 32; // buf.length
        int radix = 1 << shift; 
        int mask = radix - 1; // 表示该进制下最大值,即所有位数均为1，为下文与符号，能够获取i的每一位值
        do {
            buf[--charPos] = digits[i & mask]; //从小位至大位依次获取i的每一位数字并存储在字符数组中
            i >>>= shift; // shitf 无符号右移一位
        } while (i != 0); // i > 0
        return new String(buf, charPos, (32 - charPos));//获取字符串
    }
}
