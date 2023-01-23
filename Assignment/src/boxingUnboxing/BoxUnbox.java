package boxingUnboxing;

public class BoxUnbox {
	public static void main(String[] args) {
		int k = 10;
		Float m = 30.5f;
		Integer i = k; // AutoBoxing
		float n = m; // AutoUnboxing
		//float n = m.floatValue();
		System.out.println(k);
		System.out.println(i);
		System.out.println(m.floatValue());
		System.out.println(n);
	}

}
