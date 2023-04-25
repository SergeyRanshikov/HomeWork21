public class Hufflepuff extends Hogwarts{
    //    Студенты Пуффендуя трудолюбие, верность, честность.
//    Hufflepuff students diligence, loyalty, honesty.
    private final String faculty = "Hufflepuff";
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

    public String getFaculty() {
        return faculty;
    }
    @Override
    public String toString() {
        return ("Факультет: " + this.getFaculty()
                + ". " + super.toString()
                + "Трудолюбие: " + this.getDiligence()
                + "; Верность: " + this.getLoyalty()
                + "; Честность: " + this.getHonesty()
                + "\n");
    }

    public String compareHufflepuff(Hufflepuff match) {
        if (this.sumScoreStudent() > match.sumScoreStudent())
            return this.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + match.getName();
        else if (match.sumScoreStudent() > this.sumScoreStudent())
            return match.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + this.getName();
        else
            return this.getName() + " и " + match.getName() + " одинаковые по силе " + this.getFaculty() + " студенты";
    }

    private long sumScoreStudent() {
        return this.getDiligence() + this.getLoyalty() + this.getHonesty();
    }
}
