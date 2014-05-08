public class Prime {
    public long scan(long begin,long end) {
        long divisor = 0;
        long count = 0;
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
                       count++;
                   }
                   divisor=0;
         }
             return count;
    }
    public static void main(String[] args) {
        long start, finish,count;
        start = System.currentTimeMillis();
        Prime A = new Prime();
        count = A.scan(1.12233);
        finish = System.currentTimeMillis();
        System.out.print("Time = "+(finish-start)+" count = "+count);
    }
}
