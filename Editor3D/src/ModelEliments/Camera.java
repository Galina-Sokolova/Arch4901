package ModelEliments;

import Stuff.Types.Angle3D;
import Stuff.Types.Point3D;

public class Camera {
    public Point3D Location;
    public Angle3D Angle;
    public Camera(Point3D Location, Angle3D Angle){
        this.Location = Location;
        this.Angle = Angle;
    }
    public void Rotate(Angle3D angle3D){

    }
    public void Move (Point3D point3D){

    }
}
