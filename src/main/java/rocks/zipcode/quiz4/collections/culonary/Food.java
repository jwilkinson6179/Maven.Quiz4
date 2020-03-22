package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Map<Class<? extends Spice>, Integer> spiceCount = new HashMap<>();

        for(Spice element : spiceList)
        {
            if(!spiceCount.containsKey(element.getClass()))
            {
                spiceCount.putIfAbsent(element.getClass(), 1);
            }
            else
            {
                Integer currentCount = spiceCount.get(element.getClass());
                spiceCount.put(element.getClass(), currentCount + 1);
            }
        }

        return (Map<SpiceType, Integer>) spiceCount;
    }

    public void applySpice(Spice spice)
    {
        spiceList.add(spice);
    }
}
