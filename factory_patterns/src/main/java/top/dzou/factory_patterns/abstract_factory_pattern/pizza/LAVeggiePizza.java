package top.dzou.factory_patterns.abstract_factory_pattern.pizza;

import top.dzou.factory_patterns.abstract_factory_pattern.Dough;
import top.dzou.factory_patterns.abstract_factory_pattern.Pizza;
import top.dzou.factory_patterns.abstract_factory_pattern.PizzaIngredientFactory;
import top.dzou.factory_patterns.abstract_factory_pattern.Sauce;

/**
 * @author dingxiang
 * @date 19-8-6 上午10:53
 */
public class LAVeggiePizza extends Pizza {
    public LAVeggiePizza(PizzaIngredientFactory ingredientFactory){
        name = "LA veggie pizza";
        this.ingredientFactory = ingredientFactory;
    }
    private PizzaIngredientFactory ingredientFactory;
    public void prepare() {
        System.out.println("I am preparing "+name);
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
    }
}
