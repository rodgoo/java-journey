package arrays.ArrayListaEmemoria;

    public class Empresa {
        private Integer id;
        private String nome;
        private Double salario;

        public Empresa() {
        }

        public Empresa(Integer id, String nome, Double salario) {
            this.id = id;
            this.nome = nome;
            this.salario = salario;
        }

        public Integer getId() {
            return this.id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Double getSalario() {
            return this.salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

        // Metodo para aumentar salário
        public void aumentarSalario(double porcentagem) {
            salario += salario * porcentagem / 100.0;
        }

        // Volta de stream para string
        public String toString() {
            return id + ", " + nome + ", " + String.format("%.2f", salario);
        }
    }
