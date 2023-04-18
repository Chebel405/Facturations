package com.Facturation.demo.Controller;
import com.Facturation.demo.Configuration.UtilisateurConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UtilisateurConfiguration.class)
@WebMvcTest(UtilisateurController.class)
public class UtilisateurControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllUtilisateur() throws Exception {
        mockMvc.perform(get("/utilisateurs"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].nom", is("Chebel")))
                .andExpect(jsonPath("$[0].prenom", is("Anne")))
                .andExpect(jsonPath("$[1].nom", is("Camus")))
                .andExpect(jsonPath("$[1].prenom", is("Albert")));

    }

    @Test
    public void testGetUtilisateurById() throws Exception {
        mockMvc.perform(get("/utilisateurs/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.nom", is("Chebel")))
                .andExpect(jsonPath("$.prenom", is("Anne")));
    }

    @Test
    public void testCreateUtilisateur() throws Exception{
        String requestBody = "{\"nom\":\"Camus\",\"prenom\":\"Albert\"}";
        mockMvc.perform(post("/utilisateurs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").exists());
    }

    @Test
    public void testUpdateUtilisateur() throws Exception {
        String requestBody = "{\"nom\":\"Chebel\",\"prenom\":\"Albert\"}";

        mockMvc.perform(put("/utilisateurs/2")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(2)))
                .andExpect(jsonPath("$.nom", is("Chebel")))
                .andExpect(jsonPath("$.prenom", is("Albert")));
    }

    @Test
    public void testDeleteUtilisateur() throws Exception {
        mockMvc.perform(delete("/utilisateurs/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].nom", is("Camus")))
                .andExpect(jsonPath("$[0].prenom", is("Albert")));
    }

}