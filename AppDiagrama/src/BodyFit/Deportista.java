package BodyFit;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.008E3717-B493-563A-220A-41171AEA3A74]
// </editor-fold> 
public class Deportista extends Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.220CD6AF-FC25-FA5C-6559-E70793BEA341]
    // </editor-fold> 
    private String sexo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.697A34ED-55CB-7BAD-7C7F-5AE8BF64FCB8]
    // </editor-fold> 
    private String fecha_nac;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.70735E13-D9F1-7717-79C5-938BEDD5A2B3]
    // </editor-fold> 
    private Perfil asociado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.809D01D8-7B74-0E5E-54EF-F42EF6D3E90B]
    // </editor-fold> 
    private ArrayList<Objetivo> define;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1DBBA88F-69E3-CC27-101E-652E04FC88C2]
    // </editor-fold> 
    private Rutina tiene;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2145AC9D-0751-7390-BF59-A28E7CE3C344]
    // </editor-fold> 
    public Deportista () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0CB53CEC-9B87-2788-8432-F74C2527005D]
    // </editor-fold> 
    public ArrayList<Objetivo> getDefine () {
        return define;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C435E665-F2D2-3237-FB29-A6AE10BCFE64]
    // </editor-fold> 
    public void setDefine (ArrayList<Objetivo> val) {
        this.define = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8229990-653C-5963-6043-81FDDF36CDC5]
    // </editor-fold> 
    public String getFecha_nac () {
        return fecha_nac;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB20DDD3-89CC-9022-7612-B1D71818A39E]
    // </editor-fold> 
    public void setFecha_nac (String val) {
        this.fecha_nac = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BAE26137-5353-1BD4-D85D-61678D20D98B]
    // </editor-fold> 
    public String getSexo () {
        return sexo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.507A6438-B7AB-3219-CE61-FA7A8CC532E3]
    // </editor-fold> 
    public void setSexo (String val) {
        this.sexo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A3759653-3AED-CAE3-2079-7CAE9107D7AA]
    // </editor-fold> 
    public Rutina getTiene () {
        return tiene;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96BB4F3B-82AB-B29F-C894-7F79FF0E92C1]
    // </editor-fold> 
    public void setTiene (Rutina val) {
        this.tiene = val;
    }

}

