package co.com.accenture.certification.trivagochallenge.util;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import co.com.accenture.certification.trivagochallenge.exceptions.NotFoundException;
import co.com.accenture.certification.trivagochallenge.model.DataHotel;



public class Managetxt {

	public Managetxt() {
		
	}
	
	public void writeInTxt() throws IOException {
		
		DataHotel hotel = new DataHotel();
		System.out.print("NOMBRE:" + hotel.getName());
		FileWriter file = new FileWriter("CheaperHotel.txt");
        BufferedWriter writer=new BufferedWriter(file);
        String data="";
     
        data="Name: "+ hotel.getName()+"\n"+
                "Price: "+hotel.getPrice()+"\n";
            
                      
                		
		writer.write(data);
       
        writer.close();
		
		
	}

	
	public String readTxt() throws IOException {
		
		File url = new File ("CheaperHotel.txt");
		FileReader file=new FileReader(url);
		BufferedReader reader=new BufferedReader(file);
		 String linea="By: Astrid";
         try {
			while(linea!=null) {
				linea+=reader.readLine();
			}
			
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new NotFoundException("Dont fount your file, review the url", null);
		}
         
		return linea;
	}
}
