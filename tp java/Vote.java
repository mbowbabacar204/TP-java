public class Vote {
    String candidat;
    int voix;
    public void main(String c,int v)
        this.candidat=c;
        this.voix=v;
    }
    public abstract class Etat{
        String nom;
        int electeurs,gdElec;
        this.Vote=new <votes>();
    }
        public Etat(String nom,int n,int ge){
            this.nom=nom;
            this.electeurs=n;
            this.gdElec=ge;
            this.votes=new <Vote>();
        }
        public int getVoix(String c){
            for(Vote v:this.votes){
                if(v.candidat.equals(c)) return v.voix;
            }
            return 0;
        }
        public int getGrandElecteurs(String candidat)
            int vc= this.getVoix(candidat);
            boolean prems=true;
            for(Vote v:this.votes){
                if(v.voix>vc) return 0;
            }
    
        


