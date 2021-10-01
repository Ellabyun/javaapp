package io;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ ���ڶ�� Reader, Writer�� ����
 * 
 * char ���·� ó��
 * 
 * 
 */
public class FileReaderEx1 {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\Temp\\file1.text")) {
			char[] cbuf = new char[100];
			int readcharNo;
			while((readcharNo=reader.read(cbuf))!=-1) {
				String data = new String(cbuf,0,readcharNo);
				System.out.println(data);			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}