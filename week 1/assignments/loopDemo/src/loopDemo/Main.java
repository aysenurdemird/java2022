package loopDemo;

public class Main {

	public static void main(String[] args) {
		//FOR DÖNGÜSÜ
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		//Tek say‎ bulma(for ile)
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		//اift say‎ bulma(for ile)
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		//WHILE DÖNGÜSÜ
		
		int i = 1;
		while(i<10) { 
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");
		
		//Tek sayı‎ bulma(while ile)
		i = 1;
		while(i<10) { 
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti.");
		
		//çift sayı‎ bulma(while ile)
		i = 2;
		while(i<10) { 
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti.");
		
		//DO-WHILE DÖNGÜSÜ
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While döngüsü bitti.");		
	}
}
