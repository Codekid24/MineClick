
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.File;


public class SaveLoad {

    private int myMoney;
    private int myLevel;
    private File save = new File("SaveState");

    public void Save(int money, int level) throws IOException {
        myMoney = money;
        myLevel = level;
        PrintWriter out = new PrintWriter(save);

        out.println(money + "m");
        out.println(level + "l");
        out.println("end");
        out.close();

    }

    public void load() throws IOException {
        FileReader fr = new FileReader(save);
        int i;
        String saveState = "";
        while ((i = fr.read()) != -1) {
            saveState += ((char) i);
        }

        String sMoney = saveState.substring(0,saveState.indexOf("m"));

        int money = Integer.parseInt(sMoney);
        myMoney = money;


        String Level = saveState.substring(1 + (saveState.indexOf("\n")),saveState.indexOf("l"));

        int level = Integer.parseInt(Level);
        myLevel = level;

    }

    public int getMyMoney(){
        return myMoney;
    }
    public int getMyLevel(){
        return myLevel;
    }





}
