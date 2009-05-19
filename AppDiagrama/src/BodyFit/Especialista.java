package BodyFit;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F3E1A4C0-9514-B5E7-CAFF-B628C19CD7EA]
// </editor-fold> 
public class Especialista extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E82A5E4-9FE1-EB0B-1A72-CB247AF5360A]
    // </editor-fold> 
    private String profesion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E5BD1E8-055D-CF9A-F275-F3237AF3377D]
    // </editor-fold> 
    private String fecha_ing;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.98A1C108-9E53-77F2-9CD7-27D749B9A67D]
    // </editor-fold> 
    private ArrayList<Rutina> define;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1C477277-9FA4-F1DA-551D-D12AC059E5D8]
    // </editor-fold> 
    public Especialista () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DE5034C-8428-E9A5-17C2-1DD5759179DD]
    // </editor-fold> 
    public ArrayList<Rutina> getDefine () {
        return define;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D31488A3-6CDF-626E-5816-CD829154EB09]
    // </editor-fold> 
    public void setDefine (ArrayList<Rutina> val) {
        this.define = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D508F421-20CA-729F-AD6A-96C10B296E92]
    // </editor-fold> 
    public String getFecha_ing () {
        return fecha_ing;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1793CA3F-847D-D480-E2F1-CB2513C64BAD]
    // </editor-fold> 
    public void setFecha_ing (String val) {
        this.fecha_ing = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FCACEC74-B523-BC5E-C292-C549AE33C7A5]
    // </editor-fold> 
    public String getProfesion () {
        return profesion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6F0DEDC2-29F4-5A5A-6685-0DBA76D84D2E]
    // </editor-fold> 
    public void setProfesion (String val) {
        this.profesion = val;
    }

}

