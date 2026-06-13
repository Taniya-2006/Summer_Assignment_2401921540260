package live;
import music.*;
import music.string.*;
import music.wind.*;
public class Test{
    public static void main(String[] args){
        Veena obj1=new Veena();
        obj1.play();
        Saxophone obj2=new Saxophone();
        obj2.play();

        Playable p;
        p=new Veena();
        p.play();

        p=new Saxophone();
        p.play();
   }
}
