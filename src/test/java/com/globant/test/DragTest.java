package com.globant.test;
import com.globant.utils.test.BaseTest;
import org.testng.annotations.Test;

public class DragTest extends BaseTest {

    @Test
    public void checkContentDrag(){

        softAssert.assertEquals(dragScreen.getTitleSectionText(), "Drag and Drop");

        softAssert.assertTrue(dragScreen.isVisibleResetBtn());
        softAssert.assertTrue(dragScreen.isVisibleSquare11());
        softAssert.assertTrue(dragScreen.isVisibleSquare12());
        softAssert.assertTrue(dragScreen.isVisibleSquare13());
        softAssert.assertTrue(dragScreen.isVisibleSquare21());
        softAssert.assertTrue(dragScreen.isVisibleSquare22());
        softAssert.assertTrue(dragScreen.isVisibleSquare23());
        softAssert.assertTrue(dragScreen.isVisibleSquare31());
        softAssert.assertTrue(dragScreen.isVisibleSquare32());
        softAssert.assertTrue(dragScreen.isVisibleSquare33());

        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare1());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare2());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare3());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare4());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare5());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare6());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare7());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare8());
        softAssert.assertTrue(dragScreen.isVisibleSolutionSquare9());

        softAssert.assertAll();
    }
}
