package loopDemo;

public class Main {

	public static void main(String[] args) {
		//FOR DضNGـSـ
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For dِngüsü bitti");
		
		//Tek say‎ bulma(for ile)
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For dِngüsü bitti");
		//اift say‎ bulma(for ile)
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For dِngüsü bitti");
		
		//WHILE DضNGـSـ
		
		int i = 1;
		while(i<10) { 
			System.out.println(i);
			i++;
		}
		System.out.println("While dِngüsü bitti.");
		
		//Tek say‎ bulma(while ile)
		i = 1;
		while(i<10) { 
			System.out.println(i);
			i+=2;
		}
		System.out.println("While dِngüsü bitti.");
		
		//اift say‎ bulma(while ile)
		i = 2;
		while(i<10) { 
			System.out.println(i);
			i+=2;
		}
		System.out.println("While dِngüsü bitti.");
		
		//DO-WHILE DضNGـSـ
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While dِngüsü bitti.");		
	}
}
