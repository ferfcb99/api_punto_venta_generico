package punto_de_venta.api.entities.generic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

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
@Table(name = "provider")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", nullable = false, unique = true)
	private Long provider_id;
	
	@NonNull
	@Column(name = "provider_name", nullable = false, unique = true, length = 40)
	private String provider_name;
	
	@NotNull
	@Column(name = "provider_last_name", nullable = false, unique = true, length = 40)
	private String provider_last_name;
	
	@NotNull
	@Column(name = "provider_tel_number", nullable = false, unique = true, length = 15)
	private String provider_tel_number;
	
	@NotNull
	@Column(name = "provider_contact", nullable = false, unique = true, length = 200)
	private String provider_contact;
	
	@NotNull
	@Column(name = "provider_direction", nullable = true, unique = true, length = 500)
	private String provider_direction;
	
}
