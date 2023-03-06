package dateConcepts;


import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		
		Date dt = new Date ();
		SimpleDateFormat sfd = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sf = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sfd.format(dt));
		System.out.println(sf.format(dt));
		System.out.println(dt.toString());
	}
}
