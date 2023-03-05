package ClasesAnidadas;
import P6.Asignatura;
//Creamos la clase DepartamentoAnidado y la clase ProfesorAnidado como una clase interna estática.
public class DepartamentoAnidado {
	// Creamos la clase ProfesorAnidado

	public static class ProfesorAnidado {
		// Atributos de la clase ProfesorAnidado

	    private String nombre;
	    private String apellidos;
	    private Asignatura[] asignaturas;
	    private String genero;
	    private DepartamentoAnidado departamento;
		// Constructor para la clase ProfesorAnidado

	    public ProfesorAnidado(String nombre, String apellidos, Asignatura[] asignaturas, DepartamentoAnidado departamento, String genero) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.asignaturas = asignaturas;
	        this.departamento = departamento;
	        this.genero = genero;
	    }
	 // Método getter y setter para el atributo nombre de la clase ProfesorAnidado

	    public DepartamentoAnidado getdepartamento() {
	    	return departamento;
	    
	    }
	    public void setdepartamento(DepartamentoAnidado departamento) {
	    	this.departamento= departamento;
	    }
		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public String getApellidos() {
		        return apellidos;
		    }

		    public void setApellidos(String apellidos) {
		        this.apellidos = apellidos;
		    }

		    public Asignatura[] getAsignaturas() {
		        return asignaturas;
		    }

		    public void setAsignaturas(Asignatura[] asignaturas) {
		        this.asignaturas = asignaturas;
		    }
		    public String getgenero() {
		        return genero;
		    }

		    public void setgenero(String genero) {
		        this.genero = genero;
		    }
		 // Método toString para imprimir la información de la clase ProfesorAnidado.

		    public String toString() {
		        StringBuilder sb = new StringBuilder();
		        sb.append("Nombre: ").append(nombre).append(" ").append(apellidos).append("\n");
		        sb.append("Genero: ").append(genero).append("\n");
		        sb.append("Asignaturas:\n");

		        for (Asignatura asignatura : asignaturas) {
		            sb.append("\t").append(asignatura.getNombre()).append("\n");
		            sb.append("\t\tID: ").append(asignatura.getId()).append("\n");
		            sb.append("\t\tMódulo: ").append(asignatura.getModulo().getDescripcion()).append("\n");
		            sb.append("\t\tCurso: ").append(asignatura.getCurso()).append("\n");
		            sb.append("\t\tHoras semanales: ").append(asignatura.getHorasSemana()).append("\n");
		        }
		        return sb.toString();
		    }
	}
	// Atributos de la clase DepartamentoAnidado

	private String nombre;
	private ProfesorAnidado[] profesores;
	// Constructor para la clase DepartamentoAnidado

	 public DepartamentoAnidado(String nombre, int totalProfesores) {
	        this.nombre = nombre;
	        this.profesores = new ProfesorAnidado[totalProfesores];
	    }
	// Método para añadir un profesor a la lista de profesores

	    public void añadirProfesor(ProfesorAnidado profesor) {
	        for (int i = 0; i < profesores.length; i++) {
	            if (profesores[i] == null) {
	                profesores[i] = profesor;
	                break;
	            }
	        }
	    }
	 // Método para obtener el número total de profesores en el departamento

	    public int getTotalProfesores() {
	        int contador = 0;
	        for (int i = 0; i < profesores.length; i++) {
	            if (profesores[i] != null) {
	                contador++;
	            }
	        }
	        return contador;
	   
	    }
	 // Método para obtener un profesor específico según su índice

	    public ProfesorAnidado getProfesor(int index) {
	        return profesores[index];
	    }
	 // Método getter y setter para el atributo nombre de la clase DepartamentoAnidado

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	 // Método toString para imprimir la información de la clase DepartamentoAnidado

	    public String toString() {
	        String reporte = "Departamento: " + nombre + "\n";
	        reporte += "Número de profesores: " + getTotalProfesores() + "\n\n";
	        for (int i = 0; i < profesores.length; i++) {
	            if (profesores[i] != null) {
	                reporte += "Profesor " + (i + 1) + "\n";
	                reporte += "Nombre: " + profesores[i].getNombre() + "\n";
	                reporte += "Apellidos: " + profesores[i].getApellidos() + "\n";
	                reporte += "Género: " + profesores[i].getgenero() + "\n";
	                reporte += "Asignaturas:\n";
	                for (int j = 0; j < profesores[i].getAsignaturas().length; j++) {
	                    Asignatura asignatura = profesores[i].getAsignaturas()[j];
	                    if (asignatura != null) {
	                        reporte += " - " + asignatura.getNombre() + " (" + asignatura.getId() + ")\n";
	                    }
	                }
	                reporte += "\n";
	            }
	        }
	        return reporte;
	    }

	}


