package data;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="role")
    public Object[] data(){
        Object[] roles = new String[] {"Mentor", "Student","Instructor"};
        return roles;
    }
}
