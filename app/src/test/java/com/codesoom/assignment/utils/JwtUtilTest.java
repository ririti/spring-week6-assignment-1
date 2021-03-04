package com.codesoom.assignment.utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JwtUtilTest {
    private static final String SECRET = "12345678901234567890123456789012";

    private static final String ACCESS_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VySWQiOjF9" +
            ".ZZ3CUl0jxeLGvQ1Js5nG2Ty5qGTlqai5ubDMXZOdaDk";
    JwtUtil jwtUtil;


    @BeforeEach
    void setUp() {
        jwtUtil = new JwtUtil(SECRET);

    }
    @Test
    void encode() {
        String accessToken = jwtUtil.encode(1L);

        assertThat(accessToken).isEqualTo(ACCESS_TOKEN);

    }
}