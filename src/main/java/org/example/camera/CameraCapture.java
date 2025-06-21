package org.example.camera;

import org.bytedeco.opencv.opencv_videoio.VideoCapture;

public class CameraCapture {

    private VideoCapture videoCapture = new VideoCapture();

    public boolean cameraChoice(int positionCamera) {
        try {
            if (videoCapture.isOpened()) {
                videoCapture.release();
            }
            return videoCapture.open(positionCamera);
        } catch (Exception e) {
            throw new RuntimeException("Error open the camera: " + e.getMessage(), e);
        }
    }

    public void closeCamera() {
        if (videoCapture.isOpened()) {
            videoCapture.release();
        }
    }

    public boolean isCameraOpened() {
        return videoCapture.isOpened();
    }

    public VideoCapture getVideoCapture() {
        return videoCapture;
    }
}