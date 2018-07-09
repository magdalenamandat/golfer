import db.DBGolfer;
import models.Golfer;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer = new Golfer("Mark", "Henderson", 40);
        DBGolfer.save(golfer);
    }
}
