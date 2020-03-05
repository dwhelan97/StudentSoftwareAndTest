package StudentPackage;

public class Student {
    String name;
    String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        if(name == ""){
            throw new IllegalArgumentException("ERROR... No Name");
        }else if(email == ""){
            throw new IllegalArgumentException("ERROR... No Email");
        }else{
            System.out.println("Successfully added");
        }
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return name +" "+ email;
    }
}
