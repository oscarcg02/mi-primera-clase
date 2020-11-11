public class Tablet {
    // Dice la marca y el modelo de la tablet   
    private String marcaModelo;
    // Dice cuanta RAM posee el dispositivo
    private int ram;
    // Dice si contien microHDMI o no 
    private boolean hdmi;
    
    /**
     * Constructor
     */
    public Tablet(String marca, int ramTablet) {
         marcaModelo = marca;
         ram = ramTablet;
         hdmi = true;        
    }
    
    /**
     * Devuelve la marca y modelo
     */
    public String getMarcaModelo() {
        return marcaModelo;
    }

    /**
     * Devuelve capacidad de memoria RAM
     */
    public int getram() {
        return ram;
    }
    
    /**
     * Devuelve si tiene HDMI
     */
    public boolean gethdmi() {
        return hdmi;
    }
    
    /**
     * Cambia el nombre de la marca y el modelo
     */
    public void setMarcaModelo(String marcaModeloNuevo) {
        marcaModelo = marcaModeloNuevo;
    }
    
    /**
     * Cambia el el tamaño de la RAM
     */
    public int añadirModuloRam() {
        int añadirModuloRam = 2;
        añadirModuloRam = ram + añadirModuloRam;
        return añadirModuloRam;
    }
    
    public boolean conectarAlTelevisor() {   
        if (hdmi == true) {
            hdmi = false; 
        }
        else {
            hdmi = true;
        } 
        return hdmi;
    }
    
    /**
     * Imprime lo detalles de la tablet 
     */
    public void imprimeDetalles() {
        String hdmi = "Si";
        System.out.println("Marca y Modelo: " + marcaModelo + " | " + "RAM: " + ram + " GB " + " | " + "HDMI: " + hdmi);
    }
    
    /**
     * Devuelve la marca y modelo
     */
    public String getmostrarDetalles() {
        String hdmi = "Si";
        return "Marca y Modelo: " + marcaModelo + " | " + "RAM: " + ram + " GB " + " | " + "HDMI: " + hdmi;
    }
    
    






























}