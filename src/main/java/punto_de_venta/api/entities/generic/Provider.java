package punto_de_venta.api.entities.generic;

import java.io.Serializable;

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
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "provider")
public class Provider implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provider_id", nullable = false, unique = true)
	private Long provider_id;
	
	@NonNull
	@Column(name = "provider_name", nullable = false, unique = false, length = 40)
	private String provider_name;
	
	@NotNull
	@Column(name = "provider_last_name", nullable = false, unique = false, length = 40)
	private String provider_last_name;
	
	@NotNull
	@Column(name = "provider_tel_number", nullable = false, unique = false, length = 15)
	private String provider_tel_number;
	
	@NotNull
	@Column(name = "provider_contact", nullable = false, unique = false, length = 200)
	private String provider_contact;
	
	@NotNull
	@Column(name = "provider_direction", nullable = true, unique = false, length = 500)
	private String provider_direction;
	
}
