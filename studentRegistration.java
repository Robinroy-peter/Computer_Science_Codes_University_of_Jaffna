class studentRegistration{
    
    public static void main(String[] args){
        
        
        student stnt1,stnt2,stnt3;
        String stntName1,stntName2,stntName3,stntName4;
        
        stnt1 = new student();
        stnt2 = new student();
        stnt3 = new student();
        
        stnt1.setStudentName("Robinroy");
        stnt2.setStudentName("Kalai");
        stnt3.setStudentName("Nopert");
        
        stnt1.setStudentMarks_Sub1(45);
        stnt2.setStudentMarks_Sub1(65);
        stnt3.setStudentMarks_Sub1(75);
        
        stnt1.setStudentMarks_Sub2(25);
        stnt2.setStudentMarks_Sub2(42);
        stnt3.setStudentMarks_Sub2(78);        
        
        stnt1.setStudentMarks_Sub3(12);
        stnt2.setStudentMarks_Sub3(45);
        stnt3.setStudentMarks_Sub3(36);
        
        stntName1 =stnt1.getStudentName();
        stntName2 =stnt2.getStudentName();
        stntName3 =stnt3.getStudentName();

        System.out.println(stntName2+"'s Total is "+stnt2.setStudentMarks_Total());
       
    }
}