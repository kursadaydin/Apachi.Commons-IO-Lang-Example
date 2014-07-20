import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		ArrayList<Calisan> tarihBilgisiList = new ArrayList<>();
		List <String> lines = null;
		lines= FileUtils.readLines(new File("C:\\Users\\KürþadPC\\Desktop\\veri1.txt"));
		for (String s : lines) {
			String[] rows = s.split(";");
			
		
		 if(rows[0].equals(TarihEnum.FORMAT1.getFormatType())){
             
             SimpleDateFormat f = new SimpleDateFormat
                     (TarihEnum.FORMAT1.getFormat());
              
             Date d = f.parse(rows[1]);
             Calendar cal = Calendar.getInstance();
             cal.setTime(d);
              
             Calisan t = new Calisan(rows[2], cal);
             tarihBilgisiList.add(t);
              
         }else if(rows[0].equals(TarihEnum.FORMAT2.getFormatType())){
             SimpleDateFormat f = new SimpleDateFormat
                     (TarihEnum.FORMAT2.getFormat());
              
             Date d = f.parse(rows[1]);
             Calendar cal = Calendar.getInstance();
             cal.setTime(d);
              
             Calisan t = new Calisan(rows[2], cal);
             tarihBilgisiList.add(t);

         }else{
             SimpleDateFormat f = new SimpleDateFormat
                     (TarihEnum.FORMAT3.getFormat());
              
             Date d = f.parse(rows[1]);
             Calendar cal = Calendar.getInstance();
             cal.setTime(d);
              
             Calisan t = new Calisan(rows[2], cal);
             tarihBilgisiList.add(t);
         }
		
		}
		
		Collections.sort(tarihBilgisiList,new TariheGoreSiralama());
		for (int i = 0; i < tarihBilgisiList.size(); i++) {
			System.out.println(tarihBilgisiList.get(i).getAd()+ " "+ tarihBilgisiList.get(i).getTarih() );
			
		}
	}
	
	

}
