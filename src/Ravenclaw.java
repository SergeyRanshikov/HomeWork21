public class Ravenclaw extends Hogwarts{

    //    Когтевранцы умны, мудррость, остроумие и полны творчества.
//    Ravenclaws are smart, wise, witty, and full of creativity.
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int thePowerOfSorcery, int apparition, int smart, int wise, int witty, int creativity) {
        super(name, thePowerOfSorcery, apparition);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}