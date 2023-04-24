public class Slytherin extends Hogwarts{
    //    ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти
//    Slytherin students are cunning, decisive, ambitious, resourceful and lust for power
    private final String faculty = "Slytherin";
    private int cunning;
    private int decisive;
    private int ambitious;
    private int resourceful;
    private int lustForPower;

    public Slytherin(String name, int thePowerOfSorcery, int apparition, int cunning, int decisive, int ambitious, int resourceful, int lustForPower) {
        super(name, thePowerOfSorcery, apparition);
        this.cunning = cunning;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisive() {
        return decisive;
    }

    public void setDecisive(int decisive) {
        this.decisive = decisive;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }


    public String getFaculty() {
        return faculty;
    }
    @Override
    public String toString() {
        return ("Faculty: " + this.getFaculty()
                + ". " + super.toString()
                + "Cunning: " + this.getCunning()
                + "; Determination: " + this.getDecisive()
                + "; Ambition: " + this.getAmbitious()
                + "; Resourcefulness: " + this.getResourceful()
                + "; Lust for power: " + this.getLustForPower()
                + "\n");
    }

    public String compareSlytherin(Slytherin match) {
        if (this.sumScoreStudent() > match.sumScoreStudent())
            return this.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + match.getName();
        else if (match.sumScoreStudent() > this.sumScoreStudent())
            return match.getName() + " студент, имеющий лучшие показатели на факультете " + this.getFaculty() + ", чем " + this.getName();
        else
            return this.getName() + " и " + match.getName() + " одинаковые по силе " + this.getFaculty() + " студенты";
    }

    private long sumScoreStudent() {
        return this.getCunning() + this.getDecisive() + this.getAmbitious() + this.getResourceful() + this.getLustForPower();
    }
}

