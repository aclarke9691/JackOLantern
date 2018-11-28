public class JackOLantern extends java.lang.Object{
    private String[][] faceFeatures;

    public JackOLantern(String [][]faceFeatures)
    {
        this.faceFeatures= faceFeatures;
    }

    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column]=replace;
    }

    public String toString()
    {
        int x=0;
        int y=0;
        String result= "";
        while(x<faceFeatures.length)
        {
            while(y<faceFeatures[x].length)
            {
                result=result + faceFeatures[x][y];
                        y=y+1;
            }
            if (y!=faceFeatures[x].length-1)
            {
                result= result+ "\n";
            }
            x=x+1;
            y=0;
        }
        return result;

    }

    public void fill(String str)
    {
        int x=0;
        int y=0;
        while(x<faceFeatures.length) {
            while (y < faceFeatures[x].length) {
                faceFeatures[x][y] = str;
                y = y + 1;
            }

            x = x + 1;
            y = 0;
        }
    }
}
