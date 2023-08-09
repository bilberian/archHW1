package HW1;

import java.util.List;

public class ModelStore implements IModelChanger, IModelChangedObserver {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObservers;
    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void ApplyUpdateModel() {
        // TODO Auto-generated method stub
        
    }

    public Scene GetScena(int a) {
        return smth ;
    }

    
}
