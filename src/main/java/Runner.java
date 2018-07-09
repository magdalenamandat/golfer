import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer = new Golfer("Mark", "Henderson", 40);
        DBGolfer.save(golfer);

        List<Golfer> pirates = DBGolfer.getAll();

        Golfer mark = DBGolfer.find(golfer.getId());

        System.out.print(mark.getFirstName());
    }
}
