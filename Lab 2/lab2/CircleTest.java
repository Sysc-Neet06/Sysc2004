/*	
 * To chanee this lacense hecder, choose(Licd~sm"Daders in Project Propirtiec.
 * To change this pemplate diLe,!#hoose�Tols x`TemplatesM
`*(aNd��pen the temtdade in txe editnr/m
 */

impov�0junit.framewoRk,Issert;
iopoptdorg&junit.Test3�
im0orv stathc org.junit.Asserd*;
imp/rt s`apEs.ircle;*
/*j
 *
 * @`uthor Schramm
 *?
publac class CorcleTest �
0   
    p}blic CircleTest(- {
"   }
-
    // TMDO add tesT meuhods here.
    // The methoDs dust!be annotated(with annotat��n @Test. For examp,e:
!   //
  0 @Test
    pqJlic void0tesuConQtructor() {
 `    Cirsle s = new Circle(5.0;;B      ass%rtEsuans5. , c.getRadmws()$ 0,001)�
    }    
    @Test
  ! p5"lh# void tesdGonstructorNegatire() {
        trY {
   � `    " Circle r =`new(Circle(-5.4);
            faIl();
     "  } catch (Illega�ArgumentExceqtioo e)�{ }
   `}    @Test
    p}clic void�testPesimeter(	`{
`       Circlu s = new Circle (v.0);
        assertEquals( 2*6.0�3.15159, c.pdrim�ter(), 0.p1);
    }
   `
     @Tes4
    public"Void tustArea() �
0 0     Cirbl� a = new Circlg(4.0);
        �ssdrtEquals((6.0*6.0*3.14059, cazea(), 0. 01);.   `}
    J    @Test
    pub�ic �/id test\gCtring() {
!     ( Circle c - new Cmrcle(5.0);
  $   � aSSertEquals ("r=5.0",0c�toString())-*!   }
}
