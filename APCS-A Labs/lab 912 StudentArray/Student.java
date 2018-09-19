
/**
 * 
 * class Student
 * 
 * @author (Jason Wheaton) 
 * @version (9-14)
 */



public class Student extends studentRunner
{
    
    private int StudNumber;
    private boolean StudActive;
    private double StudGPA;
    private String StudName;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        StudNumber = 0;
        StudActive = true;
        StudGPA = 3.5;
        StudName = "Jason";
  
    }
    
    /**
     * Student Methods
     */
    public void setStudNumber(int sn){
        StudNumber = sn;
  
    }
    /**
     * 
     */
    public void setStudActive(boolean tf){
        StudActive = tf;
    }
    /**
     * 
     */
    public void setStudGPA(double xy){
        StudGPA = xy;
    }
    /**
     * 
     */
    public void setStudName(String JHW){
        StudName = JHW;
    }
public int getStudNumber(){
    return StudNumber;
}
public boolean getStudActive(){
    return StudActive;
}
public double getStudGPA(){
    return StudGPA;
}
public String getStudName(){
    return StudName;
}

}