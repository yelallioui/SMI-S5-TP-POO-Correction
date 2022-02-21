/**
 * @author yelallioui
 *
 */
public class TestType
{
 public static void main (String [] Arg)
 {
  int ri,a= 4;
  float rf, b =  5.0f;
  double rd, c = 5;
  char rc, e = 'a';
  
  int result_int;
  float x = 2.0f, result_float;
  result_float = a/x;
  // result_int = a/x;
  int p = 23, r = 5;
  System.out.println(r+" fois "+p+" est egal a "+(r+p));

  System.out.println("Qui sème le vent, récolte la tempête");
  System.out.println("é è à ê ë ä ï â î ç ù");
  System.out.println("Qui s\u008ame le vent, r\u0082colte la temp\u0088te");
  System.out.print("Qui s\u00e8me le vent, ");
  System.out.print("r\u00e9colte la temp\u00eate");
  System.out.println(Integer.toString(45,8));
  System.out.println(Integer.toString(45,16));

  ri = a/2;
  System.out.println(a+ri);
  rf = b/2;
  rd = c/2;
  rc = ++e;
  rf = ri+rf+rc;
  ri = ri + (int) rf;
  System.out.println("entier : "+ri);
  System.out.println("float : "+rf);
  System.out.println("double : "+rd);
  System.out.println("char : "+rc);
  }
 }