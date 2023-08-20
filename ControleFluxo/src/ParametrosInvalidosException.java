
public class ParametrosInvalidosException extends Exception {
  private String motivo;

  public ParametrosInvalidosException(String mensagem) {
    this.motivo = mensagem;
  }

  @Override
  public String getMessage() {
    return this.motivo;
  }
}
