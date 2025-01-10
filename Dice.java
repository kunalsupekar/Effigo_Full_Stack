public class Dice {
    public static void main(String[] args) {
        
        try{
           
        for(int i=0;i<20;i++){
            Thread.sleep(500);
            System.out.println(dice());
        }     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       

    }

    public static int dice(){
        double n=Math.random()*6;
        n+=1;
        int di=(int) n;
        return di;

    }
}
