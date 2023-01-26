package punto_de_venta.api.entities.generic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id", nullable = false, unique = true)
	private Long client_id;
	
	@NonNull
	@Column(name = "client_name", nullable = false, unique = false, length = 40)
	private String client_name;
	
	@NonNull
	@Column(name = "client_last_name", nullable = false, unique = false, length = 40)
	private String client_last_name;
	
	@NonNull
	@Column(name = "client_tel_number", nullable = false, unique = false, length = 15)
	private String client_tel_number;
	
	
	@JsonIgnore
	@Setter(onMethod_ = @JsonProperty)
	@Getter(onMethod_ = @JsonIgnore)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	private Set<Direction> directions = new HashSet<Direction>();
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	@JoinTable(foreignKey = @ForeignKey(name = "client_id", value = ConstraintMode.CONSTRAINT),
				inverseForeignKey = @ForeignKey(name = "product_id", value = ConstraintMode.CONSTRAINT))
	private List<Product> products = new ArrayList<Product>();
	
}












