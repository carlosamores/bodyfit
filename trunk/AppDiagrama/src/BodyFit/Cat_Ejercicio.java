package BodyFit;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.62B67ED9-88FA-D9B3-060A-898E4A196875]
// </editor-fold> 
public class Cat_Ejercicio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F960ABE8-DCBA-6CF1-7818-4C56331A15A7]
    // </editor-fold> 
    private int id_categoria;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.71B51486-5E8A-162E-B30C-5C7A83211DE7]
    // </editor-fold> 
    private String nombre_cat;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4CD6DC8-AD25-A005-C91F-52F019473FEE]
    // </editor-fold> 
    private Ejercicio pertenece;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.94682833-4E38-D887-76DA-2B42460F32FE]
    // </editor-fold> 
    public Cat_Ejercicio () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CE8E2808-6A42-D424-02EF-C4A078C6D42B]
    // </editor-fold> 
    public int getId_categoria () {
        return id_categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24AEF932-C568-0B37-F171-B0D89936B823]
    // </editor-fold> 
    public void setId_categoria (int val) {
        this.id_categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CD58F2CA-6F94-0B6E-F717-B3AC3B32D92A]
    // </editor-fold> 
    public String getNombre_cat () {
        return nombre_cat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8042616E-1A12-EEA3-D14B-D17E13B81AB3]
    // </editor-fold> 
    public void setNombre_cat (String val) {
        this.nombre_cat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1181B110-A8AB-C992-02B2-522E645E06A2]
    // </editor-fold> 
    public Ejercicio getPertenece () {
        return pertenece;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3650388A-028F-2A2F-34EB-4449A260C528]
    // </editor-fold> 
    public void setPertenece (Ejercicio val) {
        this.pertenece = val;
    }

}

