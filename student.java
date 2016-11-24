class student{
    
    public String student_name;
    public int marks1;
    public int marks2;
    public int marks3;
    public int Total;

    public student(){
        student_name = "Unknown";
    }
    public void setStudentName(String sname){
        student_name = sname;
    }   
    public String getStudentName(){
        return student_name;
    }
    public int getStudentMarks_Sub1(){
        return marks1;
    }
    public void setStudentMarks_Sub1(int smarks1){
        marks1 = smarks1;
    }
    public int getStudentMarks_Sub2(){
        return marks2;
    }
    public void setStudentMarks_Sub2(int smarks2){
        marks2 = smarks2;
    }  
    public int getStudentMarks_Sub3(){
        return marks3;
    }
    public void setStudentMarks_Sub3(int smarks3){
        marks3 = smarks3;
    } 
    public int setStudentMarks_Total(){
        return marks1 + marks2 +marks3;
    } 


}