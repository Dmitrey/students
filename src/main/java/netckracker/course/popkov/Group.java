package netckracker.course.popkov;
import java.util.ArrayList;
/**
 * Created by HP on 15.03.2019.
 */
public class Group {

    public ArrayList<Student> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Student> group) {
        this.group = group;
    }

    ArrayList<Student> group = new ArrayList<>();

    public double getAverageAge(){
        double sum = 0;
        double average;
        for (Student obj: getGroup()) {
            sum += obj.getAge();
        }
        average = sum/getGroup().size();
        return average;
    }

}
