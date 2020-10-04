public class student //implements Comparable<student>
{
    String name;
    int marks;
    public student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student ->" +
                " name= " + name +
                " , marks=" + marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

//    @Override
//    public int compareTo(student o) {
//        if(this.marks > o.marks) return 1;
//        else if (this.marks < o.marks) return -1;
//        return this.name.compareTo(o.name);
//    }
}
