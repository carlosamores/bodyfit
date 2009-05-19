package BodyFit;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.A3F817BB-3A46-361A-3383-19A51A4D4D02]
// </editor-fold> 
public class Ejercicio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.00372BFD-EA59-C478-220B-793F0FF88880]
    // </editor-fold> 
    private int id_ejercicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.19585598-C7A1-3CBA-1A50-FCB0599A283E]
    // </editor-fold> 
    private String des_ejercicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BFACC8F-28CD-5A7A-2C6D-973C12DC21A1]
    // </editor-fold> 
    private float duracion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.739C96C2-C3E3-EC71-D36C-7C0EBFB8951C]
    // </editor-fold> 
    private String usa_maquina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.120CABFF-1E54-3F8D-FBD6-49D1EB598FA6]
    // </editor-fold> 
    private String cat_ejercicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E9B8B5F5-6117-95E8-887E-4026E1889E28]
    // </editor-fold> 
    private Maquina asocia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D3D8C1E-863D-4F92-6DC8-3FBE697E2612]
    // </editor-fold> 
    public Ejercicio () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BB92B3B2-B724-ACF7-AF15-A94AC985986C]
    // </editor-fold> 
    public Maquina getAsocia () {
        return asocia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.316F4CFD-B38E-22C3-FD64-124F55051245]
    // </editor-fold> 
    public void setAsocia (Maquina val) {
        this.asocia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.27F90F8E-7FBE-7FA7-504F-740F4C57C6BF]
    // </editor-fold> 
    public String getCat_ejercicio () {
        return cat_ejercicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CD126008-97BB-C7FF-19F6-892C5D4E3960]
    // </editor-fold> 
    public void setCat_ejercicio (String val) {
        this.cat_ejercicio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B4D1BC94-7F39-D919-91FA-454FF5E3CE07]
    // </editor-fold> 
    public String getDes_ejercicio () {
        return des_ejercicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.269F924F-394C-C44F-B56D-031B9C2407C6]
    // </editor-fold> 
    public void setDes_ejercicio (String val) {
        this.des_ejercicio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.60C53A0B-2B12-0CC7-E859-4609DB4F6F12]
    // </editor-fold> 
    public float getDuracion () {
        return duracion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54BA0B58-530A-AC6C-59F8-671E7E1BB667]
    // </editor-fold> 
    public void setDuracion (float val) {
        this.duracion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5160AE39-4D67-44E5-C3E5-21A16593F7DE]
    // </editor-fold> 
    public int getId_ejercicio () {
        return id_ejercicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.25546006-0017-618D-1D0F-A161A4DC521D]
    // </editor-fold> 
    public void setId_ejercicio (int val) {
        this.id_ejercicio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6E086143-B8F4-4234-DEB4-85851C8A7D27]
    // </editor-fold> 
    public String getUsa_maquina () {
        return usa_maquina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8CC63164-FCF8-21D5-B8D5-B8327581BF2C]
    // </editor-fold> 
    public void setUsa_maquina (String val) {
        this.usa_maquina = val;
    }

}

