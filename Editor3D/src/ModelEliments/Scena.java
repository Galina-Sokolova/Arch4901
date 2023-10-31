package ModelEliments;

import Stuff.Types;
import Stuff.Types.Type;

import java.util.ArrayList;
import java.util.List;

public class Scena {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    public Scena(int Id, List<Flash> Flashes){
        this.Id = Id;
        this.Models = new ArrayList<PoligonalModel>();
        this.Flashes =  Flashes;
        this.Cameras = new ArrayList<Camera>();

    }
    public Type method1(Type type){
        return type;
    }
    public Type method2(Type type1, Type type2){
        if (type1 == type2) {
            return type1;
        }
        else
            return type2;
    }
}
