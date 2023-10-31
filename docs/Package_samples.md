# Module: tdd-samples, Package: samples 

Purpose: To provide simple examples of various unit tests. 

Under ```src/main/java```, class Calc provides a trivial SUT (system under test). It has a single method named _sum()_ that takes a list of Doubles and sums them.

Class ```LoadAndSortList``` represents code one might write to read lines from a file and load each line into a Java List object, then sort the values and return the sorted List. In keeping with the software design principle, Separation of Concerns, the code in this class does not "know about" files; it only performs the processing for each record. 

Class ```Exception1``` can throw exceptions. Test class ```Exception1Test``` demonstrates ways to check that the expected exception was thrown and the exception message is as expected.

Under ```src/test/java``` there are a few unit test examples. Note that the test classes for Calc are intentionally designed to show a test failure (except the PBT example), so you can see how that looks. 

Under ```src/integrationTest/java``` there is a sample integration test written with JUnit. This is not the sort of microtest you would write for TDD, but it is provided for reference. 

## Class CalcCheck

```CalcCheck``` can be executed as a main program. It contains two microtests, both coded in method _runTests()_. This class illustrates an approach to writing microtests without the use of a unit testing library or framework. 

Learning goal: Get a sense of how to check the functionality of a method "by hand." 

## Class CalcTest 

```CalcTest``` is a typical JUnit test class. It contains two test methods that perform the same functional checks as the code in class ```CalcCheck```. 

Learning goal: Get a basic sense of how a unit testing library can simplify the task of writing microtests, and make the examples easier to read and understand. It illustrates the use of the JUnit annotation, @Test, which tells JUnit that a method is meant to be treated as a test case.

## Class CalcRefactoredTest 

This is the same as ```CalcTest``` after some basic refactoring was performed to reduce duplication. It illustrates another JUnit annotation, @BeforeEach, that causes the annotated method to be executed before each test case.

Learning goal: Gain a basic sense of how refactoring can simplify the design, reduce the number of lines of code, and enhance readability of the test suite.

## Class CalcParameterizedTest 

This is another refactored version of ```CalcTest```. It illustrates a parameterized test, also known as a data-driven test. The parameterized test performs the same functional checks as the other versions of ```CalcTest```. 

Learning goal: See how a parameterized test can reduce a number of separate test cases that are structurally the same, and differ only in their inputs and expected output, into a single test method. 

## Class CalcPropertyTest 

TDD is normally done using example-based test cases. Property Based Testing (PBT) is another approach to unit testing that can be applied to TDD, or to after-the-fact checking. PBT is out of scope for the course, but this example is provided to give you a basic idea of how it looks.

Learning goal: Awareness of PBT for future reference. 

## Class Exception1Test 

This class illustrates how to assert that the SUT throws the expected exception when passed certain input values, and to assert the exception message is as expected. 

Learning goal: See how to check for exceptions.

## Class LoadAndSortListTest 

This class illustrates how to define and use a _mock_ with one of the popular mocking libraries for Java, Mockito. Other mocking libraries support similar functionality. 

Learning goal: See how to check the functionality of a method that depends on a collaborator to provide access to an external data source, such as a file, without introducing a dependency on that data source to the test suite. 

The mock stands in for a BufferedReader instance that would probably be connected to a file in "real life." We are not checking the functionality of the file system, so we don't want the test case to be subject to failures due to file issues.

## Class StreetAddressTest 

This class illustrates how to trick the test coverage metrics by writing meaningless examples that all pass. It checks class ```StreetAddress```, which contains code that does not work. 

You will see this sort of thing in code bases that you support. Do not do this as a way to satisfy management-imposed test coverage targets. Fix the test suites properly.

## Class TestNames 

This class provides several examples of test method naming conventions that are commonly used. There are quite a few more, as well. 

## Package fizzplay 

One of the exercises you can choose to practice using TDD for greenfield development is the venerable FizzBuzz problem. You've probably done this exercise before, possibly without using TDD, for various job interviews. 

The ```fizzplay``` package contains several implementations of FizzBuzz as well as a single test case. There are three reasons to include this package in the sample codebase. 

**_First_**, many people get carried away trying to write clever implementations. Some want to write a one-line solution. Others want to exercise some particular feature of the programming language they're using, even if it isn't necessary to write FizzBuzz. Still others want to write a solution that's intentionally hard to understand, just for fun. 

So, to help you get that out of your system, I thought it would be helpful to provide several FizzBuzz solutions that elevate cleverness to the level of absurdity. 

**_Second_**, a common misconception about TDD is that the test suite locks in the design of the production code because any change to the production code will break the tests. 

When I hear/read someone say this, I know the speaker/author does not understand TDD even on a basic level. When you drive the production code from test cases, you always write the test cases that express the desired functionality _before_ you change any of the production code. Then you change the production code to make the desired functionality a reality. It is literally impossible to break tests by changing production code, because you never modify production code before you've adjusted the test suite.

In fact, the test suite is your safety net for making changes to the production code. If a test case breaks, it's because you made a mistake changing the production code. 

So, the sample code in package ```fizzplay``` demonstrates that the same test case can check the behavior of all the different FizzBuzz implementations. 

**_Third_**, in almost all interview/screening situations, the interviewer wants to see how fast the candidate can scribble a FizzBuzz solution on a whiteboard. But there are also situations when the interviewer wants to assess the candidate's thought process and approach to coding. 

Those are the more deirable jobs. They don't care how clever your solution is. They don't care if you finish a solution. They want to see how you build up the code logically. That usually means they want to see you apply TDD to the problem, step by step. So you might as well practice doing it that way.
