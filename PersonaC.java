class PersonaC {
    String nombre;
    String apellido;
    String direccion;

    public PersonaC() {
        nombre = "No identificado";
        apellido = "No identificado";
        direccion = "No identificado";
    }

    // constructor copia
    public PersonaC(PersonaC p) {
        /* this. */nombre = p.nombre;
        this.apellido = p.apellido;
        this.direccion = p.direccion;
    }

    public String toString() {
        return "Persona = " + nombre + " " + apellido + " - Dir: " + direccion;
    }

    public static void main(String[] args) {
        PersonaC p1 = new PersonaC();
        PersonaC p4 = new PersonaC(p1);
        System.out.println(p1.toString());
        System.out.println(p4.toString());
    }
}
