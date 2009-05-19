package BodyFit;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0512E3C4-2010-4E6B-38FA-749700AA80B9]
// </editor-fold> 
public class Rutina {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D6D76437-BE2A-8970-3E38-9FAC7FEE483E]
    // </editor-fold> 
    private int id_rutina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.95C4157A-B07F-C96E-C9D4-06517479CE50]
    // </editor-fold> 
    private String des_rutina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E224442B-9626-818C-C95E-57E5AFE2DB66]
    // </editor-fold> 
    private ArrayList<Ejercicio> compuesta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BE7B3AE-B689-299D-E4BF-B3AB5E2E2937]
    // </editor-fold> 
    public Rutina () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CF5745A7-7BA5-B008-E222-8FB3AE7A4537]
    // </editor-fold> 
    public ArrayList<Ejercicio> getCompuesta () {
        return compuesta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3175E74B-00E8-6FD1-32EF-61302774B41C]
    // </editor-fold> 
    public void setCompuesta (ArrayList<Ejercicio> val) {
        this.compuesta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CBADC7EB-BDB9-4687-7FF6-52D0B75BB0C5]
    // </editor-fold> 
    public String getDes_rutina () {
        return des_rutina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1B20B81-32B0-4BCA-8CB8-ABFF8947DBE8]
    // </editor-fold> 
    public void setDes_rutina (String val) {
        this.des_rutina = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.67533844-C10E-CD70-C096-2B9C16AC024A]
    // </editor-fold> 
    public int getId_rutina () {
        return id_rutina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.47B0E67A-E7B8-8E02-59E1-FEF57AF1599F]
    // </editor-fold> 
    public void setId_rutina (int val) {
        this.id_rutina = val;
    }

}

