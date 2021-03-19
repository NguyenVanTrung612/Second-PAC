package CayNhiPhan;

// Author: Nvt //
public class Student {
    public static int autoId;
    public int Id;
    public String Name;
    public int Age;
    public String Gender;
    public String Address;
    public int Mssv;

    public Student(String Name, int Age, String Gender, String Address, int Mssv) {
        if (Student.autoId < 0)
            Student.autoId = 0;
        this.Id = Student.autoId++;
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Address = Address;
        this.Mssv = Mssv;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public int getMssv() {
        return this.Mssv;
    }

    public void setMssv(int mssv) {
        Mssv = mssv;
    }

    public void printInfor() {
        System.out.println("\nId: " + this.Id);
        System.out.print("Name: " + this.Name);
        System.out.print("\nAge: " + this.Age);
        System.out.print("\nGender: " + this.Gender);
        System.out.print("\nAddress: " + this.Address);
        System.out.println("\nMssv: " + this.Mssv);
        System.out.println("\n---------------------------");
    }
}
