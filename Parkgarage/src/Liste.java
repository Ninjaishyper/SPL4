import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {
	
		ArrayList<String> warteliste = new ArrayList<String>();
		warteliste.add("4");
		warteliste.add("7");
		warteliste.add("3");
		System.out.println(warteliste);
		System.out.println(warteliste.size());
		
		if (warteliste.contains("3")) 
		{
		warteliste.remove("4");
		}
		System.out.println(warteliste);
		
		int[] wl =  new int [5];
		wl[0] = 10;
		wl[1] = 20;
		System.out.println(wl);

	}

}
// warteliste.remove(0);