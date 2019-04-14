package nested_loops;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
		System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
		System.out.println(i);
		}
		for (int i = 0; i < 51; i++) {
		System.out.println(2 * i);
		}
		for (int i = 0; i < 50; i++) {
		System.out.println(2 * i + 1);
		}
		for (int i = 0; i < 501; i++) {
		System.out.print(i);
		if (i % 2 == 0) {
		System.out.println(" even");
		}else {
		System.out.println(" odd");
		}
		}
		for (int i = 0; i < 112; i++) {
		System.out.println(7 * i);
		}
		int year = 2006;
		for (int i = 0; i < 13; i++) {
		System.out.println("In " + year + ", I was " + i + ".");
		year = year + 1;
		}
		int threesPlace = 0;
		int onesPlace = 0;
		for (int i = 0; i < 11; i++) {
		if (onesPlace == 3) {
		threesPlace = threesPlace + 1;
		onesPlace = 0;
		}else {
		System.out.print(threesPlace + " ");
		System.out.println(onesPlace);
		onesPlace = onesPlace + 1;
		}
		}
		for (int i = 1; i < 10; i++) {
		if (i % 3 == 0) {
		System.out.println(i);
		}else {
		System.out.print(i + " ");
		}
		}
		for (int i = 1; i < 101; i++) {
		if (i % 10 == 0) {
		System.out.println(i);
		}else if (i > 10) {
		System.out.print(i + " ");
		}else {
		System.out.print(i + "  ");
		}
		}
		String asterisks = "";
		for (int i = 0; i < 6; i++) {
		asterisks = asterisks + "* ";
		System.out.println(asterisks);
		}
		for (int i = 0; i < 101; i++) {
		System.out.println(100 - i);
		}
	}

}
