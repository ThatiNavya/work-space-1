package in.navyait.converters;

import com.google.gson.Gson;

import in.navyait.bindings.Order;

public class ConvertJavaObjToJson {

	public static void main(String[] args) {

		Order order = new Order();
		order.setName("The Spring Order");
		order.setBillAmount(600.00);
		order.setId(523);
		order.setStatus("Confirmed");

		Gson gson = new Gson();
		String json = gson.toJson(order);

		System.out.println("Conversion is completed from Obj to Json");
		System.out.println(json);

		Order Obj = gson.fromJson(json, Order.class);
		
		System.out.println("Conversion is completed from Json to Obj");
	    System.out.println(Obj);
	}
}
