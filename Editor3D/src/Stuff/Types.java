package Stuff;

import ModelEliments.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Types {
    public class Point3D {

    }
    public class Angle3D {

    }
    public class Color {

    }
    public class Texture{
        public List<PoligonalModel> poligonalModel;
        public Texture(List<PoligonalModel> poligonalModels){
            this.poligonalModel = poligonalModels;
        }

    }
    public class Poligon{
        public List<Point3D> Points;
        public Poligon(){
            this.Points = new ArrayList<Point3D>();
        }
    }
    public class Type{

    }
}
