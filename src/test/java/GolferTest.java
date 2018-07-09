import models.Golfer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GolferTest {



        Golfer golfer;

        @Before
        public void before(){
            golfer = new Golfer("Mark", "Henderson", 40);
        }

        @Test
        public void hasFirstName(){
            assertEquals("Mark", golfer.getFirstName());
        }

        @Test
        public void hasLastName(){
            assertEquals("Henderson", golfer.getLastName());
        }

        @Test
        public void hasAge(){
            assertEquals(40, golfer.getAge());
        }


}
