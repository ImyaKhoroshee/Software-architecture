import java.util.ArrayList;

public class Scene {

    public Integer id;
    public ArrayList<PoligonalModel> models;
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    public Scene(PoligonalModel insertModels, Camera insertCameras) {

        models.add(insertModels);
        cameras.add(insertCameras);
    }

    public Type method1(Type type) {
        return type;
    }

    public Type2 method2(Type2 type, Type1 tp) {
        return type;
    }
}
