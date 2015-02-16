import com.jt.book.web.HelloController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author he
 * @since 2015/2/16
 */
public class HelloControllerTest {

    @Test
    public void test01() throws Exception {
        HelloController helloController = new HelloController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(helloController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
