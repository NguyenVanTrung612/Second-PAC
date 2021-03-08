package DSLKDon;

public class Student {
    public String name;
    public int age;
    public String gender;
    public String address;

    public Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printInfor() {
        System.out.print("\nName: " + this.name);
        System.out.print("\nAge: " + this.age);
        System.out.print("\nGender: " + this.gender);
        System.out.print("\nAddress: " + this.address);
        System.out.println("\n---------------------------");
    }

}
