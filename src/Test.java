import chapter01_fundamentals.StringUtil;

public class Test {
	
	public static void test1() {
		System.out.println(1 / 0.0);
	}
	
	public static void main(String[] args) {
		String string = "21";
		char c = '2';
		System.out.println(StringUtil.getInstance().squeeze(string, c));
	}
}
