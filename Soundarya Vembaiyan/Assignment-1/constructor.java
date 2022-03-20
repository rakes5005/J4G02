package Student;
public class constructor {
		int l, b, area;
		constructor() {
			l = 5;
			b = 6;
			area = l * b;
			System.out.println("Default area=" + area);
		}

		constructor(int a, int b) {
			a = 5;
			b = 10;
			area = a * b;
			System.out.println("Parameterzied area=" + area);
		}
	}

	class initic {
		public static void main(String args[]) {
			constructor ob1 = new constructor();
			constructor ob2 = new constructor(5, 10);
		}
	}



