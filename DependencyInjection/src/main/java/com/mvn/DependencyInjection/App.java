package com.mvn.DependencyInjection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    /*{
    	//Product p=new Product(1,"1+mobile",10000,1);
    	// Order o = new Order(1, "Mobile Order", p);
    	
    	        Product p = new Product();
    	        Order o = new Order();
    	        p.setProductId(1);
    	        p.setProductName("1+mobile");
    	        p.setProductPrice(10000);
    	        p.setProductQuantity(1);

    	        o.setOrderId(1);
    	        o.setOrderName("mobile");
    	        o.setProduct(p);

    	        
    	        o.print();
    	    }*/
    {
    	Marks m= new Marks(90,91,92);
    	Student s= new Student("prani",10,m);
    	School sl = new School("Sfs", s);
    	 sl.print();
    }
    	}



