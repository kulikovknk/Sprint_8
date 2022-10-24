import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.practikum.Account;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class AccountTest {
    @Parameterized.Parameters(name = "{index}: {0}, {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"VP", false},
                {"VASILIY PETROV123456", false},
                {"VASI LIY PETROV", false},
                {" VASILIY PETROV", false},
                {"VASILIY PETROV ", false},
                {"VASILIY PETROV", true},
        });
    }

    @Parameterized.Parameter(0)
    public String name;

    @Parameterized.Parameter(1)
    public Boolean expectedResult;

    @Test
    public void checkNameToEmbossTest() {

        Account account = new Account(name);

        Boolean result = account.checkNameToEmboss();

        Assert.assertEquals(expectedResult, result);

    }


}
