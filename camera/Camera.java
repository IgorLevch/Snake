package ru.lesson6.camera;

public class Camera {

   private  ChooseCamera choo;

  /*  public Camera( ChooseCam choo) {
        this.choo = choo;*/
   // }
    public ChooseCamera getChoo() {
        return choo;
    }

    public void setChoo(ChooseCamera choo) {
        this.choo = choo;
    }

    public void foto(){
        System.out.println("schelk");
        choo.fill_in();
    }
}
