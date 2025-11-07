package h3;

public class H3_main {

	public static void main(String[] args) {
		int max=5, fix=2, wartend=3, neufix, zuViel;
		boolean istVoll;
		istVoll=false;
		neufix= fix + wartend;
		zuViel= fix + wartend - max;
		
		if ((max>fix) && ((neufix<max) || (neufix==max))) {
			fix+=wartend; wartend=0;
		}
		
		if ((max>fix) && (neufix>max)) {
			fix=max; wartend=zuViel;
		}
		
		if ((neufix==max) || (neufix>max)) {
			istVoll=true;
		}
		
		if ((neufix<max)) {
			istVoll=false;
		}
		
		System.out.println("max hat den Wert " +  max);
		System.out.println("fix hat den Wert " +  fix);
		System.out.println("wartend hat den Wert " +  wartend);
		System.out.println("istVoll hat den Wert " +  istVoll);
	}

}
