package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben=-100, monEingang=200;
		int rating=-2;
		boolean warnhinweis, negativ;
		
		if (guthaben<0) {
			negativ=true;
		} else {
			negativ=false;
		}
		if (guthaben>0) {
			rating+=3;
		}
		if (guthaben==0) {
			rating+=2;
		}
		if (guthaben<0 && (monEingang>guthaben || monEingang==guthaben)) {
			rating+=1;
		}
		if (guthaben<0 && monEingang<guthaben) {
			rating-=1;
		}
		if (guthaben<0 && monEingang<guthaben && rating<0) {
			warnhinweis=true;
		} else {
			warnhinweis=false;
		}
		System.out.println("guthaben hat Wert: " + guthaben);
		System.out.println("monEingang hat Wert: " + monEingang);
		System.out.println("rating hat Wert: " + rating);
		System.out.println("warnhinweis hat Wert: " + warnhinweis);
		System.out.println("negativ hat Wert: " + negativ);
	}
	
}
