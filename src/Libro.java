public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private int cantPag;
    private int anoEdi;
    private String editorial;
    private String genero;

    public Libro(String titulo, String autor, int isbn, int cantPag, int anoEdi, String editorial, String genero) {

            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.cantPag = cantPag;
            this.anoEdi = anoEdi;
            this.editorial = editorial;
            this.genero = genero;

        }

    public Libro(String titulo, String autor, int isbn) {
    }

    public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getIsbn() {
            return isbn;
        }

        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }

         public int getCantPag() {
             return cantPag;
         }

        public void setCantPag(int cantPag) {
            this.cantPag = cantPag;
        }

        public int getAnoEdi() {
            return anoEdi;
        }

        public void setAnoEdi(int anoEdi) {
            this.anoEdi = anoEdi;
        }

        public String getEditorial() {
            return editorial;
        }

        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }
}

