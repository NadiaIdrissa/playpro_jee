/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author toute
 */
public class CopyImage {
    public static void copy(String source, String dest ){
        try {

            BufferedImage originalImage = ImageIO.read(new File(
                    source));
            
            ImageIO.write(originalImage, "jpg", new File(
                    dest));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
