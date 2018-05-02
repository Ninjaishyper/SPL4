import java.util.ArrayList;

public class ParkgarageLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int parkplaetze = 2;
		int autos = 4;
		String parken = "1 2 -1 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int MaxAutosInGarage = 0;
		int autosInGarage = 0;
		int maxAutosWarteliste = 0;

		ArrayList<Integer> warten = new ArrayList<Integer>();

		for (int p = 0; p < parkvorgaenge.length; p++) {

			int parker = Integer.parseInt(parkvorgaenge[p]);

			if (parker < 0) 
			{
				System.out.println("Auto parkt aus" + parker);
				autosInGarage -= 1;
				if (warten.size() > 0) 
					{
						warten.remove(0);
						autosInGarage +=1;
					}
				

			} else {
				if (autosInGarage == parkplaetze) 
				{
					warten.add(parker);

				} else {
					System.out.println("Auto parkt ein " + parker);
					autosInGarage += 1;
				}
			}

			if (autosInGarage > MaxAutosInGarage) 
			{
				MaxAutosInGarage = autosInGarage;
			}
			
			if (warten.size() > maxAutosWarteliste) 
			{
				maxAutosWarteliste = warten.size();
			}

		}

		System.out.println(MaxAutosInGarage+" " + maxAutosWarteliste);
	}
}
