class Rectangle extends Forme implements Dessinable{private double longueur,larg;//constructeur a definir
        public Rectangle(double lo,double la){
                this.longueur=lo;
                this.larg=la;
        }
        public double perimetre (){return 2*(longueur+larg);}
        @Override
        public void dessiner() {
                System.out.println("dessiner");
        }
}//fin de rectangle