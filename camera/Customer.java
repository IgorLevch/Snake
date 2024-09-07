package ru.lesson6.camera;

public class Customer {


    public static void main(String[] args) {

        ChooseCamera cc = new BlW();
        Camera camera = new Camera();
        camera.setChoo(cc);

        camera.foto();
    }
}
