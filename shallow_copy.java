public class shallow_copy {

	public static void main(String[] args) {

		int[] a = {10, 20, 30};
		int[] b = a;
		
		b[0] = 70000;

	System.out.println("Array a:");

		for(int x : a ) System.out.println(x + " ");

	System.out.println("Array b:");

		for(int x : b ) System.out.println(x + " ");


      }


    }