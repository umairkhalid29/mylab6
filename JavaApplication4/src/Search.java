/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 * @author umair
 */
public class Search {

    private static DaOcity cityDAO = new DaOcity();

    private static void popDataBase() {
        try {
            FileInputStream fstream = new FileInputStream("src/GeoLiteCity-Location.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            while ((strLine = br.readLine()) != null) {
                GeoCity city = new GeoCity();
                city.setId(5);
                
                System.out.println(strLine);

                cityDAO.save(city);
            }

            in.close();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
            popDataBase();
    }

}
