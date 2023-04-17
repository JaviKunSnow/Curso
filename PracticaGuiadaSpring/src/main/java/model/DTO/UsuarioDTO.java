package model.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class UsuarioDTO {
  @NotEmpty(message = "El email no puede estar vacío")
  @Email(message = "El email debe ser válido")
  private String email;

  @NotEmpty(message = "La clave no puede estar vacía")
  @Size(min = 8, max = 20, message = "La clave debe tener entre 8 y 20 caracteres")
  private String clave;

  @NotEmpty(message = "El nombre no puede estar vacío")
  @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "El nombre solo puede contener letras y espacios")
  @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
  private String nombre;

  @AssertTrue(message = "Debes aceptar las condiciones")
  private boolean aceptaCondiciones;

public UsuarioDTO() {
	
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean isAceptaCondiciones() {
	return aceptaCondiciones;
}

public void setAceptaCondiciones(boolean aceptaCondiciones) {
	this.aceptaCondiciones = aceptaCondiciones;
}


}

/*
 * @AssertFalse
@AssertTrue
@DecimalMax
@DecimalMin
@Digits
@Email
@Future
@FutureOrPresent
@Max
@Min
@Negative
@NegativeOrZero
@NotBlank
@NotEmpty
@NotNull
@Null
@Past
@PastOrPresent
@Pattern
@Positive
@PositiveOrZero
@Size
@SafeHtml
@URL
@CreditCardNumber
@Currency
@EAN
@ISBN
@Length
@Mod10Check
 * 
 */
