package service.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;


public class scrapyService implements scrapyImpl{
	
	

	
	
	public  void  simulateUser(){
		
	};

    
    
    
    
    
    
    
    
    
	public  void   getResource() throws IOException{
		
	   String directory = "D :\\data"; 
       File  book1=new File(directory);
       File f = new File(directory); 
     book1.createTempFile("html1", ".txt");
     
     String rLine;
     
     
     Cookie 
     
     URLClient
     
     
	    URL url = new URL("http://blog.csdn.net/b_qxzb/article/details/47922193");
		
	    HttpURLConnection urlcon = (HttpURLConnection)url.openConnection();  
	    
	    //Simulated landing 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     // inputStreamReader 封装获取数据
	    
	    InputStreamReader inputStreamReader = new InputStreamReader(urlcon.getInputStream(),"utf-8");
	    
	    //   传递到上层 bufferedReader
	    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	    
       if((rLine=bufferedReader.readLine()) != null)
		
		  System.out.println(rLine);
       

    

		  
		
		
	};
	

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
      
















//
//  private static void zipWebPage(String url, String savePath) throws IOException {
//        URLConnection conn = new URL(url).openConnection();// 利用用户输入的网址创建URL连接对象
//        InputStream in = conn.getInputStream();// 获得输入流
//        FileOutputStream fos = new FileOutputStream(savePath + "download.zip");
//        ZipOutputStream zos = new ZipOutputStream(fos);
//        byte[] buffer = new byte[1024];
//        ZipEntry entry = new ZipEntry("download.html");// 创建名为“download.html”的压缩条目
//        zos.putNextEntry(entry);
//        int read = 0;
//        while ((read = in.read(buffer)) != -1) {// 写入数据
//            zos.write(buffer, 0, read);
//        }
//        zos.closeEntry();
//        in.close();// 释放资源
//        zos.close();
//        fos.close();
//    }


/*    //方法三
URL url = new URL("http://www.yhfund.com.cn");

// 方法一 
URL url = new URL("http://www.sina.com.cn");
URLConnection urlcon = url.openConnection();
InputStream is = urlcon.getInputStream();
InputStream is = url.openStream();

*/
     
	

