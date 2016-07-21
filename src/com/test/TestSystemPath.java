package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class TestSystemPath {
	public static void main(String[] args) {
		URL location = TestSystemPath.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());
        
        String loc = System.getProperty("user.dir");
        System.out.println(loc);
        
        String loc1 = System.getProperty("user.home");
        System.out.println(loc1);
        
        File file = new File(loc+"/../test1.txt");
        FileWriter writer;
		try {
			writer = new FileWriter(file);
			   writer.write("Hello Brother");
		        writer.flush();
		        writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
     
	}
}
