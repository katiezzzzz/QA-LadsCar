package com.qa.cardatabase;

import org.junit.jupiter.api.Disabled;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Disabled
@AutoConfigureMockMvc
public class CarRestTests {

    // @Autowired
    // private MockMvc mockMvc;

    // @Test
    // public void testAuthentication() throws Exception {
    //     // Testing authentication with correct credentials
    //     this.mockMvc.perform(post("/login")
    //             .content("{\"username\":\"admin\", \"password\":\"adminpass\"}")).
    //             andDo(print()).andExpect(status().isOk());

    //     // Testing authentication with wrong credentials
    //     this.mockMvc.perform(post("/login")
    //             .content("{\"username\":\"admin\", \"password\":\"wrongpwd\"}")).
    //             andDo(print()).andExpect(status().is4xxClientError());

    // }
}
