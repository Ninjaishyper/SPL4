import java.util.ArrayList;
import java.util.Arrays;

public class Notendurchschnitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Note = { 1, 1, 3, 2, 4, 5, 5, 4, 4, 3, 2, 2, 1, 1, 3, 2, 4, 5, 4, 3, 2, 1, 4, 4, 3, 2, 1, 1, 5, 3 };
		for(int n = 0; n<Note.length; n++) {
			System.out.println("Schueler "+(n+1)+" hat die Note "+ Note[n]);
		}
		System.out.println("Notendurchschnitt: "+DurchschnittBerechnen(Note));
		ArrayList<Integer> notenSpiegel = new ArrayList<Integer>();
		notenSpiegel.add(AnzahlNoten(Note,1));
		notenSpiegel.add(AnzahlNoten(Note,2));
		notenSpiegel.add(AnzahlNoten(Note,3));
		notenSpiegel.add(AnzahlNoten(Note,5));
	System.out.println("Notenspiegel "+notenSpiegel);
	}

	public static double DurchschnittBerechnen(int[] c) {
		double a = 0;
		for (int i = 0; i < c.length; i++) {
			a = a + c[i];

		}
		return a / c.length;
	}
	
	
	
	public static int AnzahlNoten(int[] c, int Note) 
		{
			int y = 0;
			for(int i = 0; i<c.length; i++) 
			{
				
				if(c[i] == Note)
				{
					y++;
				}
				
			}
			return y;
		}
}
