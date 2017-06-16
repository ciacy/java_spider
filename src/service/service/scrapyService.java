package service.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLStreamHandlerFactory;


public class scrapyService implements scrapyImpl{
	
	

	
	
	public  void  simulateUser(){
		
	};

	public  void   getResource() throws IOException{
		
	    String html_case1="case1.html";
	    String directory = "test_file"; 
        String rLine;
        URLStreamHandlerFactory proxy;
	    URL url = new URL("https://movie.douban.com/subject/26839466/?from=showing");
	    FileOutputStream  book1 = new FileOutputStream(directory+"\\"+html_case1);
	    HttpURLConnection urlcon = (HttpURLConnection)url.openConnection();  
	    
	    urlcon.setRequestMethod("POST");
	    urlcon.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36");  
	    urlcon.setDoOutput(true);  
	    urlcon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");  
	    urlcon.setRequestProperty("Content-Language", "zh-cn");  
	    urlcon.setRequestProperty("Connection", "keep-alive");  
	    urlcon.setRequestProperty("Cache-Control", "no-cache");  
	    
	    //Simulated landing 
	    System.out.println(  urlcon.getInputStream().read());
	     // inputStreamReader 封装获取数据
	     int read;         
	     byte[] buffer = new byte[1024];
	       while ((read = urlcon.getInputStream().read(buffer)) != -1) {// 写入数据
                  book1.write(buffer, 0, read);
        }
	    
         
	       book1.close();	    

	    
	
	    
	    
	    
     
       
	}
	

//  Main test case 
	
//   newInstance creat object   :    the  usage   unclear
	

		public static void main(String[] args) throws InstantiationException, IllegalAccessException {
			
			scrapyService  spy =scrapyService.class.newInstance();
			
			
			try {
				spy.getResource();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
			
		}
	}
      



	

