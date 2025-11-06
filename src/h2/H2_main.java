package h2;

public class H2_main {

	public static void main(String[] args) {
		int jahr=2100, x=jahr % 4, y=jahr % 100, z=jahr % 400;
		boolean schalt;
		
		if (((x==0) && (y!=0)) || (z==0)) {
			schalt=true;
		} else {
			schalt=false;
		}
		
		System.out.println("jahr hat Wert: " + jahr);
		System.out.println("schalt hat Wert: " + schalt);
	}

}
