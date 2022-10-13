package Task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> passedCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> currentCourses){
    super(name);



    }

    @Override
    public boolean addCourse() {
        return super.addCourse();
    }
}
