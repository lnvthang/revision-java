import java.util.Arrays;
import java.util.List;

public class CommonUtils {
    public List<UserModel> createUserModelList() {
        return Arrays.asList(
                new UserModel(1L, "User 1"),
                new UserModel(2L, "User 2"),
                new UserModel(3L, "User 3"),
                new UserModel(4L, "User 4"),
                new UserModel(5L, "User 5"),
                new UserModel(6L, "User 6"),
                new UserModel(7L, "User 7"),
                new UserModel(8L, "User 8"),
                new UserModel(9L, "User 9"),
                new UserModel(10L, "User 10")
        );
    };
}
