/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testLintJSFileNoErrors() {
        String filePath = "../app/src/main/resources/NoErrors.js";
        String errorMessage = App.lintJavaScriptFile(filePath);
        assertEquals("", errorMessage);
    }

    @Test
    public void testLintJSFileOneError() {
        String filePath = "../app/src/main/resources/OneError.js";
        String errorMessage = App.lintJavaScriptFile(filePath);
        assertEquals("Line 1: Missing semicolon.\n", errorMessage);
    }

    @Test public void testLintJSFileFewErrors() {
        String filePath = "../app/src/main/resources/FewErrors.js";
        String errorMessage = App.lintJavaScriptFile(filePath);
        assertEquals("Line 1: Missing semicolon.\nLine 2: Missing semicolon.\n", errorMessage);
    }

    @Test public void testLintJSFileManyErrors() {
        String filePath = "../app/src/main/resources/ManyErrors.js";
        String errorMessage = App.lintJavaScriptFile(filePath);
        assertEquals("Line 1: Missing semicolon.\nLine 2: Missing semicolon.\nLine 3: Missing semicolon.\nLine 4: Missing semicolon.\nLine 5: Missing semicolon.\n", errorMessage);
    }

}
