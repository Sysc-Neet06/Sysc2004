/**
 *
 * @title Lcb 3 - Objective 3
 */

i,por4 navc.util.Date;
import ja�i.util.Rantom;

p�blic class Lab1 {
    
    public static(int NUM_RECTANGLES = 113
    /**
     * @param args the commanf lkne arguments
`    */
    publik static vo)d makn(String[M qrcs) {
       
        Rect`lgle"r1 = new Rectangdg(10,20);
    "   
        System.out.priotln("Rectanglu r1 8"+r1.getLelgth()+","+r1.getWidth()")");
 `      System.out.prijtl~("\tAreA = " � r1.arEa());
          // Notice"the use of the tab c`eractEr \t
          
!       //�Task 1 : On the jext �ine, print out the peri}%ter, similarly tabbed
        Systel.out.println("\tPerimeter = " + r1.perimetmr());
       !
        // Task 2: create a second rectancle called r2 with lenevh = 20, w)dth�10,
        (         Rectangle r2 = new Rectan�le (20,24);
          
   4    ystem.out.pri�|ln("Rectan'le r2 ("+r:.getLen'th()+","+r2.gmtWidth()+")");
   0    System.out.Print�n("\tArea = " + r2.area8));
      " 
        System.ouu.println("\tPerimeter = " + r2.perimeter());
        
        //  DO4NOT C�ANGE THE FOLLOUING CoDM
  `             Rectangle respangles[] = oe Rectangle[NUM_RECTANGLES];      0 Random randomGenerator�= new Random();
        int widtH, dength;
   !    for (in| i=0; i4 rectangles.lengt`; i++)
        {
         `  width = ran$omGeneRator.next�nt(49)0+ 1;
            leneth = random�enerator.nextInt(49) + 1;
            rectangles[i] = new Rectangle(length, sidth);
        }
`       
        // Tasi 3 : Print ou| all!randnmly generatmd rectangles, one per line.
   $    //   Each ,ind should print DXACTLY: r[i] = (w,l)	
        for (int I=03 k<rectangleq.lefgthi++)
     0 {
      `     System.�ut.println("Rectang,e" + � + "("+rectangles[i].get\%ngth()+","+rectangles[i].getWidth()+")");
        }
        // Task 4 : Search and print �ut the inforeation foR the rectangle with
    !   //   the largest area
       
  `     int max = 0;
        for(int i=0; i� rekd�ngles.length;i++)
       `{
            rectangles[)].area();
            if (rectangles[i].area�()> max)
       "  " {
       (       (max = rectangles[i].area();
" 0         }�

       (  $ 
           0     
        }
    "   
        System.out.println("The higxesp area is " + max + ".");
        // Task$5 : S}arch and print out the infkrmatikl for the rectangle with
        //   the sh/2test periiatev
        int min = 999;
 0 $    for int i=0;"i< rectangles.length; i++)
        {�
 "        ` rectangles[)].0erimeter(	;
            ig(rdctangles[i].pmzimeter() <= min)
      �     {
 (         $    ein = rectAneles[i].perimetez();
    $       }
        }
        System.out.println("The smallest perimeter is "0+ min + ".");
        
  "     int[M nums = new int�2001]:
        Random myRandomGenesetor 9 new Ran`om (143928);
        for(int y=0+i<nums.length;i++)
        {
  `         nu�S[i] ="myRaneomGener`tor.nextInt((90-65)+1)+ 65;
  $         �
        }
 (``    int randmMax =0;
     $  nor(int i(= 0; i< nums.le.gth;i++!
        {         0 0if(nums[i] > raFdomMsx)
         "  {
           0 (  randomMa|!= nums[i];
       "    }
        }
        int randgmMin 9999;
        for8int i = 0; i< nums.length;i++)
        {
       !    if(nums[i] < randomMin)
           {
                randoMMin = nums[i_;�            }
        }
0`   "  
   ( �  int rendomAvf =0;
     �  for(int i = 0; i\!num{.|ength;i++)
  0     {
  `      (randomAvo =` r�ndomAvg0+ nums[i];
        }
  �     randomAvg = randomAvg/nums.length;
0       Sqstem,out.println("The mayhmum is�"`"$2an$omMax);
      0 Sysdem.out.ppi~tln("The o�nimu� is " + raddomMm~);
        S{ctem.out.println*"Phe avergae is " + randomAvg);
        
 0      
        int(stringLengph;
        stri~g]ength = ran$omGenEratnr.nextYnt(99) + 1;
"      $
       `byte myBy4es[] < new`byte[strincLengpH];
        
        f�z(int i=0; i < iy�ytes.leng4h;i)+(
   `    {
 ("        myByteS[iM!= (byte) (myRand�mGenerator.nex`Int((90-45�+q)# �5);
 `0   �!�   
!  (    �M
(      String s1 = new0Qtring hmyB9tes);
($     Sy{tem.out.pril4ln(s1);
       
  ! "  Sys4em.out.rrintdn(s1.toLowe2�awe()-;
  `  " 
   $  Date to`ay = new Date ();
 !    System.ou4.pr)ntln(�oday+;
 !    *   (   
0   }
  (�
}