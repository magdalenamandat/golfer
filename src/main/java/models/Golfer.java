package models;


import javax.persistence.*;

@Entity
@Table(name="golfers")
public class Golfer {


        private String firstName;
        private String lastName;
        private int age;
        private int id;

        public Golfer(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    @Column(name = "first_name")
        public String getFirstName() {
            return firstName;
        }

    @Column(name = "last_name")
        public String getLastName() {
            return lastName;
        }


    @Column(name = "age")
        public int getAge() {
            return age;
        }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

