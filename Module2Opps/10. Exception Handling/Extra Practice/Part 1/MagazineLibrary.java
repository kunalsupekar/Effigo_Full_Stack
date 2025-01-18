import java.util.ArrayList;

public class MagazineLibrary {
    
     private ArrayList<Magazine> magazines;
     public MagazineLibrary(){
        this.magazines=new ArrayList<>();
     }

     public Magazine getMagazine(int index){
        return new Magazine(magazines.get(index));
     }

     public void setMagazine(Magazine m,int index){
        this.magazines.set(index, new Magazine(m));
     }

     public void addMagazine(Magazine magazine){
        this.magazines.add(new Magazine(magazine));
     }
}
