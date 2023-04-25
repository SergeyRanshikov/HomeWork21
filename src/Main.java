public class Main {


    public static void main(String[] args) {

        Hogwarts[] students = {
                new Hogwarts("Harry Potter", 35, 46),
                new Hogwarts("Hermione Granger", 30, 25),
                new Hogwarts("Ron Weasley", 33, 18),
                new Hogwarts("Draco Malfoy", 26, 42),
                new Hogwarts("Graham Montagu", 18, 34),
                new Hogwarts("Gregory Goyle", 20, 34),
                new Hogwarts("Zacharias Smith", 27, 40),
                new Hogwarts("Cedric Diggory", 31, 11),
                new Hogwarts("Justin Finch-Fletchley", 18, 16),
                new Hogwarts("Zhou Chang", 22, 21),
                new Hogwarts("Padma Patil", 16, 25),
                new Hogwarts("Marcus Belby", 32, 21),
        };
//        System.out.println("Количество студентов Hogwarts " + students.length);
//        for (int i = 0; i < students.length; i++) {
//            Hogwarts hogwarts = students[i];
//            System.out.println("Студент " + hogwarts.getName() + ", имеет силу колдовства " + hogwarts.getThePowerOfSorcery() + ", может трангрессироваться на расстояние " + hogwarts.getApparition());
//        }


        Gryffindor [] gryffindor = {
                new Gryffindor("Harry Potter", 35, 46, 5,5,11),
                new Gryffindor("Hermione Granger", 30, 25, 5,4,10),
                new Gryffindor("Ron Weasley", 33, 18, 5,5,11),
        };

        Slytherin [] slytherin = {
                new Slytherin("Draco Malfoy", 26, 42,5,4,6,1,8),
                new Slytherin("Graham Montagu", 18, 34,4,3,4,1,1),
                new Slytherin("Gregory Goyle", 20, 34,5,2,3,2,4),
        };
        Hufflepuff [] hufflepuff = {
                new Hufflepuff("Zacharias Smith", 27, 40,4,5,2),
                new Hufflepuff("Cedric Diggory", 31, 11,2,2,3),
                new Hufflepuff("Justin Finch-Fletchley", 18, 16,5,1,2),
        };
        Ravenclaw [] ravenclaw = {
                new Ravenclaw("Zhou Chang", 22, 21,4,4,1,2),
                new Ravenclaw("Padma Patil", 16, 25,3,2,5,6),
                new Ravenclaw("Marcus Belby", 32, 21,2,3,1,5),
        };
        System.out.println();
        // сравнение внутри факультетов
        System.out.println(slytherin[0].compareSlytherin(slytherin[1]));
        System.out.println(gryffindor[0].compareGriffindor(gryffindor[2]));

        System.out.println(ravenclaw[0].compareRavenclaw(ravenclaw[2]));
        System.out.println(hufflepuff[0].compareHufflepuff(hufflepuff[1]));
        // сравнение между факультетами
        System.out.println(gryffindor[1].compareHogwarts(slytherin[0]));
        System.out.println(ravenclaw[0].compareHogwarts(hufflepuff[2]));
    }


}
