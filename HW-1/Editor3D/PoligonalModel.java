public class PoligonalModel {

    private Poligon poligons;
    private Texture textures;

    public PoligonalModel(Texture createTexture) {
        poligons = new Poligon(new Point3D());
        textures = createTexture;
    }
}
