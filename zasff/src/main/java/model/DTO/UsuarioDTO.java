package model.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
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

  // Constructor vacío
  public UsuarioDTO() {}
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
