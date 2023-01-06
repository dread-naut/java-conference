package org.dreadnaut;

import org.junit.jupiter.api.*;

import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DataReaderTest {

    @BeforeEach
    void setUp () {
    }

    @AfterEach
    void tearDown () {
    }

    @Test
    void empty_files_have_no_lines () {
        Assertions.assertEquals(
            List.of(),
            DataReader.loadDataFromFile("empty.tsv"),
            "empty files have no lines"
        );
    }
    @Test
    void 10mb_files_are_too_large () {
        Assertions.assertEquals(
            List.of(),
            DataReader.loadDataFromFile("empty.tsv"),
            "10mb files are too large"
        );
    }
    @Test
    void smaller_files_dont_error () {
        Assertions.assertEquals(
            List.of(),
            DataReader.loadDataFromFile("empty.tsv"),
            "smaller files don't error"
        );
    }
}