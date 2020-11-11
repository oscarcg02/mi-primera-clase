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
    public int getRam() {
        return ram;
    }
    
    /**
     * Devuelve si tiene HDMI
     */
    public boolean getHdmi() {
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
    public int añadirModuloRam(int añadir) {
        ram = ram + añadir;
        return ram;
    }
    
    public boolean conectarAlTelevisor() {   
        if (hdmi) {
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
        if (hdmi) {
            System.out.println("Marca y Modelo: " + marcaModelo + " | " + "RAM: " + ram + " GB " + " | " + "HDMI: " + "si");
        }
        else {
            System.out.println("Marca y Modelo: " + marcaModelo + " | " + "RAM: " + ram + " GB " + " | " + "HDMI: " + "no");
        }
    }
    
    /**
     * Devuelve la marca y modelo
     */
    public String getmostrarDetalles() {
        String hdmiSiNo = "no";
        if (hdmi) {
            hdmiSiNo = "si";
        }
        return "Marca y Modelo: " + marcaModelo + " | " + "RAM: " + ram + " GB " + " | " + "HDMI: " + hdmi;
    }
    
    






























}