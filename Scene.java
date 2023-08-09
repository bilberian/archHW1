package HW1;

import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        Id = id;
        Models = models;
        Flashes = flashes;
    }
    public Type method1(Type type) {};
    public Type method2(Type type1, Type type2) {};


}
