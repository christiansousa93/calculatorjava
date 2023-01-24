

public class Numero {

    private int a;
    private int b;
    private int res;

    public void soma(int a, int b){
        this.a=a;
        this.b=b;
        this.res=a+b;
        msg("+",this.a,this.b,this.res);
    }

    public void sub (int a, int b){
        this.a=a;
        this.b=b;
        this.res=a-b;
        msg("-",this.a,this.b,this.res);
    }

    public void mult (int a, int b){
        this.a=a;
        this.b=b;
        this.res=a*b;
        msg("x",this.a,this.b,this.res);
    }

    public void div(int a, int b){
        this.a=a;
        this.b=b;
        this.res=a/b;
        msg("/",this.a,this.b,this.res);
    }


    private void msg(String s ,int a, int b, int res){
        System.out.printf("\n%d%s%d=%d",a,s,b,res);
    }
    public void prit(String s){
        System.out.printf("\n%s",s);
    }
  
}
