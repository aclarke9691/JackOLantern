public class JackOLanternRunner {
    public static void main(String[] args)
    {
        String[][] face= new String[5][8];
        JackOLantern face1= new JackOLantern(face);

        face1.fill("x");
        face1.edit(" ",0,0);
        face1.edit(" ",0,1);
        face1.edit(" ",0,6);
        face1.edit(" ",0,7);
        face1.edit(" ",1,0);
        face1.edit(" ",1,7);
        face1.edit(" ",4,0);
        face1.edit(" ",4,7);
        face1.edit("$",1,2);
        face1.edit("$",1,5);

        System.out.println(face1);

    }
}
