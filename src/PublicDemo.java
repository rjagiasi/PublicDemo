import com.package1.BaseClass;
import com.package1.ChildClass;
import com.package2.OtherPackageClass;

/**
 * Created by rohan on 9/6/18.
 */
public class PublicDemo {
    public static void main(String[] args){
        new BaseClass().printVariables();
        new ChildClass().printVariables();
        new OtherPackageClass().printVariables();
    }
}
