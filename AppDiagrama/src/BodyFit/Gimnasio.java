package BodyFit;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CEAA2201-6AC0-4792-3A32-C24F636468D1]
// </editor-fold> 
public class Gimnasio {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F0CA181B-9CA2-1106-C65F-85F42F3461A7]
    // </editor-fold> 
    private String nit;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7BC59535-E1DA-E431-3F77-4479C49DFBAD]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6006B4CA-CD4F-DFFC-E31A-BE559409A151]
    // </editor-fold> 
    private ArrayList<Persona> tiene;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D12375E-F409-3AED-5CCD-8C909BE78402]
    // </editor-fold> 
    public Gimnasio () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.98226A0A-2AEC-81B8-375A-D2423D5979C3]
    // </editor-fold> 
    public String getNit () {
        return nit;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F2418A73-06AF-6A9A-E9E3-5534FC0DC574]
    // </editor-fold> 
    public void setNit (String val) {
        this.nit = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3E1D8E2B-8129-C08E-825F-68880488F036]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C67C0531-A77A-F861-E2B9-14F2799E4BAF]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1A832E10-7E88-8297-7FCA-FE76EFE167C9]
    // </editor-fold> 
    public ArrayList<Persona> getTiene () {
        return tiene;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6F3F6764-D70D-A10A-59E0-3B9631EA3AD0]
    // </editor-fold> 
    public void setTiene (ArrayList<Persona> val) {
        this.tiene = val;
    }

}

