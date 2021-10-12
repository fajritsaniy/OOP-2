import java.util.Scanner;

public class MiniGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniGame mg = new MiniGame();
		mg.tugasSatu();
	}
	public void tugasSatu() {
	Scanner scan = new Scanner(System.in);
	int a=1;
	int b=1;
	Integer angka = 10;
	while(!(a==angka-2 && b==angka-2)) {	
	for (int i = 0; i < angka; i++) {
			for (int j = 0; j < angka; j++) {
				if(i==0||i==angka-1 ||j==0||j==angka-1) {
				System.out.print("*");
				}
				else if(i==angka-2 && j==angka-2){
					System.out.println(" ");
				}
				else if(i==a && j==b) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
				
			}System.out.println();	
		}System.out.print("Masukkan huruf ");
		String cursor = scan.next();
		if (cursor.equalsIgnoreCase("W")) {
			a-=1;
		}
		else if (cursor.equalsIgnoreCase("A")) {
			b-=1;
		}
		else if (cursor.equalsIgnoreCase("S")) {
			a+=1;
		}
		else if (cursor.equalsIgnoreCase("D")) {
			b+=1;
		}
		
	}System.out.println("Selamat anda menang!");
		
	}

}
