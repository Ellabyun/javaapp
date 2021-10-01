package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {
	
	public static void main(String[] args) {
		//FileInputStream�� ����ϴ� ���+byte�迭
		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			 FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3")) {
			
			byte data[] = new byte[1024]; 
			
			long start = System.currentTimeMillis();
			while(fis.read(data)!=-1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream +byte+FileOutputStrem �� ���� "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream+BufferedInputStream+byte����ϴ� ���
		//FileOutputStream+BufferedOutputStream

		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis); 
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy5.mp3");
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				
				byte data[] = new byte[1024]; 
				
				long start = System.currentTimeMillis();
				while(bis.read(data)!=-1) {
					bos.write(data);
				}
				bos.flush();
				long end = System.currentTimeMillis();
				System.out.println("FileInputStream+BufferedInputStream+byte ���� "+(end-start));			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}

}
