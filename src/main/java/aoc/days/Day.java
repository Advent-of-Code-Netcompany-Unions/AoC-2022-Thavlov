package aoc.days;

import aoc.util.AoCConstants;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static aoc.util.AoCConstants.COPY_TO_CLIPBOARD;

public abstract class Day {
    public void solve() {
        try {
            long startTime = System.currentTimeMillis();
            solvePart1();
            if (AoCConstants.PRINT_EXECUTION_TIME) {
                System.out.println(String.format("Part 1 solved in %d ms.", ((System.currentTimeMillis() - startTime))));
            }
            startTime = System.currentTimeMillis();
            solvePart2();
            if (AoCConstants.PRINT_EXECUTION_TIME) {
                System.out.println(String.format("Part 2 solved in %d ms.", ((System.currentTimeMillis() - startTime))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void solvePart1() throws Exception {
        initialize();
        final String solution = getPart1Solution();
        System.out.printf(" > Solution 1 to day %02d: %s%n", getDay(), solution);
        terminate(solution);
    }

    public void solvePart2() throws Exception {
        initialize();
        final String solution = getPart2Solution();
        System.out.printf(" > Solution 2 to day %02d: %s%n", getDay(), solution);
        terminate(solution);
    }

    protected abstract void initialize() throws Exception;

    protected abstract String getPart1Solution() throws Exception;

    protected abstract String getPart2Solution() throws Exception;

    protected int getDay() {
        return Integer.parseInt(this.getClass().getSimpleName().substring(3));
    }

    protected void terminate(String solution) {
        if (COPY_TO_CLIPBOARD) {
            final Clipboard clipboardObj = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboardObj.setContents(new StringSelection(solution), null);
        }
    }
}
