package org.example;

import org.example.camera.CameraCapture;
import org.example.camera.ImageProcessor;

public class Main {
    public static void main(String[] args) {
        CameraCapture cameraCapture = new CameraCapture();

        if(cameraCapture.cameraChoice(0)){
            System.out.printf("Deu bom paizão");
        }else{
            System.out.printf("Deu errado paizão");
        }

        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.setVideoCapture(cameraCapture.getVideoCapture());

        imageProcessor.showImage();
    }
}
