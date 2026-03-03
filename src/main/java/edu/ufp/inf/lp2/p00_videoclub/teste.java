package edu.ufp.inf.lp2.p00_videoclub;

public class teste {

    public static void main(String[] args) {

        // Criar atores
        Actor a1 = new Actor("Keanu Reeves");
        Actor a2 = new Actor("Carrie-Anne Moss");

        // Criar géneros
        Genre g1 = new Genre("Action");
        Genre g2 = new Genre("Sci-Fi");

        // Criar filme
        Movie m1 = new Movie("The Matrix", 1999);

        // Adicionar atores ao filme
        m1.addActor(a1);
        m1.addActor(a2);

        // Adicionar géneros ao filme
        m1.addGenre(g1);
        m1.addGenre(g2);

        // Mostrar dados
        System.out.println("Filme: " + m1.getTitle());
        System.out.println("Ano: " + m1.getYear());

        System.out.println("\nAtores:");
        for (Actor a : m1.listActors()) {
            System.out.println(a.getName());
        }

        System.out.println("\nGéneros:");
        for (Genre g : m1.listGenres()) {
            System.out.println(g.getGenre());
        }
    }
}
