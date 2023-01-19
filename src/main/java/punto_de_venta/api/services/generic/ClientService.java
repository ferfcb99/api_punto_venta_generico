package punto_de_venta.api.services.generic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_de_venta.api.daos.generic.ClientDao;
import punto_de_venta.api.entities.generic.Client;
import punto_de_venta.api.interfaces.generic.services.IClientService;


@Service
public class ClientService implements IClientService<Client> {

	@Autowired
	ClientDao clientDao;

	@Override
	public List<Client> getAll() {
		List<Client> Clients = this.clientDao.findAll();
		return Clients;
	}

	@Override
	public Client getById(Long id) {
		Client Client = this.clientDao.getById(id);
		return Client;
	}

	@Override
	public Client createOrUpdate(Client entity) {
		Client Client = this.clientDao.save(entity);
		return Client;
	}

	@Override
	public Client deleteById(Long id) {
		Client Client = this.getById(id);
		this.clientDao.deleteById(id);
		return Client;
	}

}