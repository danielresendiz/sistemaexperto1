/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadragon;

/**
 *
 * @author erick
 */
public class MotorInferencia {

    private String resultado = "";
    BaseDeConocimientos base;

    public MotorInferencia() {
        base = new BaseDeConocimientos();
        base.reglas();
        
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String sacaGenero(String genero) {
        base.getGenero().setValue(genero);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResGenero().getValue();
        return resultado;
    }

    public String sacaHumano(String humana) {
        base.getResGenero().setValue(base.getResGenero().getValue());
        base.getHumana().setValue(humana);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResHumana().getValue();
        return resultado;
    }

    public String sacaPareja(String pareja) {
        base.getResHumana().setValue(base.getResHumana().getValue());
        base.getParejaSayan().setValue(pareja);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResPareja().getValue();
        return resultado;
    }

    public String sacaRubia(String rubia) {
        base.getResHumana().setValue(base.getResHumana().getValue());
        base.getRubia().setValue(rubia);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResRubia().getValue();
        return resultado;
    }

    public String sacaCabelloF(String cabelloF) {
        base.getResPareja().setValue(base.getResPareja().getValue());
        base.getCabelloOscuroF().setValue(cabelloF);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResCabelloOscuroF().getValue();
        return resultado;
    }

    public String sacaVuela(String vuela) {
        base.getResCabelloOscuroF().setValue(base.getResCabelloOscuroF().getValue());
        base.getVuelaF().setValue(vuela);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResVuelaF().getValue();
        return resultado;
    }

    public String sacaCabello(String cabello) {
        base.getResGenero().setValue(base.getResGenero().getValue());
        base.getCabello().setValue(cabello);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResCabello().getValue();
        return resultado;
    }

    public String sacaHumanoH(String humano) {
        base.getResCabello().setValue(base.getResCabello().getValue());
        base.getHumano().setValue(humano);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResHumano().getValue();
        return resultado;
    }

    public String sacaMejorAmigo(String amigo) {
        base.getResHumano().setValue(base.getResHumano().getValue());
        base.getMejoramigo().setValue(amigo);
        base.getBaseDeDatos().forwardChain();
        resultado ="";
        resultado = base.getResMejoramigo().getValue();
        return resultado;
    }

    public String sacaMaestro(String maestro) {
        base.getResHumano().setValue(base.getResHumano().getValue());
        base.getMaestro().setValue(maestro);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResMaestro().getValue();
        return resultado;
    }

    public String sacaPequenio(String peque) {
        base.getResMejoramigo().setValue(base.getResMejoramigo().getValue());
        base.getPequenio().setValue(peque);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResPequenio().getValue();
        return resultado;
    }

    public String sacaViejo(String viejo) {
        base.getResMaestro().setValue(base.getResMaestro().getValue());
        base.getViejo().setValue(viejo);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResViejo().getValue();
        return resultado;
    }

    public String sacaVillano(String villano) {
        base.getResMaestro().setValue(base.getResMaestro().getValue());
        base.getVillano().setValue(villano);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResVillano().getValue();
        return resultado;
    }

    public String sacaViejoP(String viejito) {
        base.getResPequenio().setValue(base.getResPequenio().getValue());
        base.getViejoP().setValue(viejito);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResViejoP().getValue();
        return resultado;
    }

    public String sacaVencio(String vencio) {
        base.getResVillano().setValue(base.getResVillano().getValue());
        base.getGanoGoku().setValue(vencio);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResGanoGoku().getValue();
        return resultado;
    }

    public String sacaAnimal(String animal) {
        base.getResVillano().setValue(base.getResVillano().getValue());
        base.getAnimal().setValue(animal);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResAnimal().getValue();
        return resultado;
    }

    public String sacaEmperador(String emp) {
        base.getResGanoGoku().setValue(base.getResGanoGoku().getValue());
        base.getEmperador().setValue(emp);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResEmperador().getValue();
        return resultado;
    }

    public String sacaTransforma(String tra) {
        base.getResAnimal().setValue(base.getResAnimal().getValue());
        base.getTransforma().setValue(tra);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResTransforma().getValue();
        return resultado;
    }
    
    public String sacaRegenera(String reg) {
        base.getResEmperador().setValue(base.getResEmperador().getValue());
        base.getRegeneracion().setValue(reg);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResRegeneracion().getValue();
        return resultado;
    }
    
    public String sacaVuelaH(String vuela) {
        base.getResTransforma().setValue(base.getResTransforma().getValue());
        base.getVuela().setValue(vuela);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResVuela().getValue();
        return resultado;
    }
    
    public String sacaSayan(String sayan) {
        base.getResCabello().setValue(base.getResCabello().getValue());
        base.getSayan().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResSayan().getValue();
        return resultado;
    }
    
    public String sacaRaza(String sayan) {
        base.getResSayan().setValue(base.getResSayan().getValue());
        base.getRazapura().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResRazapura().getValue();
        return resultado;
    }
    
    public String sacaHumanoHC(String sayan) {
        base.getResSayan().setValue(base.getResSayan().getValue());
        base.getHumanoHC().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResHumanoHC().getValue();
        return resultado;
    }
    
    public String sacaSuperSayan(String sayan) {
        base.getResRazapura().setValue(base.getResRazapura().getValue());
        base.getSuperSayan().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResSuperSayan().getValue();
        return resultado;
    }
    
    public String sacaDerrotaCell(String sayan) {
        base.getResRazapura().setValue(base.getResRazapura().getValue());
        base.getDerrotaCell().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResDerrotaCell().getValue();
        return resultado;
    }
    
    public String sacaMuerto(String sayan) {
        base.getResHumanoHC().setValue(base.getResHumanoHC().getValue());
        base.getMuerto().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResMuerto().getValue();
        return resultado;
    }
    
    public String sacaHermanos(String sayan) {
        base.getResHumanoHC().setValue(base.getResHumanoHC().getValue());
        base.getHermanos().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResHermanos().getValue();
        return resultado;
    }
    
    public String sacaCabelloOscuro(String sayan) {
        base.getResDerrotaCell().setValue(base.getResDerrotaCell().getValue());
        base.getCabelloOscuro().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResCabelloOscuro().getValue();
        return resultado;
    }
    
    public String sacaFusionPura(String sayan) {
        base.getResSuperSayan().setValue(base.getResSuperSayan().getValue());
        base.getFusion().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResFusion().getValue();
        return resultado;
    }
    
    public String sacaLuchaFrezeer(String sayan) {
        base.getResSuperSayan().setValue(base.getResSuperSayan().getValue());
        base.getLuchaFrezeer().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResLuchaFrezeer().getValue();
        return resultado;
    }
    
    public String sacaFusionNoPura(String sayan) {
        base.getResCabelloOscuro().setValue(base.getResCabelloOscuro().getValue());
        base.getFusionNP().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResFusionNP().getValue();
        return resultado;
    }
    
    public String sacaAretes(String sayan) {
        base.getResFusion().setValue(base.getResFusion().getValue());
        base.getAretes().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResAretes().getValue();
        return resultado;
    }
    
    public String sacaRopaNaranja(String sayan) {
        base.getResFusion().setValue(base.getResFusion().getValue());
        base.getRopaNaranja().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResRopaNaranja().getValue();
        return resultado;
    }
    
    public String sacaAmigoGoku(String sayan) {
        base.getResRopaNaranja().setValue(base.getRopaNaranja().getValue());
        base.getAmigoGoku().setValue(sayan);
        base.getBaseDeDatos().forwardChain();
        resultado = base.getResAmigoGoku().getValue();
        return resultado;
    }
}
