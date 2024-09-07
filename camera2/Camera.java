package ru.lesson6.camera2;

public interface Camera {

    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhoto();
    void breaking();
    boolean isBroken();


}
