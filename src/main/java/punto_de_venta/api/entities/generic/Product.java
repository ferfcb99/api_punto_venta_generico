package punto_de_venta.api.entities.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false, unique = true)
	private Long product_id;
	
	@Column(name = "product_name", nullable = false, unique = false, length = 50)
	private String product_name;
	
	@Digits(/* enteros */ integer = 6, /* decimales */ fraction = 3)
	@Column(name = "product_price", nullable = false, unique = false)
	private Double product_price;
	

	@Column(name = "product_stock", nullable = false, unique = false)
	private Integer product_stock;

	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	@JoinColumn(foreignKey = @ForeignKey(name = "category_id", value = ConstraintMode.CONSTRAINT))
	private Category category;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	@JoinColumn(foreignKey = @ForeignKey(name = "provider_id", value = ConstraintMode.CONSTRAINT))
	private Provider provider;
	
	
	@JsonIgnore
	@Setter(onMethod_ = @JsonProperty)
	@Getter(onMethod_ = @JsonIgnore)
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
	private List<Client> clients = new ArrayList<Client>();
	
}
