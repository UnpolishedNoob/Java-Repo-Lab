package Student;

public class Grade {

    public String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else return "F";
    }

    public boolean isPass(int marks) {
        return marks >= 70;
    }
}
