public class Hogwarts {
    private  String name;
    private  int thePowerOfSorcery;
    private  int apparition;

    public Hogwarts(String name, int thePowerOfSorcery, int apparition) {
        this.name = name;
        this.thePowerOfSorcery = thePowerOfSorcery;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThePowerOfSorcery() {
        return thePowerOfSorcery;
    }

    public void setThePowerOfSorcery(int thePowerOfSorcery) {
        this.thePowerOfSorcery = thePowerOfSorcery;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }




    @Override
    public String toString() {
        return ("Студент: "+this.getName()+"с силой колдовства: "+this.getThePowerOfSorcery()+"; трансгрессия: "+this.getApparition()+"\n");
    }
    public String compareHogwarts(Hogwarts match) {
        if (this.sumScoreStudent() > match.sumScoreStudent())
            return this.getName() + " учится лучше, чем " + match.getName();
        else if (match.sumScoreStudent() > this.sumScoreStudent())
            return match.getName() + " учится лучше, чем " + this.getName();
        else
            return this.getName() + " и " + match.getName() + " равные по силе ученики";
    }
    private long sumScoreStudent() {
        return this.getThePowerOfSorcery() + this.getApparition();
    }


}
