package dz1seminar1;
import java.util.List;
public class BottleWithWaterAutomat implements Automat {

    private final List<BottleWithWater> products;

    public BottleWithWaterAutomat(List<BottleWithWater> products){
        this.products = products;
    }

    public Product getProduct(String name){
        for ( BottleWithWater product : products){
            if (product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
    public BottleWithWater getProduct (String name, int volume){
        for (BottleWithWater product : products){
            if (product != null){
                if (product.getName().equalsIgnoreCase(name) && ((BottleWithWater)product).getVolume() == volume){
                    return (BottleWithWater) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
