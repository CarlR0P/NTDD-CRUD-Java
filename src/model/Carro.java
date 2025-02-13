package model;

public class Carro {
    
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String tipoCombustible;
    private String tipoCarroceria;
    private long precio;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anio, String color, String tipoCombustible, String tipoCarroceria, long precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.tipoCarroceria = tipoCarroceria;
        this.precio = precio;
    }

    public Carro(int id, String marca, String modelo, int anio, String color, String tipoCombustible, String tipoCarroceria, long precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.tipoCarroceria = tipoCarroceria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    
}
