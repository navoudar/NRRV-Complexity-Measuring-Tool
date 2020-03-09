package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import model.FileModel;

@WebServlet("/Uploader")
public class Uploader extends HttpServlet {
	List<String> list = new ArrayList<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multifiles = sf.parseRequest(request);

			for (FileItem item : multifiles) {

				try {
					item.write(new File(
							"C://Users/navod/git/repository/NRRV Complexity Measurig Tool/NRRV Complexity Measuring Tool/WebContent/Uploaded Files/"
									+ item.getName()));
					list.add(item.getName());
					FileModel fm = new FileModel();
					fm.setFilename(item.getName());
				 //String text = item.getContentType();
					String text2 = item.getString(); // returns the strings in the file
					
				System.out.println(text2);
				//	System.out.println(fm);
				} catch (Exception e) {
					System.out.println("error in location");
					e.printStackTrace();
				}

			}

		} catch (FileUploadException e) {
			System.out.println("error in uploader");
			e.printStackTrace();
		}
		request.setAttribute("filenames", list);
		request.getRequestDispatcher("Uploader.jsp?div=selected").forward(request, response);
		
		//System.out.println(list.get(1));
		//request.setAttribute("availableLines", list);
		//System.out.println(list.get(0));
		//response.sendRedirect("Uploader.jsp?div=selected&val_list="+list);
		System.out.println("File Uploaded");

	}

}
