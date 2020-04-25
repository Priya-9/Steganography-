package steganopgraphy;

class Crypto 
{
  private char password[];
  private int indx;
  
  Crypto(String pass)
  {
    password = pass.toCharArray();
    indx = 0;
  }

  int encode(int val)
  {
    val = val ^ password[indx];
    indx = (indx+1) % password.length;
    return val;
  }
  
  int decode(int val)
  {
    val = val ^ password[indx];
    indx = (indx+1) % password.length;
    return val;
  }
}
