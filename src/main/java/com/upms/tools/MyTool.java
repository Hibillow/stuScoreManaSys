package com.upms.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MyTool {

	public static String getNewEquipmentNo(String equipmentType, String equipmentNo){
		String newEquipmentNo = "00001";

		if(equipmentNo != null && !equipmentNo.isEmpty()){
			int newEquipment = Integer.parseInt(equipmentNo) + 1;
			newEquipmentNo = String.format(equipmentType + "%05d", newEquipment);
		}
		return newEquipmentNo;
	}


	public static String list2SqlStr(Collection<String> aa){
		if (aa == null) {
			return null;
		} else {
			StringBuffer tt = new StringBuffer();
			Iterator var2 = aa.iterator();

			while(var2.hasNext()) {
				String str = (String)var2.next();
				if (tt.length() > 0) {
					tt.append(",'");
				} else {
					tt.append("'");
				}

				tt.append(str);
				tt.append("'");
			}

			return tt.toString().equals("") ? null : tt.toString();
		}
	}

	public static String SaveImg(MultipartFile file, String dir, String imgName) {
		File direction = new File(dir);
		if (!direction.exists()) {
			direction.mkdir();
		}
		File myFile = new File(direction, imgName);
		System.out.println("addr:" + myFile.getAbsolutePath());
		try {
			FileInputStream fis = (FileInputStream) file.getInputStream();
			FileOutputStream fos = new FileOutputStream(myFile);
			int len = 0;
			byte[] b = new byte[1024];
			while ((len = fis.read(b)) != -1) {
				fos.write(b);
			}
			fos.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (myFile.getAbsolutePath());
	}

	public static String getImg() {
		String imgPath = "";
		imgPath = "c:/uploads/";
		return imgPath;
	}

}
