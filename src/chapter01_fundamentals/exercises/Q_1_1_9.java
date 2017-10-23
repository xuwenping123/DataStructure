package chapter01_fundamentals.exercises;

public class Q_1_1_9 {

	/**
	 * @Title: test 
	 * @Description: ��N ת���ɶ����Ʋ������ַ�����ʾ��ʽ
	 * @param N ������
	 * @return String N���ַ�����ʽ
	 */
	public static String changeBinary(int N) {
		// 1. �����ַ���StringBuilder, �� N%2��ȡλ�� ��N = N / 2����λ�ƣ� ����õ����ַ�����StringBuilder���д洢�����תΪString
		StringBuilder sb = new StringBuilder();
		if (N == 0) { // �������������ж�
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
	 * @Description: �������أ�p33
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
 * ժ��JDK (v1.7) Integer.totoBinaryString()
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
    
    // shitft ��ʾ�ý�����2�ı���    ��2������shitf = 1; �ڰ˽�����shitf = 3; ��ʮ��������shift = 4
    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32]; // ����char �������ڴ洢ÿ���ַ�
        int charPos = 32; // buf.length
        int radix = 1 << shift; 
        int mask = radix - 1; // ��ʾ�ý��������ֵ,������λ����Ϊ1��Ϊ��������ţ��ܹ���ȡi��ÿһλֵ
        do {
            buf[--charPos] = digits[i & mask]; //��Сλ����λ���λ�ȡi��ÿһλ���ֲ��洢���ַ�������
            i >>>= shift; // shitf �޷�������һλ
        } while (i != 0); // i > 0
        return new String(buf, charPos, (32 - charPos));//��ȡ�ַ���
    }
}
