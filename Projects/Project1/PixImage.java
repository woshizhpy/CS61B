/* PixImage.java */

/**
 *  The PixImage class represents an image, which is a rectangular grid of
 *  color pixels.  Each pixel has red, green, and blue intensities in the range
 *  0...255.  Descriptions of the methods you must implement appear below.
 *  They include a constructor of the form
 *
 *      public PixImage(int width, int height);
 *
 *  that creates a black (zero intensity) image of the specified width and
 *  height.  Pixels are numbered in the range (0...width - 1, 0...height - 1).
 *
 *  All methods in this class must be implemented to complete Part I.
 *  See the README file accompanying this project for additional details.
 */
import java.lang.*;


public class PixImage {

  /**
   *  Define any variables associated with a PixImage object here.  These
   *  variables MUST be private.
   */
   private int width;
   private int height;
   private final int total=3; 
   //private fianl int red=0,green=1,blue=2;

   private short[][][] Pixel_Value;
   // Pixel_Value[x][y][0] Red; [1] Green; [2] Blue



  /**
   * PixImage() constructs an empty PixImage with a specified width and height.
   * Every pixel has red, green, and blue intensities of zero (solid black).
   *
   * @param width the width of the image.
   * @param height the height of the image.
   */
  public PixImage(int width, int height) {
    // Your solution here.
	this.width=width;
	this.height=height;
	Pixel_Value= new short[width][height][total];
  }
  /* public PixImage(PixImage img)
  {
	  width=img.width;
	  height=img.height;
	  for(int x=0;x<width;x++)
	  {
		  for(int y=0;y<height;y++)
		  {
			  Pixel_Value[x][y][0]=img.Pixel_Value[x][y][0];
			  Pixel_Value[x][y][0]=img.Pixel_Value[x][y][1];
			  Pixel_Value[x][y][0]=img.Pixel_Value[x][y][2];
		  }
	  }
  }  */ 
  public PixImage()
  {
	  width=0;
	  height=0;
  }

  /**
   * getWidth() returns the width of the image.
   *
   * @return the width of the image.
   */
  public int getWidth() {
    // Replace the following line with your solution.
	return width;
  }

  /**
   * getHeight() returns the height of the image.
   *
   * @return the height of the image.
   */
  public int getHeight() {
    // Replace the following line with your solution.
   //return 1;
   return height;
  }

  /**
   * getRed() returns the red intensity of the pixel at coordinate (x, y).
   *
   * @param x the x-coordinate of the pixel.
   * @param y the y-coordinate of the pixel.
   * @return the red intensity of the pixel at coordinate (x, y).
   */
  public short getRed(int x, int y) {
    // Replace the following line with your solution.
    //return 0;
	return Pixel_Value[x][y][0];
  }

  /**
   * getGreen() returns the green intensity of the pixel at coordinate (x, y).
   *
   * @param x the x-coordinate of the pixel.
   * @param y the y-coordinate of the pixel.
   * @return the green intensity of the pixel at coordinate (x, y).
   */
  public short getGreen(int x, int y) {
    // Replace the following line with your solution.
    //return 0;
	return Pixel_Value[x][y][1];
  }

  /**
   * getBlue() returns the blue intensity of the pixel at coordinate (x, y).
   *
   * @param x the x-coordinate of the pixel.
   * @param y the y-coordinate of the pixel.
   * @return the blue intensity of the pixel at coordinate (x, y).
   */
  public short getBlue(int x, int y) {
    // Replace the following line with your solution.
    //return 0;
	return Pixel_Value[x][y][2];
  }

  /**
   * setPixel() sets the pixel at coordinate (x, y) to specified red, green,
   * and blue intensities.
   *
   * If any of the three color intensities is NOT in the range 0...255, then
   * this method does NOT change any of the pixel intensities.
   *
   * @param x the x-coordinate of the pixel.
   * @param y the y-coordinate of the pixel.
   * @param red the new red intensity for the pixel at coordinate (x, y).
   * @param green the new green intensity for the pixel at coordinate (x, y).
   * @param blue the new blue intensity for the pixel at coordinate (x, y).
   */
  public void setPixel(int x, int y, short red, short green, short blue) {
    // Your solution here.
	//System.out.println(x+" "+y);
	Pixel_Value[x][y][0]=red;
	Pixel_Value[x][y][1]=green;
	Pixel_Value[x][y][2]=blue;
	//System.out.println(x+" "+y+" "+Pixel_Value[x][y][0]+" "+Pixel_Value[x][y][1]+" "+Pixel_Value[x][y][2]);
  }

  /**
   * toString() returns a String representation of this PixImage.
   *
   * This method isn't required, but it should be very useful to you when
   * you're debugging your code.  It's up to you how you represent a PixImage
   * as a String.
   *
   * @return a String representation of this PixImage.
   */
  public String toString() {
    // Replace the following line with your solution.
	//String s=new String("Now show the PixelImage:\r\n");
	String s=new String();
	s+=ColortoString(0);
	//s+="Green_Value:\r\n"+ColortoString(1);
	//s+="Blue_Value:\r\n"+ColortoString(2);
    return s;
  }
  public String ColortoString(int color)
  {
	  String s=new String("\r\n-----");
	  for(int k=0;k<this.height;k++)
	  {
		  s+="----";
	  }
	  s+="\r\n";
	  for(int j=0;j<this.height;j++)
	  {
		  for(int i=0;i<this.width;i++)
		  {
			  //System.out.println("x="+i+" j="+j);
			  s+="| "+Short.toString(this.Pixel_Value[i][j][color]);
			  
		  }
		  s+="|\r\n";
	  }
	  s+="-----";
	  for(int k=0;k<this.height;k++)
	  {
		  s+="----";
	  }
	  s+="\r\n";
	  return s;
  }
  public String MatrixtoString(int color,short[][][] Pixel_Value1)
  {
	  String s=new String("\r\n-----");
	  int Mwidth=Pixel_Value1.length;
	  int Mheight=Pixel_Value1[0].length;
	  for(int k=0;k<Mheight;k++)
	  {
		  s+="----";
	  }
	  s+="\r\n";
	  for(int j=0;j<Mheight;j++)
	  {
		  for(int i=0;i<Mwidth;i++)
		  {
			  s+="| "+Short.toString(Pixel_Value1[i][j][color]);
			  
		  }
		  s+="|\r\n";
	  }
	  s+="-----";
	  for(int k=0;k<Mheight;k++)
	  {
		  s+="----";
	  }
	  s+="\r\n";
	  return s;
  }

  /**
   * boxBlur() returns a blurred version of "this" PixImage.
   *
   * If numIterations == 1, each pixel in the output PixImage is assigned
   * a value equal to the average of its neighboring pixels in "this" PixImage,
   * INCLUDING the pixel itself.
   *
   * A pixel not on the image boundary has nine neighbors--the pixel itself and
   * the eight pixels surrounding it.  A pixel on the boundary has six
   * neighbors if it is not a corner pixel; only four neighbors if it is
   * a corner pixel.  The average of the neighbors is the sum of all the
   * neighbor pixel values (including the pixel itself) divided by the number
   * of neighbors, with non-integer quotients rounded toward zero (as Java does
   * naturally when you divide two integers).
   *
   * Each color (red, green, blue) is blurred separately.  The red input should
   * have NO effect on the green or blue outputs, etc.
   *
   * The parameter numIterations specifies a number of repeated iterations of
   * box blurring to perform.  If numIterations is zero or negative, "this"
   * PixImage is returned (not a copy).  If numIterations is positive, the
   * return value is a newly constructed PixImage.
   *
   * IMPORTANT:  DO NOT CHANGE "this" PixImage!!!  All blurring/changes should
   * appear in the new, output PixImage only.
   *
   * @param numIterations the number of iterations of box blurring.
   * @return a blurred version of "this" PixImage.
   */
   public int[] GetPixelType (int x,int y) {
	   int[] PixelType=new int[3];
	   // Identify corner or side
	  //System.out.println("This is in GetPixelType,x="+x+",y="+y);
		if(x==0)// left corner
		{
			if(y==0)
			{	
				PixelType[0]=4;
				PixelType[1]=0;// x start coordinate
				PixelType[2]=0;// y start coordinate
				return PixelType; 
			}
			else if(y==height-1)
			{
				PixelType[0]=4;
				PixelType[1]=0;// x start coordinate
				PixelType[2]=-1;// y start coordinate
				return PixelType;
			}
			else //left side
			{
				PixelType[0]=6;
				PixelType[1]=1;// left so y has a range of 3
				PixelType[2]=0;// x start coordinate
				return PixelType;
			}
		}
		else if(x==width-1)
		{
			if(y==0)
			{
				PixelType[0]=4;
				PixelType[1]=-1;// x start coordinate
				PixelType[2]=0;// y start coordinate
				return PixelType;
			}
			else if(y==height-1)
			{
				PixelType[0]=4;
				PixelType[1]=-1;// x start coordinate
				PixelType[2]=-1;// y start coordinate
				return PixelType;
			}
			else //left side
			{
				PixelType[0]=6;
				PixelType[1]=1;// right so y has a range of 3
				PixelType[2]=-1;// x start coordinate
				return PixelType;
			}
		}
		else if(y==0)
		{
			PixelType[0]=6;
			PixelType[1]=2;// up so x has a range of 3
			PixelType[2]=0;// y start coordinate
			return PixelType;
		}
		else if(y==height-1)
		{
			PixelType[0]=6;
			PixelType[1]=2;// down so x has a range of 3
			PixelType[2]=-1;// y start coordinate
			return PixelType;
		}
		else
		{
			PixelType[0]=9; //normal cases
			PixelType[1]=0;
			PixelType[2]=0;
			return PixelType;
		}
				
	   
	   
	   //return PixelType;
   }
   public short PixelNebr_Avg(int x,int y,int color) //color:0 for red;1 for green;2 for blue
   {
	 int sum=0;
	 int i,j;
	 //System.out.println("This is in PixelNebrAvg,x="+x+",y="+y);
	 int[] PixelType=GetPixelType(x,y);
	 //System.out.print("After Gettype,x="+x+" y="+y+" Typeis"+PixelType[0]+" "+PixelType[1]+" "+PixelType[2]);
	 
	 switch(PixelType[0])
	 {
		case 4: //at corners
			//sum=(short)(Pixel_Value[x][y][color]+Pixel_Value[x+1][y][color]+Pixel_Value[x][y+1][color]+Pixel_Value[x+1][y+1][color]);
			for(i=x+PixelType[1];i<x+PixelType[1]+2;i++) {
				for(j=y+PixelType[2];j<y+PixelType[2]+2;j++)
				{
					sum+=Pixel_Value[i][j][color];
				}
			}
			break;
		
		case 6://at sides Pixel_Type[1]=1 :left or right,Pixel_Type=2: up or down; Pixel_Type[2] is the start of coordinate with a range of 2
			if(PixelType[1]==1)
			{
				for(i=x+PixelType[2];i<x+PixelType[2]+2;i++)
				{
					for(j=y-1;j<y+2;j++)
					{
						sum+=Pixel_Value[i][j][color];
					}
				}
			}
			else if(PixelType[1]==2)
			{
				for(i=x-1;i<x+2;i++)
				{
					for(j=y+PixelType[2];j<y+PixelType[2]+2;j++)
					{
						sum+=Pixel_Value[i][j][color];
					}
				}
			}
			else
			{
				System.out.println("Pixel Type Error! It's not a side Pixel!");
			}
			break;
			
		case 9:
			for(i=x-1;i<x+2;i++)
			{
				for(j=y-1;j<y+2;j++)
				{
					sum+=Pixel_Value[i][j][color];
				}
			}
		    break;
		default:
			System.out.println("Pixel Type Error!");
			break;
	 }
	 short Avg=(short)(sum/PixelType[0]);
	 return Avg;
		
   }
  public PixImage boxBlur(int numIterations) {
    // Replace the following line with your solution.
    //return this;
	PixImage BlurImg=BlurforOnce();
	for(int k=1;k<numIterations;k++)
	{
		BlurImg=BlurImg.BlurforOnce();
	}
	return BlurImg;
	 
  }
  public PixImage BlurforOnce()
  {
	  PixImage BlurImg=new PixImage(this.width,this.height);
	 // boxBlur for red 
	 int i,j;
	 
		 for(i=0;i<BlurImg.width;i++) {
			 for(j=0;j<BlurImg.height;j++) {
				 
				BlurImg.Pixel_Value[i][j][0]=PixelNebr_Avg(i,j,0);
				BlurImg.Pixel_Value[i][j][1]=PixelNebr_Avg(i,j,1);
				BlurImg.Pixel_Value[i][j][2]=PixelNebr_Avg(i,j,2);
			 }
		 }
    return BlurImg;	 
  }

  /**
   * mag2gray() maps an energy (squared vector magnitude) in the range
   * 0...24,969,600 to a grayscale intensity in the range 0...255.  The map
   * is logarithmic, but shifted so that values of 5,080 and below map to zero.
   *
   * DO NOT CHANGE THIS METHOD.  If you do, you will not be able to get the
   * correct images and pass the autograder.
   *
   * @param mag the energy (squared vector magnitude) of the pixel whose
   * intensity we want to compute.
   * @return the intensity of the output pixel.
   */
  private static short mag2gray(long mag) {
    short intensity = (short) (30.0 * Math.log(1.0 + (double) mag) - 256.0);

    // Make sure the returned intensity is in the range 0...255, regardless of
    // the input value.
    if (intensity < 0) {
      intensity = 0;
    } else if (intensity > 255) {
      intensity = 255;
    }
    return intensity;
  }

  /**
   * sobelEdges() applies the Sobel operator, identifying edges in "this"
   * image.  The Sobel operator computes a magnitude that represents how
   * strong the edge is.  We compute separate gradients for the red, blue, and
   * green components at each pixel, then sum the squares of the three
   * gradients at each pixel.  We convert the squared magnitude at each pixel
   * into a grayscale pixel intensity in the range 0...255 with the logarithmic
   * mapping encoded in mag2gray().  The output is a grayscale PixImage whose
   * pixel intensities reflect the strength of the edges.
   *
   * See http://en.wikipedia.org/wiki/Sobel_operator#Formulation for details.
   *
   * @return a grayscale PixImage representing the edges of the input image.
   * Whiter pixels represent stronger edges.
   */
  public short[][][] extend_Pixel()
  {
	 
	short[][][] Larger_Matrix=new short [width+2][height+2][total];
	  for(int x=1;x<width+1;x++)
	  {
		  for(int y=1;y<height+1;y++)
		  {    System.out.println("x="+x+" y="+y+"height+1="+(height+1));
			   Larger_Matrix[x][y][0]=Pixel_Value[x-1][y-1][0];
			   Larger_Matrix[x][y][1]=Pixel_Value[x-1][y-1][1];
			   Larger_Matrix[x][y][2]=Pixel_Value[x-1][y-1][2];
		  }
	  }
	  for(int i=0;i<3;i++)
	  {
			Larger_Matrix[0][0][i]=Pixel_Value[0][0][i];
			Larger_Matrix[0][height+1][i]=Pixel_Value[0][height-1][i];
			Larger_Matrix[width+1][0][i]=Pixel_Value[width-1][0][i];
			Larger_Matrix[width+1][height+1][i]=Pixel_Value[width-1][height-1][i];
	  }
	  for(int x=1;x<width+1;x++)
	  {
		  for(int i=0;i<3;i++) {
			  Larger_Matrix[x][0][i]=Larger_Matrix[x][1][i];
			  Larger_Matrix[x][height+1][i]=Larger_Matrix[x][height][i];
			  
		  }
		   
	  }
	  for(int y=1;y<height+1;y++)
	  {
		  for(int i=0;i<3;i++) {
			  Larger_Matrix[0][y][i]=Larger_Matrix[1][y][i];
			  Larger_Matrix[width+1][y][i]=Larger_Matrix[width][y][i];
			  //Larger_Matrix[width][y][i]=Pixel_Value[width-1][y-1][i];
			  
		  }   
	  }  
	  //System.out.print(MatrixtoString(0,Larger_Matrix));
	  //System.out.print("return!");
	  return Larger_Matrix;
  }
  public PixImage sobelEdges() {
    // Replace the following line with your solution.
	PixImage SolbelImg=new PixImage(this.width,this.height);
	//short[][][] Larger_Matrix=extend_Pixel();
	short[][][] Larger_Matrix=new short [width+2][height+2][total];
	  for(int x=1;x<this.width+1;x++)
	  {
		  for(int y=1;y<this.height+1;y++)
		  {    //System.out.println("x="+x+" y="+y+"height+1="+(height+1));
			   Larger_Matrix[x][y][0]=Pixel_Value[x-1][y-1][0];
			   Larger_Matrix[x][y][1]=Pixel_Value[x-1][y-1][1];
			   Larger_Matrix[x][y][2]=Pixel_Value[x-1][y-1][2];
		  }
	  }
	  for(int i=0;i<3;i++)
	  {
			Larger_Matrix[0][0][i]=Pixel_Value[0][0][i];
			Larger_Matrix[0][this.height+1][i]=Pixel_Value[0][this.height-1][i];
			Larger_Matrix[this.width+1][0][i]=Pixel_Value[this.width-1][0][i];
			Larger_Matrix[this.width+1][this.height+1][i]=Pixel_Value[this.width-1][this.height-1][i];
	  }
	  for(int x=1;x<this.width+1;x++)
	  {
		  for(int i=0;i<3;i++) {
			  Larger_Matrix[x][0][i]=Larger_Matrix[x][1][i];
			  Larger_Matrix[x][this.height+1][i]=Larger_Matrix[x][this.height][i];
			  
		  }
		   
	  }
	  for(int y=1;y<this.height+1;y++)
	  {
		  for(int i=0;i<3;i++) {
			  Larger_Matrix[0][y][i]=Larger_Matrix[1][y][i];
			  Larger_Matrix[this.width+1][y][i]=Larger_Matrix[this.width][y][i];
			  //Larger_Matrix[width][y][i]=Pixel_Value[width-1][y-1][i];
			  
		  }   
	  }  
	
	  //System.out.print(MatrixtoString(0,Larger_Matrix));
	 for(int x=0;x<SolbelImg.width;x++)
	{
		for(int y=0;y<SolbelImg.height;y++)
		{
			SolbelImg.Pixel_Value[x][y][0]=this.Pixel_edgeSobel(x,y,Larger_Matrix);
			SolbelImg.Pixel_Value[x][y][1]=this.Pixel_edgeSobel(x,y,Larger_Matrix);
			SolbelImg.Pixel_Value[x][y][2]=this.Pixel_edgeSobel(x,y,Larger_Matrix);
			
		}
	}
	  
    return SolbelImg; 
	//return this;
    // Don't forget to use the method mag2gray() above to convert energies to
    // pixel intensities.
  }
  
  public short[][] Getg(int x,int y,short[][][] LargerMatrix)
  {
	  short[][] g={{0,0},{0,0},{0,0}};
	  short[][] fliter_x={{1,2,1},{0,0,0},{-1,-2,-1}};
	  short[][] fliter_y={{1,0,-1},{2,0,-2},{1,0,-1}};
	  for(int i=0;i<fliter_x.length;i++)
	  {
		  for(int j=0;j<fliter_x[0].length;j++)
		  {
			  for(int k=0;k<3;k++)
			  {
				g[k][0]+=fliter_x[i][j]*LargerMatrix[x+i][y+j][k];  //g[0] for red; g[*][0] for x;  
			  }
			
		  }
	  }
	  for(int i=0;i<fliter_y.length;i++)
	  {
		  for(int j=0;j<fliter_y[0].length;j++)
		  {
			for(int k=0;k<3;k++)
			{
				g[k][1]+=fliter_y[i][j]*LargerMatrix[x+i][y+j][k];
			}				
		  }
	  }
	  //g[0]=(short)(LargerMatrix[x][y][color]-LargerMatrix[x+2][y][color]+2*LargerMatrix[x][y+1][color]-2*LargerMatrix[x+2][y+1][color]+LargerMatrix[x][y+2][color]-LargerMatrix[x+2][y+2][color]);
	  return g;
  }
  public short Pixel_edgeSobel(int x,int y,short[][][]LargerMatrix)
  {
	  long energy=(long)0;
	  short[][] g=Getg(x,y,LargerMatrix);
	  for(int i=0;i<3;i++)
	  {
		  for(int j=0;j<2;j++)
		  {
			  energy+=(long)(g[i][j]*g[i][j]);
		  }
	  }
	  
	  return mag2gray(energy);
  }


  /**
   * TEST CODE:  YOU DO NOT NEED TO FILL IN ANY METHODS BELOW THIS POINT.
   * You are welcome to add tests, though.  Methods below this point will not
   * be tested.  This is not the autograder, which will be provided separately.
   */


  /**
   * doTest() checks whether the condition is true and prints the given error
   * message if it is not.
   *
   * @param b the condition to check.
   * @param msg the error message to print if the condition is false.
   */
  private static void doTest(boolean b, String msg) {
    if (b) {
      System.out.println("Good.");
    } else {
      System.err.println(msg);
    }
  }

  /**
   * array2PixImage() converts a 2D array of grayscale intensities to
   * a grayscale PixImage.
   *
   * @param pixels a 2D array of grayscale intensities in the range 0...255.
   * @return a new PixImage whose red, green, and blue values are equal to
   * the input grayscale intensities.
   */
  private static PixImage array2PixImage(int[][] pixels) {
    int width = pixels.length;
    int height = pixels[0].length;
    PixImage image = new PixImage(width, height);

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        image.setPixel(x, y, (short) pixels[x][y], (short) pixels[x][y],
                       (short) pixels[x][y]);
      }
    }

    return image;
  }

  /**
   * equals() checks whether two images are the same, i.e. have the same
   * dimensions and pixels.
   *
   * @param image a PixImage to compare with "this" PixImage.
   * @return true if the specified PixImage is identical to "this" PixImage.
   */
  public boolean equals(PixImage image) {
    int width = getWidth();
    int height = getHeight();

    if (image == null ||
        width != image.getWidth() || height != image.getHeight()) {
      return false;
    }

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        if (! (getRed(x, y) == image.getRed(x, y) &&
               getGreen(x, y) == image.getGreen(x, y) &&
               getBlue(x, y) == image.getBlue(x, y))) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * main() runs a series of tests to ensure that the convolutions (box blur
   * and Sobel) are correct.
   */
   public static void Matrixshow(short[][] filter_x)
   {
		int width=filter_x.length;
		int height=filter_x[0].length;
		String s1="\r\n----------------------------------------------"+"\r\n";
		for(int x=0;x<height;x++)
		{
			for(int y=0;y<width;y++)
			{
				s1+="|"+Short.toString(filter_x[y][x]);
			}
			s1+="\r\n";
		}
		System.out.print(s1);
   }
  public static void main(String[] args) {
	  String s="I love you"+"\r\n"+"But I love other people as well\r\n";
	  System.out.print(s);
    // Be forwarned that when you write arrays directly in Java as below,
    // each "row" of text is a column of your image--the numbers get
    // transposed.
	
    PixImage image1 = array2PixImage(new int[][] { { 0, 10, 240 },
                                                   { 30, 120, 250 },
                                                   { 80, 250, 255 } });
    System.out.println("Testing getWidth/getHeight on a 3x3 image.  " +
                       "Input image:");
    System.out.print(image1);
    doTest(image1.getWidth() == 3 && image1.getHeight() == 3,"Incorrect image width and height.");

     System.out.println("Testing blurring on a 3x3 image.");
	 
    doTest(image1.boxBlur(1).equals(
           array2PixImage(new int[][] { { 40, 108, 155 },
                                        { 81, 137, 187 },
                                        { 120, 164, 218 } })),
           "Incorrect box blur (1 rep):\n" + image1.boxBlur(1));
	//doTest(image1.boxBlur(1).equals(
    //       image2),"Notequal" + image1.boxBlur(1));
    //System.out.println("#################################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");		   
    doTest(image1.boxBlur(2).equals(
           array2PixImage(new int[][] { { 91, 118, 146 },
                                        { 108, 134, 161 },
                                        { 125, 151, 176 } })),
           "Incorrect box blur (2 rep):\n" + image1.boxBlur(2));
    doTest(image1.boxBlur(2).equals(image1.boxBlur(1).boxBlur(1)),
           "Incorrect box blur (1 rep + 1 rep):\n" +
           image1.boxBlur(2) + image1.boxBlur(1).boxBlur(1));

    System.out.println("Testing edge detection on a 3x3 image.");
	System.out.print(image1);
	System.out.print(image1.sobelEdges());
	//int a=0;
	//short b=1;
	//a=b;
	//short[][] filter_x={{1,2,1},{0,0,0},{-1,-2,-1}};
	
	
	  //System.out.print();
	
	
      doTest(image1.sobelEdges().equals(
           array2PixImage(new int[][] { { 104, 189, 180 },
                                        { 160, 193, 157 },
                                        { 166, 178, 96 } })),
           "Incorrect Sobel:\n" + image1.sobelEdges()); 


    PixImage image2 = array2PixImage(new int[][] { { 0, 100, 100 },
                                                   { 0, 0, 100 } });
    System.out.println("Testing getWidth/getHeight on a 2x3 image.  " +
                       "Input image:");
    System.out.print(image2);
    doTest(image2.getWidth() == 2 && image2.getHeight() == 3,
           "Incorrect image width and height.");

    System.out.println("Testing blurring on a 2x3 image.");
    doTest(image2.boxBlur(1).equals(
           array2PixImage(new int[][] { { 25, 50, 75 },
                                        { 25, 50, 75 } })),
           "Incorrect box blur (1 rep):\n" + image2.boxBlur(1));

    System.out.println("Testing edge detection on a 2x3 image.");
    doTest(image2.sobelEdges().equals(
           array2PixImage(new int[][] { { 122, 143, 74 },
                                        { 74, 143, 122 } })),
           "Incorrect Sobel:\n" + image2.sobelEdges());
  } 
}