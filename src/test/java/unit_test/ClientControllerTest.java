package unit_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.Gym_Membership_Management.models.dtos.RequestClientDTO;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Data
@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@AutoConfigureTestDatabase
public class ClientControllerTest {


    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testCreateClientShouldPass() throws Exception {
        RequestClientDTO requestClientDTO = new RequestClientDTO();
        requestClientDTO.setFirstName("test first name");
        requestClientDTO.setLastName("test last name");
        requestClientDTO.setEmail("test email");
        requestClientDTO.setSex('F');

        mockMvc.perform(post("/api/clients")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestClientDTO)))
                .andExpect(status().isOk());
    }


}
}
