/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author toute
 */
public class UploadAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/sports";

    @Override
    public String execute() {
        String applicationPath = request.getServletContext().getRealPath("");
        // constructs path of the directory to save uploaded file
        String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

        // creates the save directory if it does not exists
        File fileSaveDir = new File(uploadFilePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());

        try {
            //Get all the parts from request and write it to the file on server
            for (Part part : request.getParts()) {
                String fileName = getFileName(part);
                if(!fileName.equals("")) {
                    part.write(uploadFilePath + File.separator + fileName);
                }
            }
            request.setAttribute("message", "File uploaded successfully!");
        } catch (IOException ex) {
            Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("message", "File NOT uploaded successfully!");
        } catch (ServletException ex) {
            Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("message", "File NOT uploaded successfully!");
        }

//        getServletContext().getRequestDispatcher("/response.jsp").forward(
//                request, response);
        return "response";
    }

    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= " + contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }
        return "";
    }

}
