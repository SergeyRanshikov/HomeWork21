public class Gryffindor extends Hogwarts {
    private final String faculty = "Gryffindor";
    private int nobility;
    private int honor;
    private int courage;
//    Всем Гриффиндорцам присущи благородство, честь и храбрость.
//    All Gryffindors are characterized by nobility, honor and courage.


    public Gryffindor(String name, int thePowerOfSorcery, int apparition, int nobility, int honor, int courage) {
        super(name, thePowerOfSorcery, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return ("Факультет: " + this.getFaculty() + ". " + super.toString() + "Благородство: " + this.getNobility()
                + "; Честь: " + this.getHonor() + "; Храбрость: " + this.getCourage() + "\n");
    }
    public String compareGriffindor(Gryffindor match) {
        if (this.sumScoreStudent() > match.sumScoreStudent())
            return this.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + match.getName();
        else if (match.sumScoreStudent() > this.sumScoreStudent())
            return match.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + this.getName();
        else
            return this.getName() + " и " + match.getName() + " одинаковые по силе " + this.getFaculty() + " студенты";
    }

    private long sumScoreStudent() {
        return this.getNobility() + this.getHonor() + this.getCourage();
    }

}
