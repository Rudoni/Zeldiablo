package Cases;

/**
 * classe vide
 */

public class Vide extends Case {

    /**
     * boolean occupe
     */

    private boolean occupe;
    public Vide(int x, int y) {
        super(x,y);
        this.occupe = false;
    }

    /**
     * setter occupe
     */

    public void setOccupe(){
        if(this.occupe == true){
            this.occupe = false;
        }else{
            this.occupe = true;
        }
    }

    /**
     * getter occupe
     * @return boolean
     */

    public boolean estOccupe(){
        return this.occupe;
    }



}
