package punto_de_venta.api.entities.generic;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id", nullable = false, unique = true)
	private Long client_id;
	
	@NonNull
	@Column(name = "client_name", nullable = false, unique = true, length = 40)
	private String client_name;
	
	@NonNull
	@Column(name = "client_last_name", nullable = false, unique = true, length = 40)
	private String client_last_name;
	
	@NonNull
	@Column(name = "client_tel_number", nullable = false, unique = true, length = 15)
	private String client_tel_number;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
	private Set<Direction> directions = new HashSet<Direction>();
}











