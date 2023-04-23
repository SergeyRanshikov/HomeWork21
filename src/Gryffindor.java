public class Gryffindor extends Hogwarts {
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

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
