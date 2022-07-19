package vttp.day12example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller class
@Controller
@RequestMapping(path = {"/cart"})
public class CartController {
    
    @GetMapping(produces = {"text/html"})
    public String displayCart(Model model) {
        CartService c = new CartService();
        List<Item> cartItems = c.getShoppingItems();
		model.addAttribute("cart", cartItems);
		return "cart";
    }

    @GetMapping({"{itemName}"})
    public String filteredCart(@PathVariable(name="itemName", required=true) String itemName,Model model) {
        CartService c = new CartService();
        List<Item> cartItems = c.getShoppingItems();
        List<Item> filteredItems = new ArrayList<>();
        for (Item s : cartItems) {
            if (s.getItemName().contains(itemName)) {
                filteredItems.add(s);
            }
        }

		model.addAttribute("cart", filteredItems);
		return "cart";
    }

}
