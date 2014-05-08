public class ParzTivGumar {
    public long scan(long begin,long end) {
<<<<<<< HEAD
        long divisor = 0;
        long count = 0;
        long gumar = 0;
        label: for(long i=begin ; i<=end; i++) {
                   for(long j=1 ; j<=i ; j++) {
                       if (i % j==0)
                           divisor++;
                         if (divisor>2) {
                             divisor=0;
                             continue label;
                         }
                   }
                   if (divisor==2) {
                       System.out.print(i+", ");
                       gumar = gumar + i;
                       count++;
                   }
                   divisor=0;
=======
        long bajanich = 0;
        long gumar = 0;
        for(long i=begin ; i<=end; i++) {
                   for(long j=1 ; j<=i ; j++) {
                       if (i % j==0)
                           bajanich++;
                         if (bajanich>2) {
                             bajanich=0;
                         }
                   }
                   if (bajanich==2) {
                       System.out.print(i+", ");
                       gumar = gumar + i;
                   }
                   bajanich=0;
>>>>>>> 63b8ff895e6c69e70dd6f1e3c1562a76c7a51aea
         }
             return gumar;
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        long start,finish,count,gumar;
        start = System.currentTimeMillis();
        Prime A = new Prime();
        count = A.scan(1,100);
        gumar = A.scan(1,100);
        finish = System.currentTimeMillis();
        System.out.print("Time = "+(finish-start)+" gumar = "+gumar);
=======
        long gumar;
        ParzTivGumar A = new ParzTivGumar();
        gumar = A.scan(1,20);
        System.out.print(" gumar="+gumar+" ");
>>>>>>> 63b8ff895e6c69e70dd6f1e3c1562a76c7a51aea
    }
}
