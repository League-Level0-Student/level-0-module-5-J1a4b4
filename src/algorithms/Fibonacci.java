package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
	int FibNumI = 1;
	int FibNumII = 0;
	for (int i = 0; i < 6; i++) {
	System.out.println(FibNumI);
	FibNumII = FibNumII + FibNumI;
	System.out.println(FibNumII);
	FibNumI = FibNumI + FibNumII;
	}
	}

}
