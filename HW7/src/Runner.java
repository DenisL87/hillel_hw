public class Runner {
    public static void main (String[] args) {

        Van[] v = new Van[2];
        v[0] = new Van("Opel", "Vivaro", 15000, 180, 9);
        v[1] = new Van("Volkswagen", "T5", 10000, 180, 9);

        Lorry[] l = new Lorry[6];
        l[0] = new Lorry("KAMAZ", "65206", 45000, 100, 20);
        l[1] = new Lorry("MAZ", "4570", 45000, 75, 30);
        l[2] = new Lorry("MAN", "65206", 45000, 100, 40);
        l[3] = new Lorry("KRAZ", "4570", 45000, 75, 8);
        l[4] = new Lorry("Scania", "65206", 45000, 100, 14);
        l[5] = new Lorry("Renault", "65206", 45000, 100, 44);

        }
}