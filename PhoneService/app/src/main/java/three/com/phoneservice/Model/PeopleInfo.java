package three.com.phoneservice.Model;

/**
 * Created by Administrator on 2015/9/24.
 */
public class PeopleInfo {

    private int id=0;

    private String schoolNumber;
    private String peopleName;
    private String phoneNumber;
    private String className;
    private int hasBeenCalled=0;
    private boolean isChecked=false;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHasBeenCalled() {
        return hasBeenCalled;
    }

    public void setHasBeenCalled(int hasBeenCalled) {
        this.hasBeenCalled = hasBeenCalled;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
