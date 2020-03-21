package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food
{
    List<Spice> spiceList;

    public Food()
    {
        spiceList = new ArrayList<>();
    }

    public List<Spice> getAllSpices()
    {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount()
    {
        Map<Class<Spice>, Integer> spiceCount = new HashMap<>();

        for(Spice element : spiceList)
        {
//            if(!spiceCount.containsKey(element))
//            {
//                spiceCount.put(element, 1);
//            }
//            else
//            {
//                spiceCount.put(element, spiceCount.get(element) + 1);
//            }
        }

        return (Map<SpiceType, Integer>) spiceCount;
    }

    public void applySpice(Spice spice)
    {
        spiceList.add(spice);
    }
}
