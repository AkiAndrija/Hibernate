package glavni;

import javax.persistence.*;
    @Entity
    @Table(name = "izvodjac")
    public class Izvodjac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        private int id;

        @Column(name = "nazivIzvodjaca")
        private String nazivIzvodjaca;

        @Enumerated(EnumType.STRING)
        @Column(name = "tipIzvodjaca")
        private String tipIzvodjaca;

        @Column(name = "godinaFormacije")
        private int godinaFormacije;

        @Column(name = "godinaRaspada")
        private Integer godinaRaspada;

        @Column(name = "zvanicanSajt")
        private String zvanicanSajt;

        public Izvodjac() {
        }

        public Izvodjac(int id, String nazivIzvodjaca, String tipIzvodjaca, int godinaFormacije, int godinaRaspada, String zvanicanSajt) {
            this.id = id;
            this.nazivIzvodjaca=nazivIzvodjaca;
            this.tipIzvodjaca=tipIzvodjaca;
            this.godinaFormacije=godinaFormacije;
            this.godinaRaspada=godinaRaspada;
            this.zvanicanSajt=zvanicanSajt;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNazivIzvodjaca() {
            return nazivIzvodjaca;
        }

        public void setNazivIzvodjaca(String nazivIzvodjaca) {
            this.nazivIzvodjaca = nazivIzvodjaca;
        }

        public String getTipIzvodjaca() {
            return tipIzvodjaca;
        }

        public void setTipIzvodjaca(String tipIzvodjaca) {
            this.tipIzvodjaca = tipIzvodjaca;
        }

        public int getGodinaFormacije() {
            return godinaFormacije;
        }

        public void setGodinaFormacije(int godinaFormacije) {
            this.godinaFormacije = godinaFormacije;
        }

        public Integer getGodinaRaspada() {
            return godinaRaspada;
        }

        public void setGodinaRaspada(Integer godinaRaspada) {
            this.godinaRaspada = godinaRaspada;
        }

        public String getZvanicanSajt() {
            return zvanicanSajt;
        }

        public void setZvanicanSajt(String zvanicanSajt) {
            this.zvanicanSajt = zvanicanSajt;
        }

        @Override
        public String toString() {
            return "Izvodjac{" +
                    "id=" + id +
                    ", naziv='" + nazivIzvodjaca + '\'' +
                    ", tip=" + tipIzvodjaca +
                    ", godinaFormacije=" + godinaFormacije +
                    ", godinaRaspada=" + godinaRaspada +
                    ", zvanicniSajt='" + zvanicanSajt + '\'' +
                    '}';
        }
    }
