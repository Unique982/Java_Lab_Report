

// Q.N 3 ref write a java program to introspection of properties of java bean have created


public class TestBean {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(19);
        st.setName("Khem raj Neupane");
        st.setSem("Sixth");
        
        System.out.println("Student Details");
        System.out.println("Id\tName\tSemester");
        System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getSem());
    } 
}
