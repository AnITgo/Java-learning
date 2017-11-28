public class test {
	public static void main(String[] args){
		int[] a =new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		System.out.println(a);
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length-i-1];
			System.out.println(b[i]);
		}
		System.out.println(b);
	}
}
