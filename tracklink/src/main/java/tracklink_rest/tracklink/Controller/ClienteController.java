package tracklink_rest.tracklink.Controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tracklink_rest.tracklink.Models.Cliente;
import tracklink_rest.tracklink.Repository.ClienteRepository;

//org.bson.types.ObjectId
@SpringBootApplication
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Cliente> getAllClientes() {
		return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Cliente getClienteById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyClienteById(@PathVariable("id") ObjectId id, @Valid @RequestBody Cliente cliente) {
		cliente.setId(id);
		repository.save(cliente);
	}
	//modifica una parte del todo, me falta indagar mas
	//actualemente modifica y las demas partes las setea en null
	@RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
	public void modifyPartOfClienteById(@PathVariable("id") ObjectId id, @Valid @RequestBody Cliente cliente) {
		cliente.setId(id);
		repository.save(cliente);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteCliente(@PathVariable("id") ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}

}
