public class JackOLantern extends java.lang.Object{
    private String faceFeatures;

    public JackOLantern(String faceFeatures)
    {
        this.faceFeatures= faceFeatures;
    }

    public void edit(String replace, int row, int column)
    {
        list[row][column]=replace;
    }

    public String toString()
    {

    }

    public void fill(String str)
    {

    }
}
