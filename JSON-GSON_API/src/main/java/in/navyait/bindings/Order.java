package in.navyait.bindings;

import lombok.Data;

@Data
public class Order {

	private Integer id;
	
	private String name;
	
	private String status;
	
	private Double billAmount;
}
