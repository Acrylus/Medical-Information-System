/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalrecordsystemfinal;

/**
 *
 * @author Anton Joseph Cruz
 */
public class FileReader {
    private byte[] imageData;
    private String picturePath;

    public FileReader(byte[] imageData, String picturePath) {
        this.imageData = imageData;
        this.picturePath = picturePath;
    }

    public FileReader() {
    }

    public byte[] getImageData() {
        return imageData;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }


}
