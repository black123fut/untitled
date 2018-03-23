public class Catalog {

    private VideoGameComponent gameCatalogue;

    public Catalog(VideoGameComponent gameCatalogue){
        this.gameCatalogue = gameCatalogue;
    }

    public void showCatalogue(){
        gameCatalogue.showInfo();
    }


}
