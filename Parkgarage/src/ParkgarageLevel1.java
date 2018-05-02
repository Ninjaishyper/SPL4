
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int parkplaetze = 10;
		int autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		String [] parkvorgaenge = parken.split(" ");
		int MaxAutosInGarage = 0;
		int austosInGarage = 0;
		
		
		for (int p=0; p<parkvorgaenge.length; p++) {
		
			int parker = Integer.parseInt(parkvorgaenge[p]);
		
			if(parker < 0)
			{
				System.out.println("Auto aus parkt aus" + parker);
				austosInGarage -=1;
			}
			else 
			{
				System.out.println("Auto parkt ein " + parker);
				austosInGarage +=1;
				
			}
			if (austosInGarage > MaxAutosInGarage)
			{
				MaxAutosInGarage = austosInGarage;
			}
		}
		
		System.out.println(MaxAutosInGarage);
	}
}


