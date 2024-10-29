package sa.edu.kau.fcit.cpit252;

import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String n) {
    // return a flyweight if it already exists, otherwise, put it in the map.
    if (flyweights.containsKey(n)){
      return flyweights.get(n);
    }
    ImageElement e = new ImageElement(n);
    flyweights.put(n, e);
    return e;
  }

  public int numberOfFlyweights() {
    return flyweights.size();
    // return the size of the HashMap
  }

}
