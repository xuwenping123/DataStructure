package chapter01_fundamentals.part01.exercises;

/**
  * @ClassName: Q_1_1_25
  * @Description: 证明欧几里得算法能够获取两个整数的最大公约数
  * @author:xuwenping
  * @date: 2017年11月3日
  * @version V1.0
 */
public class Q_1_1_25 {
	
	/*
	 * 1. input a < b
	 * 2. 任意的两个数a b 都有： b = a * i + c => c = b - a * i  （ i 取能取的最大值）
	 * 3. 假设 a b 的最大公约数为k, 则 c/k = b/k - (a * i)/k
	 * 	  则  c 也能被k整除
	 * 4. c <= a, c <= b, 缩小的值得判断范围
	 * 5. 则gcd(a, b) = gcd(a, b mod a);
	 * 
	 * 
	 * 我一开始以为上述可以证明欧几里得算法的正确性，可是理解起来总是感觉：k是 a c 的公约数，但是不能证明 k 是 a c的最大公约数
	 * 
	 * @see http://blog.csdn.net/flpanbin/article/details/51860902
	 * 
	 * 反证法如下:
	 * 
	 * 1. input a > b
	 * 2. c = gcd(a, b) => a = nc, b = mc;
	 * 3. r = a - b * i => r = nc - mic = c(n - im) => c也是r的一个公约数
	 * 4. 要证明 b=mc, r=c(n -im) 的最大公约数是 c,即证明m 与 n -im 互质
	 * 5. 若m n-im不互质，则存在一个d(d > 1)，满足 m = xd, n-im = yd;
	 * 6. 则 a = nc = c(yd + im) = c(yd + ixd) = cd(y + ix);
	 * 	    b = mc = xdc; 
	 * 7. 则 a b的最大公约数为 cd(d>1),与假设不符合
	 * 8. 得证！
	 * 
	 * 数学归纳法
	 */
}
