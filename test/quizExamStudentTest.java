/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class quizExamStudentTest {
    
    public quizExamStudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of answerCheck method, of class quizExamStudent.
     */
    @Test
    public void testAnswerCheck() {
        System.out.println("answerCheck");
        quizExamStudent instance = new quizExamStudent();
        instance.answerCheck();
        //TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of question method, of class quizExamStudent.
     */
    @Test
    public void testQuestion() {
        System.out.println("question");
        quizExamStudent instance = new quizExamStudent();
        instance.question();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of submit method, of class quizExamStudent.
     */
    @Test
    public void testSubmit() {
        System.out.println("submit");
        quizExamStudent instance = new quizExamStudent();
        instance.submit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class quizExamStudent.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        quizExamStudent.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
