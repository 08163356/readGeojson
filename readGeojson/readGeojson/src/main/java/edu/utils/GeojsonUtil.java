package edu.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class GeojsonUtil {

    public static void getGeojson(String fileName, HttpServletResponse response){

        try{

            InputStream in = new FileInputStream(fileName);
            OutputStream out = response.getOutputStream();
            byte data[]=new byte[1024];
            int len = 0;
            while((len = in.read(data)) != -1){
                out.write(data,0,len);
            }
            in.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
