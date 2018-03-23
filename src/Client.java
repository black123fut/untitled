public class Client {

    public static void main(String[] args) {

        VideoGameComponent everyGenre = new GameGenre("Catalogue: \n");

        VideoGameComponent Action = new GameGenre("Action");

        Action.add(new Game("God of War","Santa Monica", 2005));
        Action.add(new Game("Uncharted", "Naughty Dog", 2007));

        VideoGameComponent RPG = new GameGenre("RPG");

        RPG.add(new Game("Dark souls", "From Software", 2011));
        RPG.add(new Game("The Witcher 3", "CD Projekt RED", 2016));

        VideoGameComponent Shooter = new GameGenre("Shooters");

        Shooter.add(new Game("Killzone", "Guerrilla Games", 2004));

        everyGenre.add(Action);
        everyGenre.add(RPG);
        everyGenre.add(Shooter);

        Catalog catalogue = new Catalog(everyGenre);
        catalogue.showCatalogue();

    }
}
