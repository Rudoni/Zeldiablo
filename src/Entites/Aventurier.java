package Entites;

public class Aventurier extends Personnage {

    public Aventurier(String s, int hp) {
        super(s, hp);
    }

    /*
    @Override
    public void move(Labyrinthe lab, Commande c) {
        boolean f = false;
        if (c.bas) {
            f = this.essayerMovement(+1,0,lab);
        }
        if (c.haut) {
            f = this.essayerMovement(-1,0,lab);
        }
        if (c.droite) {
            f = this.essayerMovement(0,+1,lab);
        }
        if (c.gauche) {
            f = this.essayerMovement(0,-1,lab);
        }
        /*
                Scanner sc = new Scanner(System.in);

        while (!f){
            String dep = sc.nextLine();
            switch(dep){
                case("z"):
                    f = this.essayerMovement(-1,0,lab);
                    break;
                case("s"):
                    f = this.essayerMovement(+1,0,lab);
                    break;
                case("d"):
                    f = this.essayerMovement(0,+1,lab);
                    break;
                case("q"):
                    f = this.essayerMovement(0,-1,lab);
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
                    lab.afficher();
                    break;
            }
        }

         */

    /* Pour tester le move (on utilise une boucle qui redemande a chaque fois tant que le move n est pas bon)
    public void move(String str,Labyrinthe lab) {
            String dep = str;
            switch(dep){
                case("z"):
                    this.essayerMovement(-1,0,lab);
                    break;
                case("s"):
                    this.essayerMovement(+1,0,lab);
                    break;
                case("d"):
                    this.essayerMovement(0,+1,lab);
                    break;
                case("q"):
                    this.essayerMovement(0,-1,lab);
                    break;
                default:
                    System.out.println("Veuillez entrer une coordonnée valide :");
                    lab.afficher();
                    break;
            }
    }
    */


}
