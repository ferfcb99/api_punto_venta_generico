package punto_de_venta.api.entities.generic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", nullable = false, unique = true)
	private Long category_id;
	
	@NotNull
	@Column(name = "category_name", nullable = false, unique = true, length = 40)
	private String category_name;
	
	@NotNull
	@Column(name = "category_description", nullable = false, unique = true, length = 100)
	private String category_description;
	
}
