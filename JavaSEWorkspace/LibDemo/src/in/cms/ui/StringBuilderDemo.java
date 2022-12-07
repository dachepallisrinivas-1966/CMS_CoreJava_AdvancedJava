package in.cms.ui;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("java");

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("1.8");
		System.out.println(sb);
		sb.insert(4, " ");
		System.out.println(sb);
		sb.delete(0, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}
