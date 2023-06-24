package modulo01;
    
class Medico {
    private String nombre;
    private String especialidad;
    private int horaAlmuerzo;

    public Medico(String nombre, String especialidad, int horaAlmuerzo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(int horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }
}

