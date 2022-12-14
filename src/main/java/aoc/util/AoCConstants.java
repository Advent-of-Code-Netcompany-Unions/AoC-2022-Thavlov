package aoc.util;

public interface AoCConstants {
    String SESSION_ID = "???";
    String SESSION_ID_STRING = String.format("session=%s", SESSION_ID);
    String INPUT_URL = "https://adventofcode.com/2022/day/%d/input";
    String INPUT_FILE_NAME = "input.txt";
    String EXAMPLE_FILE_NAME = "example.txt";
    String INPUT_FILE_FOLDER = "src/main/resources/day%02d";
    boolean PRINT_EXECUTION_TIME = false;
    boolean COPY_TO_CLIPBOARD = false;
    boolean RUN_EXAMPLE = false;
}
