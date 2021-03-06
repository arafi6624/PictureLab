/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue(){
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate(){
    Picture beatifulCat=new Picture("beautifulCat.jpg");
    beatifulCat.explore();
    beatifulCat.negate();
    beatifulCat.explore();
  }

  public static void testGrayscale(){
    Picture beatifulCat=new Picture("beautifulCat.jpg");
    beatifulCat.explore();
    beatifulCat.grayScale();
    beatifulCat.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVerticalRightToLeft();
    redMotorcycle.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms(){
    Picture snowman=new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void exploreSeagull(){
    Picture seagull=new Picture("seagull.jpg");
    seagull.explore();
  }
  public static void testShiftGull(){
    Picture seagull=new Picture("seagull.jpg");
    seagull.explore();
    seagull.shiftGull();
    seagull.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testCollage2(){
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage2();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
   // testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   // testNegate();
    //testGrayscale();
    //testFixUnderwater();
   // testMirrorVertical();
   // testMirrorHorizontal();
   // testMirrorHorizontalBotToTop();
   // testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testShiftGull();
    //testMirrorDiagonal();
  //  testCollage();
    //testCopy();
    testCollage2();
   // testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //exploreSeagull();
  }
}