package edu.json;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.io.*;

public class GetStyle {

//    public static void getStyle2(String fileName, HttpServletResponse response) {
//        try{
//            InputStream in = new FileInputStream(fileName);
//            OutputStream out = response.getOutputStream();
//            byte data[]=new byte[1024];
//            int len = 0;
//            while((len = in.read(data)) != -1){
//                out.write(data,0,len);
//            }
//            in.close();
//            out.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public static void getStyle(String fileName, HttpServletResponse response) {
        File xmlFile=new File(fileName);
        JSONObject xmlJson=XML.toJSONObject(readXMLFile(xmlFile));
        String jsonPrintString=xmlJson.toString(4);

        try{
            OutputStream out = response.getOutputStream();
            out.write(jsonPrintString.getBytes());
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String readXMLFile(File path){
        StringBuilder xmlString =new StringBuilder();
        try {
            BufferedReader  br = new BufferedReader(new FileReader(path));
            String s=null;
            while((s=br.readLine())!=null){
                xmlString.append(System.lineSeparator()+s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlString.toString();
    }

}
