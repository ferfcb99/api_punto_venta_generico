package punto_de_venta.api.services.generic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_de_venta.api.daos.generic.ProviderDao;
import punto_de_venta.api.entities.generic.Provider;
import punto_de_venta.api.interfaces.generic.services.IProviderService;

@Service
public class ProviderService implements IProviderService<Provider> {

	@Autowired
	ProviderDao providerDao;

	@Override
	public List<Provider> getAll() {
		List<Provider> providers = this.providerDao.findAll();
		return providers;
	}

	@Override
	public Provider getById(Long id) {
		Provider provider = this.providerDao.getById(id);
		return provider;
	}

	@Override
	public Provider createOrUpdate(Provider entity) {
		Provider provider = this.providerDao.save(entity);
		return provider;
	}

	@Override
	public Provider deleteById(Long id) {
		Provider provider = this.getById(id);
		this.providerDao.deleteById(id);
		return provider;
	}

}
