import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Mark", "Henderson", 40);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("William", "Bell", 50);
        DBGolfer.save(golfer2);

        List<Golfer> golfers = DBGolfer.getAll();

        Golfer golfer = DBGolfer.find(golfer1.getId());

        Golfer golferGee = DBGolfer.findByFirstName(golfer1.getFirstName());

        System.out.print(golferGee.getFirstName());
    }
}
