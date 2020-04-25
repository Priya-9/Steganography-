package steganopgraphy;

public class Steganopgraphy
{
  public static void main(String[] args)
  {
    try
    {
      //Embed emb = new Embed("c:\\java\\DB.zip", "c:\\java\\Koala.jpg");
      Embed emb = new Embed("G:\\priya\\steganopgraphy\\edit.txt", "G:\\priya\\steganopgraphy\\imag.png", "tiger");
      emb.embedFileInImage("G:\\priya\\steganopgraphy\\templ1.png");

      Extract extr = new Extract("G:\\priya\\steganopgraphy\\templ1.png", "tiger");
      String trgt = extr.getFileFromImage();
      System.out.println("File extracted as : " + trgt);
    }
    catch(Exception ex)
    {
      System.out.println("Err: " +ex);
      ex.printStackTrace();
    }
  }
}
