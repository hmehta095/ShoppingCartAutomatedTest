import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void testCreateCart() {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product phone = new Product("iphone", 1500);
		
		Product hamburger = new Product("burger",10);
		cart.addItem(hamburger);
		cart.addItem(phone);
		
		assertEquals(2, cart.getItemCount());

		cart.empty();
		
		assertEquals(0, cart.getItemCount());
		
	}
	
}
