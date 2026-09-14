package cdac.coreJava.day6.Assignment.constructor;

public class SortStudent {
    public void sort(Students[] s){
        Students temp;
        for(int i=0; i<s.length-1; i++){
            for(int j=i+1; j<s.length;j++){
                if(s[i].grade>s[j].grade){
                    temp=s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Sorted Students");
        for (Students students : s) {
            System.out.println("Name: " + students.name + "\nId: " + students.id + "\nGrade: " + students.grade);
        }

    }
}
