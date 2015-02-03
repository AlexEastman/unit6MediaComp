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
  
  public static void testPosterize()
  {
      Picture picture = new Picture("dillon.jpg");
      picture.posterize(4);
      picture.explore();
  }
  
  public static void testSepia()
  {
      Picture picture = new Picture("gorge.jpg");
      picture.sepia();
      picture.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(804, 826);
    canvas.createCollage();
    
    
    Picture originalPic = new Picture("dillon.jpg");
    Picture sepiaPic = new Picture("dillon.jpg");
    Picture posterizePic = new Picture("dillon.jpg");
    Picture mirroredPic = new Picture("dillon.jpg");
    
    sepiaPic.sepia();
    posterizePic.posterize(4);
    mirroredPic.mirrorHorizontal();
    mirroredPic.mirrorVerticalRightToLeft();
    
    canvas.copy(originalPic,0,0);
    canvas.copy(sepiaPic,402,0);
    canvas.copy(posterizePic,0,413);
    canvas.copy(mirroredPic,402,413);
    
    canvas.explore();
    canvas.write("MyCollage.jpg");
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture picture = new Picture("images.jpg");
      picture.mirrorVerticalRightToLeft();
      picture.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture picture = new Picture("images.jpg");
      picture.mirrorHorizontal();
      picture.explore();
  }
  
  public static void testAlex()
  {
      Picture picture = new Picture("images.jpg");
      picture.mirrorHorizontal();
      picture.mirrorVerticalRightToLeft();
      picture.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testPosterize();
    //testSepia();
    //testAlex();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
  }
}