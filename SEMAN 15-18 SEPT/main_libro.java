 public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("uijote de la mancha");
        libro1.setAutor("cervantes");
        libro1.setGenero("Novela");
        libro1.setNumPaginas(600);
        
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getNumPaginas());
        libro1.setAutor("Titulo modificado");
        System.out.println(libro1.getTitulo());
        
        System.out.println(" \nDETALLE DEL LIBRO");
        
        System.out.println(libro1.verDetalle());
        
        System.out.println(" \n LIBRO PRESTADO A");
        System.out.println(libro1.prestar("PATRICIA ARDILA"));
        
        System.out.println(" \nLIBRO PRESTADO Y DEVUELTO");
        System.out.println(libro1.prestarYDevolver("PATRICIA ARDILA"));
        
        
        System.out.println(libro1.calcularTiempoLectura(30, 2.5f));
