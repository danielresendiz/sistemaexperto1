/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadragon;

import Rule.*;

/**
 *
 * @author erick
 */
public class BaseDeConocimientos {

    BooleanRuleBase baseDeDatos = new BooleanRuleBase("Base de Reglas");

    private RuleVariable genero;
    private Condition igual;
    //------------------VARIABLES MUJER-------------------
    private RuleVariable humana;
    private RuleVariable parejaSayan;
    private RuleVariable rubia;
    private RuleVariable cabelloOscuroF;
    private RuleVariable vuelaF;
    //------------------VARIABLES HOMBRES SIN CABELLO-------------------
    private RuleVariable cabello;
    private RuleVariable humano;
    private RuleVariable mejoramigo;
    private RuleVariable maestro;
    private RuleVariable pequenio;
    private RuleVariable viejo;
    private RuleVariable villano;
    private RuleVariable viejoP;
    private RuleVariable ganoGoku;
    private RuleVariable animal;
    private RuleVariable emperador;
    private RuleVariable transforma;
    private RuleVariable regeneracion;
    private RuleVariable vuela;
    //-------------------VARIABLES HOMBRES CON CABELLO-----------------
    private RuleVariable sayan;
    private RuleVariable razapura;
    private RuleVariable humanoHC;
    private RuleVariable superSayan;
    private RuleVariable derrotaCell;
    private RuleVariable muerto;
    private RuleVariable hermanos;
    private RuleVariable cabelloOscuro;
    private RuleVariable fusion;
    private RuleVariable luchaFrezeer;
    private RuleVariable fusionNP;
    private RuleVariable aretes;
    private RuleVariable ropaNaranja;
    private RuleVariable amigoGoku;

    //------------------RESULTADOS MUJER-------------------
    private RuleVariable resGenero;
    private RuleVariable resHumana;
    private RuleVariable resPareja;
    private RuleVariable resRubia;
    private RuleVariable resCabelloOscuroF;
    private RuleVariable resVuelaF;
    //------------------RESULTADOS HOMBRE SIN CABELLO------------------
    private RuleVariable resCabello;
    private RuleVariable resHumano;
    private RuleVariable resMejoramigo;
    private RuleVariable resMaestro;
    private RuleVariable resPequenio;
    private RuleVariable resViejo;
    private RuleVariable resVillano;
    private RuleVariable resViejoP;
    private RuleVariable resGanoGoku;
    private RuleVariable resAnimal;
    private RuleVariable resEmperador;
    private RuleVariable resTransforma;
    private RuleVariable resRegeneracion;
    private RuleVariable resVuela;
    //--------------------RESULTADOS HOMBRES CON CABELLO---------------------
    private RuleVariable resSayan;
    private RuleVariable resRazapura;
    private RuleVariable resHumanoHC;
    private RuleVariable resSuperSayan;
    private RuleVariable resDerrotaCell;
    private RuleVariable resMuerto;
    private RuleVariable resHermanos;
    private RuleVariable resCabelloOscuro;
    private RuleVariable resFusion;
    private RuleVariable resLuchaFrezeer;
    private RuleVariable resFusionNP;
    private RuleVariable resAretes;
    private RuleVariable resRopaNaranja;
    private RuleVariable resAmigoGoku;

    public BooleanRuleBase getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(BooleanRuleBase baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public RuleVariable getGenero() {
        return genero;
    }

    public void setGenero(RuleVariable genero) {
        this.genero = genero;
    }

    public Condition getIgual() {
        return igual;
    }

    public void setIgual(Condition igual) {
        this.igual = igual;
    }

    public RuleVariable getHumana() {
        return humana;
    }

    public void setHumana(RuleVariable humana) {
        this.humana = humana;
    }

    public RuleVariable getParejaSayan() {
        return parejaSayan;
    }

    public void setParejaSayan(RuleVariable parejaSayan) {
        this.parejaSayan = parejaSayan;
    }

    public RuleVariable getRubia() {
        return rubia;
    }

    public void setRubia(RuleVariable rubia) {
        this.rubia = rubia;
    }

    public RuleVariable getCabelloOscuroF() {
        return cabelloOscuroF;
    }

    public void setCabelloOscuroF(RuleVariable cabelloOscuroF) {
        this.cabelloOscuroF = cabelloOscuroF;
    }

    public RuleVariable getVuelaF() {
        return vuelaF;
    }

    public void setVuelaF(RuleVariable vuelaF) {
        this.vuelaF = vuelaF;
    }

    public RuleVariable getResGenero() {
        return resGenero;
    }

    public void setResGenero(RuleVariable resGenero) {
        this.resGenero = resGenero;
    }

    public RuleVariable getResHumana() {
        return resHumana;
    }

    public void setResHumana(RuleVariable resHumana) {
        this.resHumana = resHumana;
    }

    public RuleVariable getResPareja() {
        return resPareja;
    }

    public void setResPareja(RuleVariable resPareja) {
        this.resPareja = resPareja;
    }

    public RuleVariable getResRubia() {
        return resRubia;
    }

    public void setResRubia(RuleVariable resRubia) {
        this.resRubia = resRubia;
    }

    public RuleVariable getResCabelloOscuroF() {
        return resCabelloOscuroF;
    }

    public void setResCabelloOscuroF(RuleVariable resCabelloOscuroF) {
        this.resCabelloOscuroF = resCabelloOscuroF;
    }

    public RuleVariable getResVuelaF() {
        return resVuelaF;
    }

    public void setResVuelaF(RuleVariable resVuelaF) {
        this.resVuelaF = resVuelaF;
    }

    public RuleVariable getCabello() {
        return cabello;
    }

    public void setCabello(RuleVariable cabello) {
        this.cabello = cabello;
    }

    public RuleVariable getHumano() {
        return humano;
    }

    public void setHumano(RuleVariable humano) {
        this.humano = humano;
    }

    public RuleVariable getMejoramigo() {
        return mejoramigo;
    }

    public void setMejoramigo(RuleVariable mejoramigo) {
        this.mejoramigo = mejoramigo;
    }

    public RuleVariable getMaestro() {
        return maestro;
    }

    public void setMaestro(RuleVariable maestro) {
        this.maestro = maestro;
    }

    public RuleVariable getPequenio() {
        return pequenio;
    }

    public void setPequenio(RuleVariable pequenio) {
        this.pequenio = pequenio;
    }

    public RuleVariable getViejo() {
        return viejo;
    }

    public void setViejo(RuleVariable viejo) {
        this.viejo = viejo;
    }

    public RuleVariable getVillano() {
        return villano;
    }

    public void setVillano(RuleVariable villano) {
        this.villano = villano;
    }

    public RuleVariable getViejoP() {
        return viejoP;
    }

    public void setViejoP(RuleVariable viejoP) {
        this.viejoP = viejoP;
    }

    public RuleVariable getGanoGoku() {
        return ganoGoku;
    }

    public void setGanoGoku(RuleVariable ganoGoku) {
        this.ganoGoku = ganoGoku;
    }

    public RuleVariable getAnimal() {
        return animal;
    }

    public void setAnimal(RuleVariable animal) {
        this.animal = animal;
    }

    public RuleVariable getEmperador() {
        return emperador;
    }

    public void setEmperador(RuleVariable emperador) {
        this.emperador = emperador;
    }

    public RuleVariable getTransforma() {
        return transforma;
    }

    public void setTransforma(RuleVariable transforma) {
        this.transforma = transforma;
    }

    public RuleVariable getRegeneracion() {
        return regeneracion;
    }

    public void setRegeneracion(RuleVariable regeneracion) {
        this.regeneracion = regeneracion;
    }

    public RuleVariable getVuela() {
        return vuela;
    }

    public void setVuela(RuleVariable vuela) {
        this.vuela = vuela;
    }

    public RuleVariable getSayan() {
        return sayan;
    }

    public void setSayan(RuleVariable sayan) {
        this.sayan = sayan;
    }

    public RuleVariable getResCabello() {
        return resCabello;
    }

    public void setResCabello(RuleVariable resCabello) {
        this.resCabello = resCabello;
    }

    public RuleVariable getResHumano() {
        return resHumano;
    }

    public void setResHumano(RuleVariable resHumano) {
        this.resHumano = resHumano;
    }

    public RuleVariable getResMejoramigo() {
        return resMejoramigo;
    }

    public void setResMejoramigo(RuleVariable resMejoramigo) {
        this.resMejoramigo = resMejoramigo;
    }

    public RuleVariable getResMaestro() {
        return resMaestro;
    }

    public void setResMaestro(RuleVariable resMaestro) {
        this.resMaestro = resMaestro;
    }

    public RuleVariable getResPequenio() {
        return resPequenio;
    }

    public void setResPequenio(RuleVariable resPequenio) {
        this.resPequenio = resPequenio;
    }

    public RuleVariable getResViejo() {
        return resViejo;
    }

    public void setResViejo(RuleVariable resViejo) {
        this.resViejo = resViejo;
    }

    public RuleVariable getResVillano() {
        return resVillano;
    }

    public void setResVillano(RuleVariable resVillano) {
        this.resVillano = resVillano;
    }

    public RuleVariable getResViejoP() {
        return resViejoP;
    }

    public void setResViejoP(RuleVariable resViejoP) {
        this.resViejoP = resViejoP;
    }

    public RuleVariable getResGanoGoku() {
        return resGanoGoku;
    }

    public void setResGanoGoku(RuleVariable resGanoGoku) {
        this.resGanoGoku = resGanoGoku;
    }

    public RuleVariable getResAnimal() {
        return resAnimal;
    }

    public void setResAnimal(RuleVariable resAnimal) {
        this.resAnimal = resAnimal;
    }

    public RuleVariable getResEmperador() {
        return resEmperador;
    }

    public void setResEmperador(RuleVariable resEmperador) {
        this.resEmperador = resEmperador;
    }

    public RuleVariable getResTransforma() {
        return resTransforma;
    }

    public void setResTransforma(RuleVariable resTransforma) {
        this.resTransforma = resTransforma;
    }

    public RuleVariable getResRegeneracion() {
        return resRegeneracion;
    }

    public void setResRegeneracion(RuleVariable resRegeneracion) {
        this.resRegeneracion = resRegeneracion;
    }

    public RuleVariable getResVuela() {
        return resVuela;
    }

    public void setResVuela(RuleVariable resVuela) {
        this.resVuela = resVuela;
    }

    public RuleVariable getResSayan() {
        return resSayan;
    }

    public void setResSayan(RuleVariable resSayan) {
        this.resSayan = resSayan;
    }

    public RuleVariable getRazapura() {
        return razapura;
    }

    public void setRazapura(RuleVariable razapura) {
        this.razapura = razapura;
    }

    public RuleVariable getHumanoHC() {
        return humanoHC;
    }

    public void setHumanoHC(RuleVariable humanoHC) {
        this.humanoHC = humanoHC;
    }

    public RuleVariable getSuperSayan() {
        return superSayan;
    }

    public void setSuperSayan(RuleVariable superSayan) {
        this.superSayan = superSayan;
    }

    public RuleVariable getDerrotaCell() {
        return derrotaCell;
    }

    public void setDerrotaCell(RuleVariable derrotaCell) {
        this.derrotaCell = derrotaCell;
    }

    public RuleVariable getMuerto() {
        return muerto;
    }

    public void setMuerto(RuleVariable muerto) {
        this.muerto = muerto;
    }

    public RuleVariable getHermanos() {
        return hermanos;
    }

    public void setHermanos(RuleVariable hermanos) {
        this.hermanos = hermanos;
    }

    public RuleVariable getCabelloOscuro() {
        return cabelloOscuro;
    }

    public void setCabelloOscuro(RuleVariable cabelloOscuro) {
        this.cabelloOscuro = cabelloOscuro;
    }

    public RuleVariable getFusion() {
        return fusion;
    }

    public void setFusion(RuleVariable fusion) {
        this.fusion = fusion;
    }

    public RuleVariable getLuchaFrezeer() {
        return luchaFrezeer;
    }

    public void setLuchaFrezeer(RuleVariable luchaFrezeer) {
        this.luchaFrezeer = luchaFrezeer;
    }

    public RuleVariable getFusionNP() {
        return fusionNP;
    }

    public void setFusionNP(RuleVariable fusionNP) {
        this.fusionNP = fusionNP;
    }

    public RuleVariable getAretes() {
        return aretes;
    }

    public void setAretes(RuleVariable aretes) {
        this.aretes = aretes;
    }

    public RuleVariable getRopaNaranja() {
        return ropaNaranja;
    }

    public void setRopaNaranja(RuleVariable ropaNaranja) {
        this.ropaNaranja = ropaNaranja;
    }

    public RuleVariable getAmigoGoku() {
        return amigoGoku;
    }

    public void setAmigoGoku(RuleVariable amigoGoku) {
        this.amigoGoku = amigoGoku;
    }

    public RuleVariable getResRazapura() {
        return resRazapura;
    }

    public void setResRazapura(RuleVariable resRazapura) {
        this.resRazapura = resRazapura;
    }

    public RuleVariable getResHumanoHC() {
        return resHumanoHC;
    }

    public void setResHumanoHC(RuleVariable resHumanoHC) {
        this.resHumanoHC = resHumanoHC;
    }

    public RuleVariable getResSuperSayan() {
        return resSuperSayan;
    }

    public void setResSuperSayan(RuleVariable resSuperSayan) {
        this.resSuperSayan = resSuperSayan;
    }

    public RuleVariable getResDerrotaCell() {
        return resDerrotaCell;
    }

    public void setResDerrotaCell(RuleVariable resDerrotaCell) {
        this.resDerrotaCell = resDerrotaCell;
    }

    public RuleVariable getResMuerto() {
        return resMuerto;
    }

    public void setResMuerto(RuleVariable resMuerto) {
        this.resMuerto = resMuerto;
    }

    public RuleVariable getResHermanos() {
        return resHermanos;
    }

    public void setResHermanos(RuleVariable resHermanos) {
        this.resHermanos = resHermanos;
    }

    public RuleVariable getResCabelloOscuro() {
        return resCabelloOscuro;
    }

    public void setResCabelloOscuro(RuleVariable resCabelloOscuro) {
        this.resCabelloOscuro = resCabelloOscuro;
    }

    public RuleVariable getResFusion() {
        return resFusion;
    }

    public void setResFusion(RuleVariable resFusion) {
        this.resFusion = resFusion;
    }

    public RuleVariable getResLuchaFrezeer() {
        return resLuchaFrezeer;
    }

    public void setResLuchaFrezeer(RuleVariable resLuchaFrezeer) {
        this.resLuchaFrezeer = resLuchaFrezeer;
    }

    public RuleVariable getResFusionNP() {
        return resFusionNP;
    }

    public void setResFusionNP(RuleVariable resFusionNP) {
        this.resFusionNP = resFusionNP;
    }

    public RuleVariable getResAretes() {
        return resAretes;
    }

    public void setResAretes(RuleVariable resAretes) {
        this.resAretes = resAretes;
    }

    public RuleVariable getResRopaNaranja() {
        return resRopaNaranja;
    }

    public void setResRopaNaranja(RuleVariable resRopaNaranja) {
        this.resRopaNaranja = resRopaNaranja;
    }

    public RuleVariable getResAmigoGoku() {
        return resAmigoGoku;
    }

    public void setResAmigoGoku(RuleVariable resAmigoGoku) {
        this.resAmigoGoku = resAmigoGoku;
    }

    public BaseDeConocimientos() {
        genero = new RuleVariable(baseDeDatos, "");
        igual = new Condition("=");
        //------------------VARIABLES MUJER-------------------
        humana = new RuleVariable(baseDeDatos, "");
        parejaSayan = new RuleVariable(baseDeDatos, "");
        rubia = new RuleVariable(baseDeDatos, "");
        cabelloOscuroF = new RuleVariable(baseDeDatos, "");
        vuelaF = new RuleVariable(baseDeDatos, "");
        //------------------VARIABLES HOMBRE SIN CABELLO-------------------
        cabello = new RuleVariable(baseDeDatos, "");
        humano = new RuleVariable(baseDeDatos, "");
        mejoramigo = new RuleVariable(baseDeDatos, "");
        maestro = new RuleVariable(baseDeDatos, "");
        pequenio = new RuleVariable(baseDeDatos, "");
        viejo = new RuleVariable(baseDeDatos, "");
        villano = new RuleVariable(baseDeDatos, "");
        viejoP = new RuleVariable(baseDeDatos, "");
        ganoGoku = new RuleVariable(baseDeDatos, "");
        animal = new RuleVariable(baseDeDatos, "");
        emperador = new RuleVariable(baseDeDatos, "");
        transforma = new RuleVariable(baseDeDatos, "");
        regeneracion = new RuleVariable(baseDeDatos, "");
        vuela = new RuleVariable(baseDeDatos, "");
        //------------------VARIABLES HOMBRE CON CABELLO-------------------
        sayan = new RuleVariable(baseDeDatos, "");
        razapura = new RuleVariable(baseDeDatos, "");
        humanoHC = new RuleVariable(baseDeDatos, "");
        superSayan = new RuleVariable(baseDeDatos, "");
        derrotaCell = new RuleVariable(baseDeDatos, "");
        muerto = new RuleVariable(baseDeDatos, "");
        hermanos = new RuleVariable(baseDeDatos, "");
        cabelloOscuro = new RuleVariable(baseDeDatos, "");
        fusion = new RuleVariable(baseDeDatos, "");
        luchaFrezeer = new RuleVariable(baseDeDatos, "");
        fusionNP = new RuleVariable(baseDeDatos, "");
        aretes = new RuleVariable(baseDeDatos, "");
        ropaNaranja = new RuleVariable(baseDeDatos, "");
        amigoGoku = new RuleVariable(baseDeDatos, "");
        //------------------RESULTADOS MUJER-------------------
        resGenero = new RuleVariable(baseDeDatos, "");
        resHumana = new RuleVariable(baseDeDatos, "");
        resPareja = new RuleVariable(baseDeDatos, "");
        resRubia = new RuleVariable(baseDeDatos, "");
        resCabelloOscuroF = new RuleVariable(baseDeDatos, "");
        resVuelaF = new RuleVariable(baseDeDatos, "");
        //------------------RESULTADOS HOMBRE SIN CABELLO-------------------
        resCabello = new RuleVariable(baseDeDatos, "");
        resHumano = new RuleVariable(baseDeDatos, "");
        resMejoramigo = new RuleVariable(baseDeDatos, "");
        resMaestro = new RuleVariable(baseDeDatos, "");
        resPequenio = new RuleVariable(baseDeDatos, "");
        resViejo = new RuleVariable(baseDeDatos, "");
        resVillano = new RuleVariable(baseDeDatos, "");
        resViejoP = new RuleVariable(baseDeDatos, "");
        resGanoGoku = new RuleVariable(baseDeDatos, "");
        resAnimal = new RuleVariable(baseDeDatos, "");
        resEmperador = new RuleVariable(baseDeDatos, "");
        resTransforma = new RuleVariable(baseDeDatos, "");
        resRegeneracion = new RuleVariable(baseDeDatos, "");
        resVuela = new RuleVariable(baseDeDatos, "");
        //------------------RESULTADOS HOMBRE CON CABELLO-------------------
        resSayan = new RuleVariable(baseDeDatos, "");
        resRazapura = new RuleVariable(baseDeDatos, "");
        resHumanoHC = new RuleVariable(baseDeDatos, "");
        resSuperSayan = new RuleVariable(baseDeDatos, "");
        resDerrotaCell = new RuleVariable(baseDeDatos, "");
        resMuerto = new RuleVariable(baseDeDatos, "");
        resHermanos = new RuleVariable(baseDeDatos, "");
        resCabelloOscuro = new RuleVariable(baseDeDatos, "");
        resFusion = new RuleVariable(baseDeDatos, "");
        resLuchaFrezeer = new RuleVariable(baseDeDatos, "");
        resFusionNP = new RuleVariable(baseDeDatos, "");
        resAretes = new RuleVariable(baseDeDatos, "");
        resRopaNaranja = new RuleVariable(baseDeDatos, "");
        resAmigoGoku = new RuleVariable(baseDeDatos, "");
    }

    public void reglas() {
        //-----------------REGLA PIVOTE--------------------
        Rule r1 = new Rule(baseDeDatos, "ReglaUno",
                new Clause[]{
                    new Clause(this.genero, this.igual, "Hombre")
                },
                new Clause(this.resGenero, this.igual, "Es Hombre"));
        //-----------------REGLA MUJER---------------------
        //Es Mujer??
        Rule r2 = new Rule(baseDeDatos, "ReglaDos",
                new Clause[]{
                    new Clause(this.genero, this.igual, "Mujer")
                },
                new Clause(this.resGenero, this.igual, "Es Mujer"));

        //Es Humana??
        Rule r3 = new Rule(baseDeDatos, "ReglaTres",
                new Clause[]{
                    new Clause(this.resGenero, this.igual, "Es Mujer"),
                    new Clause(this.humana, this.igual, "Si")
                },
                new Clause(this.resHumana, this.igual, "Si"));
        Rule r4 = new Rule(baseDeDatos, "ReglaCuatro",
                new Clause[]{
                    new Clause(this.resGenero, this.igual, "Es Mujer"),
                    new Clause(this.humana, this.igual, "No")
                },
                new Clause(this.resHumana, this.igual, "No"));
        //Es Novia de Sayan??
        Rule r5 = new Rule(baseDeDatos, "ReglaCinco",
                new Clause[]{
                    new Clause(this.resHumana, this.igual, "Si"),
                    new Clause(this.parejaSayan, this.igual, "Si")
                },
                new Clause(this.resPareja, this.igual, "Si"));
        Rule r6 = new Rule(baseDeDatos, "ReglaSeis",
                new Clause[]{
                    new Clause(this.resHumana, this.igual, "Si"),
                    new Clause(this.parejaSayan, this.igual, "No")
                },
                new Clause(this.resPareja, this.igual, "EL PERSONAJE ES MARRON"));
        //Es Rubia??
        Rule r7 = new Rule(baseDeDatos, "ReglaSiete",
                new Clause[]{
                    new Clause(this.resHumana, this.igual, "No"),
                    new Clause(this.rubia, this.igual, "No")
                },
                new Clause(this.resRubia, this.igual, "EL PERSONAJE ES PAN"));
        Rule r8 = new Rule(baseDeDatos, "ReglaOcho",
                new Clause[]{
                    new Clause(this.resHumana, this.igual, "No"),
                    new Clause(this.rubia, this.igual, "Si")
                },
                new Clause(this.resRubia, this.igual, "EL PERSONAJE ES NUMERO 18"));
        //Cabello oscuro??
        Rule r9 = new Rule(baseDeDatos, "ReglaNueve",
                new Clause[]{
                    new Clause(this.resPareja, this.igual, "Si"),
                    new Clause(this.cabelloOscuroF, this.igual, "Si")
                },
                new Clause(this.resCabelloOscuroF, this.igual, "Si"));
        Rule r10 = new Rule(baseDeDatos, "ReglaDiez",
                new Clause[]{
                    new Clause(this.resPareja, this.igual, "Si"),
                    new Clause(this.cabelloOscuroF, this.igual, "No")
                },
                new Clause(this.resCabelloOscuroF, this.igual, "EL PERSONAJE ES BULMA"));
        //Vuela??
        Rule r11 = new Rule(baseDeDatos, "ReglaOnce",
                new Clause[]{
                    new Clause(this.resCabelloOscuroF, this.igual, "Si"),
                    new Clause(this.vuelaF, this.igual, "Si")
                },
                new Clause(this.resVuelaF, this.igual, "EL PERSONAJE ES VIDEL"));
        Rule r12 = new Rule(baseDeDatos, "ReglaDoce",
                new Clause[]{
                    new Clause(this.resCabelloOscuroF, this.igual, "Si"),
                    new Clause(this.vuelaF, this.igual, "No")
                },
                new Clause(this.resVuelaF, this.igual, "EL PERSONAJE ES MILK"));
        //-----------------------REGLAS HOMBRES SIN CABELLO------------------------------
        //Tiene cabello??
        Rule r13 = new Rule(baseDeDatos, "ReglaCatorce",
                new Clause[]{
                    new Clause(this.resGenero, this.igual, "Es Hombre"),
                    new Clause(this.cabello, this.igual, "Si")
                },
                new Clause(this.resCabello, this.igual, "Si"));
        Rule r14 = new Rule(baseDeDatos, "ReglaTrece",
                new Clause[]{
                    new Clause(this.resGenero, this.igual, "Es Hombre"),
                    new Clause(this.cabello, this.igual, "No")
                },
                new Clause(this.resCabello, this.igual, "No"));
        //Es Humano??
        Rule r15 = new Rule(baseDeDatos, "ReglaQuince",
                new Clause[]{
                    new Clause(this.resCabello, this.igual, "No"),
                    new Clause(this.humano, this.igual, "Si")
                },
                new Clause(this.resHumano, this.igual, "Si"));
        Rule r16 = new Rule(baseDeDatos, "ReglaDieciseis",
                new Clause[]{
                    new Clause(this.resCabello, this.igual, "No"),
                    new Clause(this.humano, this.igual, "No")
                },
                new Clause(this.resHumano, this.igual, "No"));
        //Es mejor amigo de goku??
        Rule r17 = new Rule(baseDeDatos, "ReglaDiecisiete",
                new Clause[]{
                    new Clause(this.resHumano, this.igual, "Si"),
                    new Clause(this.mejoramigo, this.igual, "Si")
                },
                new Clause(this.resMejoramigo, this.igual, "EL PERSONAJE ES KRILLIN"));
        Rule r18 = new Rule(baseDeDatos, "ReglaDieciocho",
                new Clause[]{
                    new Clause(this.resHumano, this.igual, "Si"),
                    new Clause(this.mejoramigo, this.igual, "No")
                },
                new Clause(this.resMejoramigo, this.igual, "No"));
        //Fue Maestro??
        Rule r19 = new Rule(baseDeDatos, "ReglaDiecinueve",
                new Clause[]{
                    new Clause(this.resHumano, this.igual, "No"),
                    new Clause(this.maestro, this.igual, "No")
                },
                new Clause(this.resMaestro, this.igual, "No"));
        Rule r20 = new Rule(baseDeDatos, "ReglaVeinte",
                new Clause[]{
                    new Clause(this.resHumano, this.igual, "No"),
                    new Clause(this.maestro, this.igual, "Si")
                },
                new Clause(this.resMaestro, this.igual, "Si"));
        //Es Pequeño??
        Rule r21 = new Rule(baseDeDatos, "ReglaVeintiuno",
                new Clause[]{
                    new Clause(this.resMejoramigo, this.igual, "No"),
                    new Clause(this.pequenio, this.igual, "Si")
                },
                new Clause(this.resPequenio, this.igual, "EL PERSONAJE ES CHAOS"));
        Rule r22 = new Rule(baseDeDatos, "ReglaVeintidos",
                new Clause[]{
                    new Clause(this.resMejoramigo, this.igual, "No"),
                    new Clause(this.pequenio, this.igual, "No")
                },
                new Clause(this.resPequenio, this.igual, "No"));
        //Es Viejo??
        Rule r23 = new Rule(baseDeDatos, "ReglaVeintitres",
                new Clause[]{
                    new Clause(this.resMaestro, this.igual, "Si"),
                    new Clause(this.viejo, this.igual, "Si")
                },
                new Clause(this.resViejo, this.igual, "EL PERSONAJE ES KAMI-SAMA"));
        Rule r24 = new Rule(baseDeDatos, "ReglaVeinticuatro",
                new Clause[]{
                    new Clause(this.resMaestro, this.igual, "Si"),
                    new Clause(this.viejo, this.igual, "No")
                },
                new Clause(this.resViejo, this.igual, "EL PERSONAJE ES PICORO"));
        //Es un Villano
        Rule r25 = new Rule(baseDeDatos, "ReglaVeinticinco",
                new Clause[]{
                    new Clause(this.resMaestro, this.igual, "No"),
                    new Clause(this.villano, this.igual, "Si")
                },
                new Clause(this.resVillano, this.igual, "Si"));
        Rule r26 = new Rule(baseDeDatos, "ReglaVeintiseis",
                new Clause[]{
                    new Clause(this.resMaestro, this.igual, "No"),
                    new Clause(this.villano, this.igual, "No")
                },
                new Clause(this.resVillano, this.igual, "No"));
        //ES VIEJO PEQUEÑO??
        Rule r27 = new Rule(baseDeDatos, "ReglaVeintisiete",
                new Clause[]{
                    new Clause(this.resPequenio, this.igual, "No"),
                    new Clause(this.viejoP, this.igual, "Si")
                },
                new Clause(this.resViejoP, this.igual, "EL PERSONAJE ES EL MAESTRO ROSHI"));
        Rule r28 = new Rule(baseDeDatos, "ReglaVeintiocho",
                new Clause[]{
                    new Clause(this.resPequenio, this.igual, "No"),
                    new Clause(this.viejoP, this.igual, "No")
                },
                new Clause(this.resViejoP, this.igual, "EL PERSONAJE ES TEN SHIN HAN"));
        //Lo vencio goku??
        Rule r29 = new Rule(baseDeDatos, "ReglaVeintinueve",
                new Clause[]{
                    new Clause(this.resVillano, this.igual, "Si"),
                    new Clause(this.ganoGoku, this.igual, "Si")
                },
                new Clause(this.resGanoGoku, this.igual, "Si"));
        Rule r30 = new Rule(baseDeDatos, "ReglaTreinta",
                new Clause[]{
                    new Clause(this.resVillano, this.igual, "Si"),
                    new Clause(this.ganoGoku, this.igual, "No")
                },
                new Clause(this.resGanoGoku, this.igual, "EL PERSONAJE ES CELL"));
        //Es un animal??
        Rule r31 = new Rule(baseDeDatos, "ReglaTreintayuno",
                new Clause[]{
                    new Clause(this.resVillano, this.igual, "No"),
                    new Clause(this.animal, this.igual, "Si")
                },
                new Clause(this.resAnimal, this.igual, "Si"));
        Rule r32 = new Rule(baseDeDatos, "ReglaTreintaydos",
                new Clause[]{
                    new Clause(this.resVillano, this.igual, "No"),
                    new Clause(this.animal, this.igual, "No")
                },
                new Clause(this.resAnimal, this.igual, "EL PERSONAJE ES MR. POPO"));
        //Es emperador espacial??
        Rule r33 = new Rule(baseDeDatos, "ReglaTreintaytres",
                new Clause[]{
                    new Clause(this.resGanoGoku, this.igual, "Si"),
                    new Clause(this.emperador, this.igual, "Si")
                },
                new Clause(this.resEmperador, this.igual, "EL PERSONAJE ES FREZEER"));
        Rule r34 = new Rule(baseDeDatos, "ReglaTreintaycuatro",
                new Clause[]{
                    new Clause(this.resGanoGoku, this.igual, "Si"),
                    new Clause(this.emperador, this.igual, "No")
                },
                new Clause(this.resEmperador, this.igual, "No"));
        //Se Transforma??
        Rule r35 = new Rule(baseDeDatos, "ReglaTreintaycinco",
                new Clause[]{
                    new Clause(this.resAnimal, this.igual, "Si"),
                    new Clause(this.transforma, this.igual, "Si")
                },
                new Clause(this.resTransforma, this.igual, "Si"));
        Rule r36 = new Rule(baseDeDatos, "ReglaTreintayseis",
                new Clause[]{
                    new Clause(this.resAnimal, this.igual, "Si"),
                    new Clause(this.transforma, this.igual, "No")
                },
                new Clause(this.resTransforma, this.igual, "EL PERSONAJE ES SHEN LONG"));
        //Se Regenera??
        Rule r37 = new Rule(baseDeDatos, "ReglaTreintaysiete",
                new Clause[]{
                    new Clause(this.resEmperador, this.igual, "No"),
                    new Clause(this.regeneracion, this.igual, "Si")
                },
                new Clause(this.resRegeneracion, this.igual, "EL PERSONAJE ES MAJIN BOO"));
        Rule r38 = new Rule(baseDeDatos, "ReglaTreintayocho",
                new Clause[]{
                    new Clause(this.resEmperador, this.igual, "No"),
                    new Clause(this.regeneracion, this.igual, "No")
                },
                new Clause(this.resRegeneracion, this.igual, "EL PERSONAJE ES NAPA"));
        //VUELA??
        Rule r39 = new Rule(baseDeDatos, "ReglaTreintaynueve",
                new Clause[]{
                    new Clause(this.resTransforma, this.igual, "Si"),
                    new Clause(this.vuela, this.igual, "Si")
                },
                new Clause(this.resVuela, this.igual, "EL PERSONAJE ES PUAR"));
        Rule r40 = new Rule(baseDeDatos, "ReglaCuarenta",
                new Clause[]{
                    new Clause(this.resTransforma, this.igual, "Si"),
                    new Clause(this.vuela, this.igual, "No")
                },
                new Clause(this.resVuela, this.igual, "EL PERSONAJE ES ULONG"));
        //----------------------REGLAS HOMBRES-----------------------------
        //Es SAyan??
        Rule r41 = new Rule(baseDeDatos, "ReglaCuarentayuno",
                new Clause[]{
                    new Clause(this.resCabello, this.igual, "Si"),
                    new Clause(this.sayan, this.igual, "Si")
                },
                new Clause(this.resSayan, this.igual, "Si"));
        Rule r42 = new Rule(baseDeDatos, "ReglaCuarentaydos",
                new Clause[]{
                    new Clause(this.resCabello, this.igual, "Si"),
                    new Clause(this.sayan, this.igual, "No")
                },
                new Clause(this.resSayan, this.igual, "No"));
        //Es de raza pura??
        Rule r43 = new Rule(baseDeDatos, "ReglaCuarentaytres",
                new Clause[]{
                    new Clause(this.resSayan, this.igual, "Si"),
                    new Clause(this.razapura, this.igual, "Si")
                },
                new Clause(this.resRazapura, this.igual, "Si"));
        Rule r44 = new Rule(baseDeDatos, "ReglaCuarentaycuatro",
                new Clause[]{
                    new Clause(this.resSayan, this.igual, "Si"),
                    new Clause(this.razapura, this.igual, "No")
                },
                new Clause(this.resRazapura, this.igual, "No"));
        //Es Humano??
        Rule r45 = new Rule(baseDeDatos, "ReglaCuarentaycinco",
                new Clause[]{
                    new Clause(this.resSayan, this.igual, "No"),
                    new Clause(this.humanoHC, this.igual, "Si")
                },
                new Clause(this.resHumanoHC, this.igual, "Si"));
        Rule r46 = new Rule(baseDeDatos, "ReglaCuarentayseis",
                new Clause[]{
                    new Clause(this.resSayan, this.igual, "No"),
                    new Clause(this.humanoHC, this.igual, "No")
                },
                new Clause(this.resHumanoHC, this.igual, "No"));
        //Puede Transformarse en Super sayan??
        Rule r47 = new Rule(baseDeDatos, "ReglaCuarentaysiete",
                new Clause[]{
                    new Clause(this.resRazapura, this.igual, "Si"),
                    new Clause(this.superSayan, this.igual, "Si")
                },
                new Clause(this.resSuperSayan, this.igual, "Si"));
        Rule r48 = new Rule(baseDeDatos, "ReglaCuarentayocho",
                new Clause[]{
                    new Clause(this.resRazapura, this.igual, "Si"),
                    new Clause(this.superSayan, this.igual, "No")
                },
                new Clause(this.resSuperSayan, this.igual, "No"));
        //Derroto a cell?
        Rule r49 = new Rule(baseDeDatos, "ReglaCuarentaynueve",
                new Clause[]{
                    new Clause(this.resRazapura, this.igual, "No"),
                    new Clause(this.derrotaCell, this.igual, "Si")
                },
                new Clause(this.resDerrotaCell, this.igual, "EL PERSONAJE ES GOHAN"));
        Rule r50 = new Rule(baseDeDatos, "ReglaCincuenta",
                new Clause[]{
                    new Clause(this.resRazapura, this.igual, "No"),
                    new Clause(this.derrotaCell, this.igual, "No")
                },
                new Clause(this.resDerrotaCell, this.igual, "No"));
        //Ha muerto??
        Rule r51 = new Rule(baseDeDatos, "ReglaCincuentayuno",
                new Clause[]{
                    new Clause(this.resHumanoHC, this.igual, "Si"),
                    new Clause(this.muerto, this.igual, "Si")
                },
                new Clause(this.resMuerto, this.igual, "EL PERSONAJE ES YAMCHA"));
        Rule r52 = new Rule(baseDeDatos, "ReglaCincuentaydos",
                new Clause[]{
                    new Clause(this.resHumanoHC, this.igual, "Si"),
                    new Clause(this.muerto, this.igual, "No")
                },
                new Clause(this.resMuerto, this.igual, "EL PERSONAJE ES MR. SATAN"));
        //Tiene Hermanos??
        Rule r53 = new Rule(baseDeDatos, "ReglaCincuentaytres",
                new Clause[]{
                    new Clause(this.resHumanoHC, this.igual, "No"),
                    new Clause(this.hermanos, this.igual, "Si")
                },
                new Clause(this.resHermanos, this.igual, "EL PERSONAJE ES NUMERO 17"));
        Rule r54 = new Rule(baseDeDatos, "ReglaCincuentaycuatro",
                new Clause[]{
                    new Clause(this.resHumanoHC, this.igual, "No"),
                    new Clause(this.hermanos, this.igual, "No")
                },
                new Clause(this.resHermanos, this.igual, "EL PERSONAJE ES NUMERO 16"));
        //Cabello oscuro??
        Rule r55 = new Rule(baseDeDatos, "ReglaCincuentaycinco",
                new Clause[]{
                    new Clause(this.resDerrotaCell, this.igual, "No"),
                    new Clause(this.cabelloOscuro, this.igual, "Si")
                },
                new Clause(this.resCabelloOscuro, this.igual, "Si"));
        Rule r56 = new Rule(baseDeDatos, "ReglaCincuentayseis",
                new Clause[]{
                    new Clause(this.resDerrotaCell, this.igual, "No"),
                    new Clause(this.cabelloOscuro, this.igual, "No")
                },
                new Clause(this.resCabelloOscuro, this.igual, "EL PERSONAJE ES TRUNKS"));
        //Fusion sangrepura??
        Rule r57 = new Rule(baseDeDatos, "ReglaCincuentaysiete",
                new Clause[]{
                    new Clause(this.resSuperSayan, this.igual, "Si"),
                    new Clause(this.fusion, this.igual, "Si")
                },
                new Clause(this.resFusion, this.igual, "Si"));
        Rule r58 = new Rule(baseDeDatos, "ReglaCincuentayocho",
                new Clause[]{
                    new Clause(this.resSuperSayan, this.igual, "Si"),
                    new Clause(this.fusion, this.igual, "No")
                },
                new Clause(this.resFusion, this.igual, "No"));
        //Lucho contra frezzer??
        Rule r59 = new Rule(baseDeDatos, "ReglaCincuentaynueve",
                new Clause[]{
                    new Clause(this.resSuperSayan, this.igual, "No"),
                    new Clause(this.luchaFrezeer, this.igual, "Si")
                },
                new Clause(this.resLuchaFrezeer, this.igual, "EL PERSONAJE ES BARDOCK"));
        Rule r60 = new Rule(baseDeDatos, "ReglaSesenta",
                new Clause[]{
                    new Clause(this.resSuperSayan, this.igual, "No"),
                    new Clause(this.luchaFrezeer, this.igual, "No")
                },
                new Clause(this.resLuchaFrezeer, this.igual, "EL PERSONAJE ES RADITZ"));
        //PRODUCTO FUSION No PURA
        Rule r61 = new Rule(baseDeDatos, "ReglaSesentayuno",
                new Clause[]{
                    new Clause(this.resCabelloOscuro, this.igual, "Si"),
                    new Clause(this.fusionNP, this.igual, "Si")
                },
                new Clause(this.resFusionNP, this.igual, "EL PERSONAJE ES GOTENKS"));
        Rule r62 = new Rule(baseDeDatos, "ReglaSesentaydos",
                new Clause[]{
                    new Clause(this.resCabelloOscuro, this.igual, "Si"),
                    new Clause(this.fusionNP, this.igual, "No")
                },
                new Clause(this.resFusionNP, this.igual, "EL PERSONAJE ES GOTEN"));
        //Uso aretes??
        Rule r63 = new Rule(baseDeDatos, "ReglaSesentaytres",
                new Clause[]{
                    new Clause(this.resFusion, this.igual, "Si"),
                    new Clause(this.aretes, this.igual, "Si")
                },
                new Clause(this.resAretes, this.igual, "EL PERSONAJE ES VEGETTO"));
        Rule r64 = new Rule(baseDeDatos, "ReglaSesentaycuatro",
                new Clause[]{
                    new Clause(this.resFusion, this.igual, "Si"),
                    new Clause(this.aretes, this.igual, "No")
                },
                new Clause(this.resAretes, this.igual, "EL PERSONAJE ES GOGETA"));
        //Ropa Naranja??
        Rule r65 = new Rule(baseDeDatos, "ReglaSesentaycinco",
                new Clause[]{
                    new Clause(this.resFusion, this.igual, "No"),
                    new Clause(this.ropaNaranja, this.igual, "Si")
                },
                new Clause(this.resRopaNaranja, this.igual, "EL PERSONAJE ES GOKU"));
        Rule r66 = new Rule(baseDeDatos, "ReglaSesentayseis",
                new Clause[]{
                    new Clause(this.resFusion, this.igual, "No"),
                    new Clause(this.ropaNaranja, this.igual, "No")
                },
                new Clause(this.resRopaNaranja, this.igual, "No"));
        //Es amigo de goku??
        Rule r67 = new Rule(baseDeDatos, "ReglaSesentaysiete",
                new Clause[]{
                    new Clause(this.resRopaNaranja, this.igual, "No"),
                    new Clause(this.amigoGoku, this.igual, "Si")
                },
                new Clause(this.resAmigoGoku, this.igual, "EL PERSONAJE ES VEGETA"));
        Rule r68 = new Rule(baseDeDatos, "ReglaSesentayocho",
                new Clause[]{
                    new Clause(this.resRopaNaranja, this.igual, "No"),
                    new Clause(this.amigoGoku, this.igual, "No")
                },
                new Clause(this.resAmigoGoku, this.igual, "EL PERSONAJE ES BROLY"));
    }

}
