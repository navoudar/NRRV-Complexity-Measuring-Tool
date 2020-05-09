package controller;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import model.FileModel;

@WebServlet("/Uploader")
public class Uploader extends HttpServlet {
	List<String> list = new ArrayList<>();
	List<String> temps = new ArrayList<String>();
	ReadFileLineByLine readFileLineByLine = new ReadFileLineByLine();
	MainController mc = new MainController();
	Scanner scan;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multifiles = sf.parseRequest(request);

			for (FileItem item : multifiles) {

				/*
				 * File f = new
				 * File("C://Users/navod/git/repository/NRRV Complexity Measurig Tool/NRRV Complexity Measuring Tool/WebContent/Uploaded Files/"
				 * + item.getName()); scan = new Scanner(f);
				 * 
				 * while(scan.hasNextLine()) { System.out.println(scan.hasNext()); }
				 */

				try {
					int i = 0;
					item.write(new File(
							"C://Users/Cool/git/NRRV-Complexity-Measuring-Tool/NRRV Complexity Measuring Tool/WebContent/Uploaded Files"
									+ item.getName()));
					list.add(item.getName());

					temps.add(i, item.getString());
					mc.getFileContent(readFileLineByLine.file(
							"C://Users/Cool/git/NRRV-Complexity-Measuring-Tool/NRRV Complexity Measuring Tool/WebContent/Uploaded Files"
									+ item.getName()));
					/*
					 * readFileLineByLine.
					 * file("C://Users/navod/git/repository/NRRV Complexity Measurig Tool/NRRV Complexity Measuring Tool/WebContent/Uploaded Files/"
					 * + item.getName());
					 */
					// String text2 = item.getString(); // returns the strings in the file

					// System.out.println(text2);
					i++;
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

		// System.out.println(temps.get(0));
		// System.out.println("other file");
		// System.out.println(temps.get(1));
		// request.setAttribute("availableLines", list);
		// System.out.println(list.get(0));
		// response.sendRedirect("Uploader.jsp?div=selected&val_list="+list);
		System.out.println("File Uploaded");

	}

}
