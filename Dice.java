public class Dice {
    public static void main(String[] args) {
        
        try{
           
        while(true){
            Thread.sleep(500);
            System.out.println(generateNumberBetween13and17());
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


    public static  int generateNumberBetween13and17(){
        double n=Math.random()*5;
        n+=13;
        int di=(int) n;
        return di;
    }
}
