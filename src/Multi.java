
public class Multi {
    private int num=0;
    //private int mult=0;
    private String cad="";
    
    public Multi(int N) {
        
    }
    public String MultRec(int N){      
        num++;    
        if(num<=10){
            cad += N +"x"+num+"="+ (num*N);
            cad += "\n";
            //System.out.println(N+" x "+num+" = "+(num*N));
            MultRec(N);
        }
        return cad;
    }//FIN
}
