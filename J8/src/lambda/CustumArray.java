package lambda;

import java.util.ArrayList;
import java.util.Collections;

public class CustumArray extends ArrayList {

  @Override
  public boolean add(Object o) {
    System.out.println("this:"+this.toString());
    if (this.contains(o)){

      return false;
    }
    return super.add(o);

  }

  public static void main(String[] args) {
    CustumArray cs =new CustumArray();
    cs.add(1);
    cs.add(1);
    cs.add(2);
    cs.add(0,1);
    cs.add(0,1);
    System.out.println(cs);

    System.out.println("---------------------------");
    CustumArray cs2 =new CustumArray();
    cs2.add(4);
    cs2.add(4);
    cs2.add(5);
    cs2.add(3);
    System.out.println(cs2);
    Collections.sort(cs2);

  }
}
