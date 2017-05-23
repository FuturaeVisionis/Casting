package casting.One;

/**
 * Created by ronald on 16/09/16.
 */
public class Application {
    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.start();

        System.out.println();

        Camera camera = new Camera();
        camera.start();
        camera.snap();
        camera.video();

        System.out.println();

        /*
        Look at up casting like this:
        The first created class was Machine and camera is a derivative of the machine class, right? Now we are going from
        top towards bottom and this is called UP CASTING. Down casting is the other way around.
          */
        Machine machine1 = (Machine) new Camera(); // going from top to bottom (UP CASTING)
        machine1.video();
        machine1.start();
        ((Camera) machine1).snap(); // trying to reach the "lonely" method. You need to use down casting.

        System.out.println();

        Machine machine2 = (Machine) new Camera();
        ((Camera) machine2).snap();
        ((Camera) machine2).video();
        ((Camera) machine2).start();

        System.out.println();

        //Camera camera1 = (Camera) new Machine();
        //((Machine) camera1).start();
        //camera1.start();
        //camera1.video();



    }
    /* once you changed the machine to a camera you can always reach the methods that are in the machine class, but you
    can't automatically reach the "non inherited methods"  in the derivative class. In other words:
    change the machine to a new camera you can automatically reach the methods video and start but not the method snap.
    If you want to reach the snap method (lonely method) you need to down cast.

    REMEMBER!!
    You can not make the Camera a new Machine, but you can make the Machine a new Camera!!
     */
}
