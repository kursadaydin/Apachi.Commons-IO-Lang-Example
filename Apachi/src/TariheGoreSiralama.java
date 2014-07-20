import java.util.Comparator;



public class TariheGoreSiralama implements Comparator<Calisan> {

	@Override
	public int compare(Calisan arg0, Calisan arg1) {
		// TODO Auto-generated method stub
		if (arg0.getTarih().after(arg1.getTarih())) {
			return 1;
		}
		else if (arg0.getTarih().before(arg1.getTarih())) {
			return -1;
		}
			return 0;
	}

}