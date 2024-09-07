package ru.lesson6.camera2;
// не доделано
@Component
public class CameraImpl implements Camera {

    private CameraRoll cameraRoll;
    private boolean broken;

    @Override
    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Override
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public boolean isBroken(){
        return broken;
    }
    public void breaking (){
        this.broken=true;
    }

    @Override
    public void doPhoto() {
        if (isBroken()){
            System.out.println("the photo is brocken");
            return;
        }

        System.out.println("the photo is made");
        cameraRoll.fill_in();
    }


}
