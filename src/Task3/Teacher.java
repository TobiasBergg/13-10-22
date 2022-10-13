package Task3;

import java.util.ArrayList;

public class Teacher extends Person{

    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> canTeach = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach){
        super(name);


    }

    @Override
    public boolean addCourse() {
        return super.addCourse();
    }
}
