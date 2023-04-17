package controller.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.DTO.UsuarioDTO;
import service.usuario.UserService;

@Controller("/user")
public class UserController {
	
		
	@Autowired
    private UserService userService;
	

	@PostMapping("/doRegister")
	public String doRegister(@Valid @ModelAttribute("userRegister") UsuarioDTO usuario, BindingResult binding, Model model) {

		//Filtramos la lista de errores para saber los campos erroneos
		List<String> inputNames = userService.obtenerListaNombreErrores(binding);				
				
		//vamos a rellenar una lista para pasarla a la vista
		List<FieldError> listaErrores = new ArrayList<>();
		
		listaErrores = userService.obtenerListaErroresValidacion(binding, inputNames, listaErrores);
		
		if (binding.hasErrors()) {
			userService.mostrarErrores(listaErrores);
			model.addAttribute("binding", binding);
			return "tienda/register";
		} else {
			userService.guardarUsuario(userService.convertirDTOaVO(usuario));
			model.addAttribute("mensaje", "El usuario se ha insertado correctamente");
			return "paginaMensajes";
		}
	}

}
