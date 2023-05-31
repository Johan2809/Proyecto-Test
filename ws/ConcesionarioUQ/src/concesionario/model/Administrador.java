package concesionario.model;

import java.util.ArrayList;
import java.util.List;

import concesionario.exceptions.EmpleadoException;
/**
 * atributos
 * @author USUARIO WINDOWS
 *
 */
public class Administrador {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private List<Empleado> listaEmpleados;
/**
 * constructor
 * @param nombre
 * @param apellido
 * @param usuario
 * @param contrasenia
 * @param listaEmpleados
 */
    public Administrador(String nombre, String apellido, String usuario, String contrasenia, List<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.listaEmpleados = listaEmpleados;
    }

    public Administrador() {
        this.listaEmpleados = new ArrayList<>();
    }

    /**
     * Getters y setters
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasenia;
    }

    public void setContrasena(String contrasena) {
        this.contrasenia = contrasena;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Método para ver los reportes de los negocios
     *  realizados por cada uno de los empleados en un periodo de tiempo dado
     * @param fechaInicio
     * @param fechaFin
     */
    public void verReportes(String fechaInicio, String fechaFin) {
        // Implementación para ver los reportes
    }
    /**
     * metodo para registrar un empleado
     * @param nombre
     * @param apellido
     * @param idEmpleado
     * @param usuario
     * @param contrasenia
     * @param correoElectronico
     * @param respuestaSeguridad
     * @return
     * @throws EmpleadoException
     */

    public Empleado registrarEmpleado(String nombre, String apellido, String idEmpleado, String usuario,
            String contrasenia, String correoElectronico, String respuestaSeguridad) throws EmpleadoException {
    	if(verificarEmpleado(idEmpleado) == true){
			throw new EmpleadoException("Empleado ya existe");
		}
        Empleado empleado = new Empleado(nombre, apellido, idEmpleado, usuario, contrasenia, correoElectronico,
                respuestaSeguridad, null);
        listaEmpleados.add(empleado);
        return empleado;
    }
    /**
     * metodo para actualizar un empleado
     * @param nombre
     * @param apellido
     * @param idEmpleado
     * @param usuario
     * @param contrasenia
     * @param correoElectronico
     * @param respuestaSeguridad
     * @throws EmpleadoException
     */

    public void actualizarEmpleado(String nombre, String apellido, String idEmpleado, String usuario,
            String contrasenia, String correoElectronico, String respuestaSeguridad) throws EmpleadoException {
        Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
        empleadoEncontrado.setNombre(nombre);
        empleadoEncontrado.setApellido(apellido);
        empleadoEncontrado.setUsuario(usuario);
        empleadoEncontrado.setContrasenia(contrasenia);
        empleadoEncontrado.setCorreoElectronico(correoElectronico);
        empleadoEncontrado.setRespuestaSeguridad(respuestaSeguridad);
    }

    /**
     * metodo para eliminar un empleado
     * @param idEmpleado
     * @return
     */

	public boolean eliminarEmpleado(String idEmpleado) {

		if(verificarEmpleado(idEmpleado)){
			for (Empleado empleado : listaEmpleados) {
				if(empleado.getIdEmpleado().equals(idEmpleado)){
					listaEmpleados.remove(empleado);
					return true;
				}
			}
		}else{
			return false;
		}
		return false;
	}
	/**
	 * metodo para bloquear cuenta a un empleado
	 * @param idEmpleado
	 * @throws EmpleadoException
	 */
    public void bloquearEmpleado(String idEmpleado) throws EmpleadoException {
        Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
        if (empleadoEncontrado == null) {
            throw new EmpleadoException("El empleado con ID " + idEmpleado + " no está registrado.");
        }

        empleadoEncontrado.setBloqueado(true);
    }

    /**
     * metodo para buscar un empleado
     * @param idEmpleado
     * @return
     */

    private Empleado buscarEmpleado(String idEmpleado) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                return empleado;
            }
        }
        return null;
    }
/**
 * metodo que verifica empleado
 * @param idEmpleado
 * @return
 */
    private boolean verificarEmpleado(String idEmpleado) {
        return buscarEmpleado(idEmpleado) != null;
    }
}
