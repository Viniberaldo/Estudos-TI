/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring.primeiro;

import static javax.swing.UIManager.get;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 *
 * @author viniberaldo
 */
@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntController {
    
    @Autowired
    private MockMvc mvc;
    
    @Test
    public void testInt() throws Exception {
        RequestBuilder requisicao = (RequestBuilder) get("/test");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem-vindo, DIO", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception {
        mvc.perform((RequestBuilder) get("/test?nome=Vini"))
                .andExpect(content().string("Bem-vindo, Vini"));
    }
   
    
}
