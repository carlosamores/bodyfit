package BodyFit;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8E5F699D-DBA0-FF5A-ACAD-6EA130AF5467]
// </editor-fold> 
public class Maquina {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28C09093-1C12-F575-1E48-C75937C89557]
    // </editor-fold> 
    private int serial_maquina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.305F07D8-6601-E986-04C5-87F4C42CA4EB]
    // </editor-fold> 
    private String nombre_maq;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62752E58-8CE9-0E3B-A1DF-03F07A826D79]
    // </editor-fold> 
    private String fecha_compra;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6DB33E18-F075-BEF1-A96A-9E7245A14041]
    // </editor-fold> 
    public Maquina () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.82713AB9-CFEE-A083-DFB8-E2C0FA25C344]
    // </editor-fold> 
    public String getFecha_compra () {
        return fecha_compra;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C0673C96-BD06-74BB-6F86-59CE983F11F3]
    // </editor-fold> 
    public void setFecha_compra (String val) {
        this.fecha_compra = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.594DDEBF-1F25-FC87-C478-1827BF53BF5D]
    // </editor-fold> 
    public String getNombre_maq () {
        return nombre_maq;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D0B16A8-BD7F-C173-5428-68E144E5DC86]
    // </editor-fold> 
    public void setNombre_maq (String val) {
        this.nombre_maq = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8FC0EC04-0277-4B50-8915-201C031C385A]
    // </editor-fold> 
    public int getSerial_maquina () {
        return serial_maquina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.26E94F11-C35C-F628-76DB-D5FC395040E5]
    // </editor-fold> 
    public void setSerial_maquina (int val) {
        this.serial_maquina = val;
    }

}

