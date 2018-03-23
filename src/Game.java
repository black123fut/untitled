public class Game extends VideoGameComponent {

    private String gameName;
    private String studioName;
    private int realeaseYear;

    public Game(String gameName, String studioName, int realeaseYear){
        this.gameName = gameName;
        this.studioName = studioName;
        this.realeaseYear = realeaseYear;
    }

    @Override
    public void add(VideoGameComponent newGameComponent) {

    }

    @Override
    public String getStudioName() {
        return studioName;
    }

    @Override
    public void showInfo() {
        System.out.println("Game: " + getGameName());
        System.out.println("Studio: " + getStudioName());
        System.out.println("Realease year: " + getRealeaseYear() + "\n \n");

    }

    private int getRealeaseYear(){
        return realeaseYear;
    }


    private String getGameName(){
        return gameName;
    }
}
