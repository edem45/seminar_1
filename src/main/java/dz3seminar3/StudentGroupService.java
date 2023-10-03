package dz3seminar3;


import java.util.*;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void removeStudentByFIO(String lastName, String secondName, String firstName){
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)&&
                    student.getLastName().equals(lastName)){
                iterator.remove();
            }
        }
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentsList());
        Collections.sort(studentList);
        return studentList;
    }
}