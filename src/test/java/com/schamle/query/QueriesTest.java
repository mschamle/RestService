package com.schamle.query;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


import static org.junit.jupiter.api.Assertions.*;


class QueriesTest {

    @InjectMocks
    Queries queries;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getTest() {
        assertEquals("Hello", queries.get());
    }
}