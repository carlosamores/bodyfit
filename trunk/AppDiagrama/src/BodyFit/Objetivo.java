package BodyFit;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E17C7B87-28B8-8D4A-F285-CA1817F619B7]
// </editor-fold> 
public class Objetivo {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B22067CB-6B6F-3C3F-353F-8EF16C681E38]
    // </editor-fold> 
    private int id_obj;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.214E854A-8CD3-7918-675A-7899668EFDE3]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FCDDD87D-DF93-ABC8-FB90-C0C1862785AE]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5C738716-8EAD-C34F-4B1F-EB98915D4EC5]
    // </editor-fold> 
    private Rutina asocia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C6B2A305-65AC-E792-26E2-2FFB29E7F6AB]
    // </editor-fold> 
    public Objetivo () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9DB30323-2FD3-0726-3A8E-1FAD4D5386BA]
    // </editor-fold> 
    public Rutina getAsocia () {
        return asocia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8B113A8E-E72B-DC67-16EC-4D10FB993B15]
    // </editor-fold> 
    public void setAsocia (Rutina val) {
        this.asocia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.45FDECCF-AE1B-8BF8-ACF4-92A105762A64]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6DEF29A8-B486-77BF-2D6B-AA47102F5230]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.810AB878-27F6-EB68-E7CD-0C916B68D30B]
    // </editor-fold> 
    public int getId_obj () {
        return id_obj;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4EC98AE8-FEA3-E354-393E-3A5C9A4EBBDE]
    // </editor-fold> 
    public void setId_obj (int val) {
        this.id_obj = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4889915-EC0D-018D-F059-A0006AF012BE]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A08E3CB5-A1F0-09CD-F4FC-F84D8C93CAD1]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

}

