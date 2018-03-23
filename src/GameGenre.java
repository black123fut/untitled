import java.util.ArrayList;

//Composite
public class GameGenre extends VideoGameComponent {

    private ArrayList<VideoGameComponent> gameComponent = new ArrayList<>();

    private String newGenre;

    public GameGenre(String newGenre){
        this.newGenre = newGenre;
    }

    @Override
    public void add(VideoGameComponent newGameComponent) {
        gameComponent.add(newGameComponent);
    }


    @Override
    public void showInfo() {
        System.out.println(getNewGenre() + ": "+ "\n");


        for (VideoGameComponent game : gameComponent) {
            game.showInfo();
        }
    }

    @Override
    public VideoGameComponent getComponent(int index) {
        return gameComponent.get(index);
    }

    private String getNewGenre(){
        return newGenre;
    }


}
