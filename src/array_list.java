import java.util.List;

public class array_list {

    public static CommonUtils common = new CommonUtils();

    public static void main(String[] args) {
        List<UserModel> arrList = common.createUserModelList();
        System.out.println("List: " + arrList);
    }
}
