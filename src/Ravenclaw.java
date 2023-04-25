public class Ravenclaw extends Hogwarts{

    //    Когтевранцы умны, мудррость, остроумие и полны творчества.
//    Ravenclaws are smart, wise, witty, and full of creativity.
    private final String faculty = "Ravenclaw";
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

    public String getFaculty() {
        return faculty;
    }
    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Intelligence: " + this.getSmart()
                + "; Wisdom: " + this.getWise()
                + "; Wit: " + this.getWitty()
                + "; Creativity: " + this.getCreativity()
                + "\n");
    }

    public String compareRavenclaw(Ravenclaw match) {
        if (this.sumScoreStudent() > match.sumScoreStudent())
            return this.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + match.getName();
        else if (match.sumScoreStudent() > this.sumScoreStudent())
            return match.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + this.getName();
        else
            return this.getName() + " и " + match.getName() + " одинаковые по силе " + this.getFaculty() + " студенты";
    }

    private long sumScoreStudent() {
        return this.getSmart() + this.getWise() + this.getWitty() + this.getCreativity();
    }
}