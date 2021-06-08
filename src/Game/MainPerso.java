package Game;

import MoteurJeu.Jeu;

public class MainPerso {
    public static void main(String[] args) {
        Jeu jeu = new JeuPerso();
        DessinPerso dessin = new DessinPerso((JeuPerso) jeu);
    }
}
