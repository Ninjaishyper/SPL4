
public class ParkgarageLevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int parkplaetze = 50;
		int autos = 0;
		String parken = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 -1 -2 -3 -4 -5 -6 -7 -8 -9 -10 -11 -12 -13 -14 -15 -16 -17 -18 -19 -20 -21 -22 -23 -24 -25 -26 -27 -28 -29 -30 -31 -32 -33 -34 -35 -36 -37 -38 -39 -40 -41 -42 -43 -44 -45 -46 -47 -48 -49 -50"; 
	
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


