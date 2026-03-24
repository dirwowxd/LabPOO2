public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado estado;
    public PabellonCirugia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }
    public int getNumero() {
        return numero;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String toString() {
        return "Numero: "+numero+"\nEspecialidad: "+especialidad+"\nEstado: "+estado;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PabellonCirugia that = (PabellonCirugia) o;
        return numero==that.numero;
    }
}
