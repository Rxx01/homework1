public class Fibonacci {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=1;
		while(Fibonacci.of(a)<200) {
		System.out.println(Fibonacci.of(a));
		a++;
		}
	}
	public static int of(int x) {
		int y;
		if(x==1||x==2) {
			y=1;
		}else {
			y=Fibonacci.of(x-1)+Fibonacci.of(x-2);
		}
		return y;
	}

}