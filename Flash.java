package HW1;

import java.util.List;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public Float Power;
    
    public Flash(Point3D location, Angle3D angle, HW1.Color color, Float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }

    public void Rotate(Angle3D ang) {};
    public void Move(Point3D point) {};
}
