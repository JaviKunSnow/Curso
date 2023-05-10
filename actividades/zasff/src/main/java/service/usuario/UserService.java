package service.usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import model.DTO.UsuarioDTO;
import model.VO.UsuarioVO;
import repository.UserRepository;



@Service
public class UserService  {

	
	@Autowired
	private UserRepository userRepository;
	 
	 public UserService() {
		 System.out.println("llamamos al constructor del servicio de usuario");
	 }

	public List<UsuarioVO> obtenerLista() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public Optional<UsuarioVO> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	
	public UsuarioVO buscarPorEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

	public void guardarUsuario(UsuarioVO usuario) {

		userRepository.save(usuario);
		
	}

	
	public void actualizarUsuario(UsuarioVO usuario) {
		// TODO Auto-generated method stub
		//HARIAMOS UN METODO CON NUESTRO CODIGO
		
		
	}

	
	public void borrarUsuario(UsuarioVO usuario) {
		userRepository.delete(usuario);
		
	}
	
	public void borrarUsuarioPorId(Long id) {
		userRepository.deleteById(id);
		
	}

	public UsuarioVO convertirDTOaVO( UsuarioDTO usuario) {
		UsuarioVO usuarioVO = new UsuarioVO();
		usuarioVO.setClave(usuario.getClave());
		usuarioVO.setEmail(usuario.getEmail());
		usuarioVO.setNombre(usuario.getNombre());
		return usuarioVO;
	}

	public List<String> obtenerListaNombreErrores(BindingResult binding) {
		List<String> inputNames = new ArrayList<>();
		for (FieldError error : binding.getFieldErrors()) {
			if (!inputNames.contains(error.getField())) {
				inputNames.add(error.getField());
			}
		}
		return inputNames;
	}

	public List<FieldError> obtenerListaErroresValidacion(BindingResult binding, List<String> inputNames, List<FieldError> listaErrores) {
		for (String inputName : inputNames) {
			boolean primero = false;
			
			for (FieldError error : binding.getFieldErrors()) {
				if (!primero && error.getField().equals(inputName)) {
					 primero = true;
					 listaErrores.add(binding.getFieldErrors(inputName).get(0));
				} 
				
			}
		}
		return listaErrores;
	}

	public void mostrarErrores(List<FieldError> listaErrores) {
		for (FieldError fieldError : listaErrores) {
			System.out.println(fieldError.getDefaultMessage());
		}
		
	}

}
