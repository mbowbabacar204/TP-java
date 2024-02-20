import java.security.cert.PKIXCertPathValidatorResult;

public class Pixel{
    public void  setRed(int r){
        if(r>=0 && r<=255){
            this.r=r;
            this.g=r;
            this.b=r;
        }
    }
    public void setGreen(int g){
        if(b>=0 && b<=255){
            this.r=g;
            this.g=g;
            this.b=g

        }
    }
    public void setBlue(int b){
        if(b>=0 && b<=255){
            this.r=b;
            this.g=b;
            this.b=b;
        }
    }
    public void setBlack(int b){
        if(b>=0 && b<=128){
            this.r=b;
            this.g=b;
            this.b=b;
        }
    }
    public void setwhite(int w){
        if(w>=0 && w<=128){
            this.r=w;
            this.g=w;
            this.b=w;
            his.t= new Pixel[h][w];
        }
    }
    public class ImageNB extends image{
        public ImageNB(int b,int w)
        super(b,w);
        for(int i=0;i<b;i++){
            for(int j=o;j<w;j++){
                this.t[i][j]=new PixelNB();
            }

        }
    }

}
