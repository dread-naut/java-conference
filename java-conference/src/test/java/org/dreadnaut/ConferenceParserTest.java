package org.dreadnaut;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConferenceParserTest {

    @BeforeEach
    void setUp () {
    }

    @AfterEach
    void tearDown () {
    }

    @Test
    void any_unparseable_lines_are_an_error () {
        final var oneBadLine = List.of(
            ""
        );
        // etc
    }

    void one_line_is_not_enough () {

    }
}