public class TestForme{
  public static void main(String[] arg){
        /* dans le main d'une clas de tes*/
      Forme[]forme={new circle(3),new Rectangle(4,8),new circle(3)};
      double somme_des_perimetres=0;
        for(int i=0;i<forme.length;i++){
        somme_des_perimetres +=forme[i].perimetre();
        System.out.println(somme_des_perimetres);
        }
    }
}