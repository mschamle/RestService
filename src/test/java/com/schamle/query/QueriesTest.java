package com.schamle.query;

import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;


class QueriesTest {

    @Inject
    Queries queries;

    @Test
    void getTest() {
        assertEquals("Hello", queries.get());
    }
}