package org.example.camera;

import org.bytedeco.opencv.global.opencv_highgui;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_videoio.VideoCapture;

public class ImageProcessor {

    VideoCapture videoCapture;
    Mat frame =  new Mat();

    public void setVideoCapture(VideoCapture videoCapture) {
        this.videoCapture = videoCapture;
    }

    public void showImage(){

        opencv_highgui.namedWindow("Camera",opencv_highgui.WINDOW_NORMAL);

        while(true){
            if(!videoCapture.read(frame)){
                System.out.printf("Error in capture frame");
                break;
            }


            opencv_highgui.imshow("Camera", frame);

            int key = opencv_highgui.waitKey(30);
            if(key == 'q' || key == 27){
                break;
            }
        }
        videoCapture.release();
        opencv_highgui.destroyAllWindows();
    }
}
