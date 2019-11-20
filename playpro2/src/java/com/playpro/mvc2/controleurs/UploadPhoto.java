/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.utils.*;
import com.playpro.mvc2.controleurs.UploadAction;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author toute
 */
public class UploadPhoto extends AbstractAction {

    public String uploader(List<Part> parts, String UPLOAD_DIR, String applicationPath, String imageName) {
        String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

        // creates the save directory if it does not exists
        File fileSaveDir = new File(uploadFilePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());
        System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());

        try {
            //Get all the parts from request and write it to the file on server
            for (Part part : parts) {
                String fileName = getFileName(part);
                if (!fileName.equals("")) {
                    part.write(uploadFilePath + File.separator + fileName);
                    imageName = fileName;
                    System.out.println("FILE NAME : " + fileName);
                    String dest = applicationPath + "../../web/" + UPLOAD_DIR + "/" + imageName;
                    copy(applicationPath + UPLOAD_DIR + "/" + imageName, dest);
                }
            }
            return imageName;
        } catch (IOException ex) {
            Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);

        }
        return "";
    }

    public String getFileName(Part part) {
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

    public void copy(String source, String dest) {
        try {

            BufferedImage originalImage = ImageIO.read(new File(
                    source));

            ImageIO.write(originalImage, "jpg", new File(
                    dest));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean effacer(String source1, String source2) {
        File photo1 = new File(source1);
        File photo2 = new File(source2);
        if (photo1.delete() && photo2.delete()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
