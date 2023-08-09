package HW1;

import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        Textures = textures;
        Poligons = poligons;
    }
}
