package punto_de_venta.api.entities.generic;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "direction")
public class Direction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "direction_id", nullable = false, unique = true)
	private Long direction_id;
	
	@NonNull
	@Column(name = "direction_state", nullable = false, unique = true, length = 40)
	private String direction_state;
	
	@NonNull
	@Column(name = "direction_internal_num", nullable = false, unique = true, length = 40)
	private String direction_internal_num;
	
	@NonNull
	@Column(name = "direction_external_num", nullable = false, unique = true, length = 40)
	private String direction_external_num;
	
	@NonNull
	@Column(name = "direction_references", nullable = false, unique = true, length = 40)
	private String direction_references;
	
	/*
	@JsonIgnore
	@Setter(onMethod_ = @JsonProperty)
	@Getter(onMethod_ = @JsonIgnore)
	*/
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(foreignKey = @ForeignKey(name = "client_id"))
	private Client client;
	
}
