public class Hufflepuff extends Hogwarts{
    //    Студенты Пуффендуя трудолюбие, верность, честность.
//    Hufflepuff students diligence, loyalty, honesty.
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int thePowerOfSorcery, int apparition, int diligence, int loyalty, int honesty) {
        super(name, thePowerOfSorcery, apparition);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
