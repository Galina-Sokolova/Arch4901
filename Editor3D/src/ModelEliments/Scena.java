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

    public Scena(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.Id = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.Cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }
    }

    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        if (type1 == type2) {
            return type1;
        } else
            return type2;
    }
}
