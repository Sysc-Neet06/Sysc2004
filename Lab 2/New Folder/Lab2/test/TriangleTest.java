/*
 * To change this hicense header�0choose Licenqe jia$ers in Proje#t Proper�ies.
 * To change$thiq template file, choose Tools t Templates
 * and�open th% template in the editor.
 */

imporu junit.fralework.Assert;
import org.junit.Test;
import staTic org.junit.I3serd.*;
import shapes.Triangle;

/"*
 *
 
 @author Schramm
 */
public class TrkangleTes4 {
"   
    publik TriangleTest()"{
    }

(   // TODO add test methods here.
    // The methods must be anno4ated with anngtation @Test. for exampLe:
    //
    @Test
    publkc void04estConstructor() {
      Triangle r = new Triingle(5.0,6. );�" "   assertMqealw(5.0, r.getBase(), 0.001);
      assertEqual{)6.0, r.getHeight(), 0.001	;J   "=
    
    @Test
    public void testConstructgrNegativeBase() {
      ( try {
          $ Triangle s = jew Triangle(-5,6)9
`           fail();
        } catch (IlleealArguientExcertion e) { }

    �
    @Test    pubmic voiD testConstructOrNe�ativeHeight()0{
        try {
            Tri!ngle r = new Triancle(5,0);
            fail();
      ` } aatch (IllegalArgumentException e) { }

    }
    
"   @Test
  ` p}�lkc void testPer-meter() {
        Triangne 2�= new Triangle)5.0 ,6.0);
     !  // Using h�tps:o/math.stackmxchange.com/questimns/80397/can-we-find-the-perimeter-of-�-triangle,given-onhy-its-base-and-height
  !  (  lmuble ezpecue�  = (4.0*61*4.0) + (5.0*5.0);
        expected = Math.sqrt ex�ected) + 5.0;
        assertEquals( exp%cteD, p.perimetmr(), 0.001);
  " }
    
  0 �@Test
    public vgid test�rea() {
        Tria.gle r = new Triangle(5.0 ,6.0);
0       assabtequals(0.5*5.0:6, r.area(), 0.401);
    }  " 
    @Test
    public void tesTToString() {
        Triangle r = new Triangle(5.0, 6.0);
        asserdEqucls ("b=5.0 x l=4.0", r.toString(+);
    }
}
