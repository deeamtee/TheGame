package com.thegame.utils;

//import sun.util.resources.Bundles;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static BufferedImage resize(BufferedImage image, int width, int hight){

        BufferedImage newImage = new BufferedImage(width, hight, BufferedImage.TYPE_INT_ARGB);
        newImage.getGraphics().drawImage(image,0,0,width, hight, null);

        return newImage;
    }

    public static Integer[][] levelParser(String filePath){

        Integer[][] result = null;

        try(BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))){

            String line = null;
            List<Integer[]> lvlLines = new ArrayList<Integer[]>();
            while ((line = reader.readLine()) != null){
                lvlLines.add(str2int_arrays(line.split(" ")));
            }
            result = new Integer[lvlLines.size()][lvlLines.get(0).length];
            for (int i=0; i<lvlLines.size();i++){
                result[i] = lvlLines.get(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    public static final Integer[] str2int_arrays(String[] sArr){
        Integer[] result = new Integer[sArr.length];
        for (int i = 0; i<sArr.length; i++){
            result[i] = Integer.parseInt(sArr[i]);                                                           //Сохраняет тоько цифры в файле, нужна проверка на цифру
        }
        return result;
    }
}
