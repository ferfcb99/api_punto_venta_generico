package punto_de_venta.api.entities.generic;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false, unique = true)
	private Long product_id;
	
	@Column(name = "product_name", nullable = false, unique = true, length = 50)
	private String product_name;
	
	@Digits(/* enteros */ integer = 6, /* decimales */ fraction = 3)
	@Column(name = "product_price", nullable = false, unique = true)
	private Double product_price;
	

	@Column(name = "product_stock", nullable = false, unique = true)
	private Integer product_stock;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	@JoinColumn(name = "category_id")
	private Category category;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	@JoinColumn(name = "provider_id")
	private Provider provider;
	
}
