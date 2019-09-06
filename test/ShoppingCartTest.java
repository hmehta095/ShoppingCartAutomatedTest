import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	
	@Test
	public void testAddProductToCart() {
		
				// EO1: When a new product is added, 
				// 		the number of items must be incremented 
				// EO2: When a new product is added, 
				// 		the new balance must be the 
				// 		sum of the previous balance plus 
				// 		the cost of the new product  
		
			 //	   1.  MAKE A SHOPPING CART!
		
		ShoppingCart cart = new ShoppingCart();
		
		
			 //    2.  MAKE A PRODUCT
		Product phone = new Product("iphone", 1500);
		
		
			 //    3.  CHECK BALANCE IN CART BEFORE ADDING PRODUCT
			 //    			- PREV BAL
		double startBalance = cart.getBalance();
		assertEquals(0,startBalance,0.01);
		
		
			 //    4.  CHECK NUM ITEMS IN CART BEFORE ADDING PRODUCT
			 //   		    - PREV NUM ITEMS
		
		int StartingNumItems = cart.getItemCount();
		assertEquals(0,StartingNumItems);
		
			 //    5.  ADD THE PRODUCT TO THE CART 
		cart.addItem(phone);
		
			 //    6.  CHECK THE UPDATED NUMBER OF ITEMS IN CART 
			 //    		-- EO: NUM ITEMS + 1
		assertEquals(StartingNumItems + 1, cart.getItemCount());
			 //    -----------------------
			 //    7.  CHECK THE UPDATED BALANCE OF THE CART
			 //   		-- EO: PREVIOUS BALANCE + PRICE OF PRODUCT
		
		double expectedBalance = startBalance + phone.getPrice();
		
		assertEquals(expectedBalance,cart.getBalance(),0.01);
		
		
		
	}
	
	
	
	
	
	
	
	// 1. make 1 function per test case
		// 2. put the @Test decorator on 
		// 		top of the test case
		// 3. write code for your test case
		// 4. call assertEquals() in 
		// 		your test case
		// 5. Run the program
		// 6. look at results!
		@Test
		public void testCreateCart() {
			// Test: When created, the cart has 0 items 

			// 1. Make a new cart
			ShoppingCart cart = new ShoppingCart();
			
			// 2. check number of items in cart
			int a = cart.getItemCount();
			
			// 3. do the assert
			assertEquals(0, a);
		}
		
		@Test
		public void testEmptyTheCart() {
			// 1.Create a new cart
			ShoppingCart cart = new ShoppingCart();
			// 2. Add an item to the cart
			Product phone = new Product("iphone", 1500);
			Product hamburger = new Product("burger", 10);
			cart.addItem(phone);
			cart.addItem(hamburger);
			
			// 3.Get rid of all items in the cart
			cart.empty();
			
			// 4. Check num items in cart === E = 0
			assertEquals(0, cart.getItemCount());
		}
		

		
	}
