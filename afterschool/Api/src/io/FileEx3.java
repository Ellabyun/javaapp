package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.text");
		File file2 = new File("c:\\temp\\file2.text");
		File file3 = new File(temp,"file3.text");
		File file4 = new File("c:\\temp\\dir\\file4.text");
		
		//���� ����
		if(!temp.exists()) {
			temp.mkdir();
		}
		if(!dir.exists()) {
			dir.mkdir();
		}
		try {
			//���ϻ���
			if(!file1.exists()) {
				file1.createNewFile();
			} 
			if(!file2.exists()) {
				file2.createNewFile();
			} 
			if(!file3.exists()) {
				file3.createNewFile();
			} 
			if(!file4.exists()) {
				file4.createNewFile();
			} 
			
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//���� ���� ���
		System.out.println("\t��¥\t�ð�\t����\tũ��\t�̸�");
		System.out.println("-----------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File contents[] = temp.listFiles();
		for(File f:contents) {
			// long access = f.lastModified();
			// Data date = new Date(access);
			// String formatDate = sdf.format(date);
			
			
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+f.getName());
			}else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}
		
	}
	
}


