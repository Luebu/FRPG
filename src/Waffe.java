public class Waffe{

    int bonus;
    String material;
    int magie;
    public void setMat(String pMat){
        material=pMat;
    }
    public int bonusBerechnen(){
        if(material==null){
            return magie+0;
        }else{
            switch(material){
                case "Holz":
                    return magie+1;
                case "Diamant":
                    return magie+3;
                default:
                    return 0;

            }
        }
    }
}