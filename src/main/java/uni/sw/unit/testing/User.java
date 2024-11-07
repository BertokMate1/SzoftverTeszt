package uni.sw.unit.testing;

public class User {
    
    private String userName,password;
    private int id;
    private double academicAvg;

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public int getId() {
        return id;
    }

    public double getAcademicAvg() {
        return academicAvg;
    }

    public boolean isLoggedIn(){
            return false;
    }

    public double getAcademicAvgInt(int anyInt) {
        return academicAvg;
    }

    public boolean update(String newPassword, boolean isLoggedIn) {
        if(!isLoggedIn){
            return false;
        }
        else{
            this.password = newPassword;
            return true;
        }
    }
}
