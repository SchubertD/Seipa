 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.seipa.beans;

/**
 *
 * @author schubert_david
 */
import javax.annotation.PostConstruct;

public class BotonesBean {

    private Boolean disabledNuevo;
    private Boolean disabledNuevaOpcion;
    private Boolean disabledModificar;
    private Boolean disabledEliminar;
    private Boolean disableAuditoria;
    private Boolean disableCargaDocumentos;
    private Boolean uno;
    private Boolean varios;
    private Boolean noSeleccionados;
    private Boolean enEdicion;
    private Boolean enEdicionOpciones;
    private Boolean enRegistro;
    private Boolean enRegistroOpciones;
    private Boolean soloLectura;
    private Boolean enAuditoria;
    private Boolean enCargaDocumentos;

    @PostConstruct
    public void postConstructor() {
        this.sinSeleccion();
    }

    public void sinSeleccion() {
        this.reset();
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.noSeleccionados = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.disableCargaDocumentos = Boolean.TRUE;
        this.uno = Boolean.FALSE;
    }

    public void seleccionadoUno() {
        this.reset();
        this.uno = Boolean.TRUE;
    }

    public void seleccionadoVarios() {
        this.reset();
        this.disabledModificar = Boolean.TRUE;
        this.varios = Boolean.TRUE;
    }

    public void crear() {
        this.reset();
        this.disabledNuevo = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.enRegistro = Boolean.TRUE;
        this.disableCargaDocumentos = Boolean.TRUE;
    }
    
    public void crearOpciones() {
        this.reset();
        this.disabledNuevaOpcion = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.setEnRegistroOpciones(Boolean.TRUE);
        this.disableCargaDocumentos = Boolean.TRUE;
    }

    public void modificar() {
        this.reset();
        this.disabledNuevo = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.disableCargaDocumentos = Boolean.TRUE;
        this.enEdicion = Boolean.TRUE;

    }

//    public void cancelar() {
//        this.reset();
//
//        this.disabledModificar = Boolean.TRUE;
//        this.disabledEliminar = Boolean.TRUE;
//        this.disableAuditoria = Boolean.TRUE;
//        this.enAuditoria = Boolean.FALSE;
//        this.disableCargaDocumentos = Boolean.TRUE;
//        this.soloLectura = Boolean.FALSE;
//    }
    
    public void cancelar() {
        this.reset();
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;

        this.enAuditoria = Boolean.FALSE;
        this.disableCargaDocumentos = Boolean.TRUE;
        this.soloLectura = Boolean.FALSE;
    }

    public void verAuditoria() {
        this.reset();
        this.disabledNuevo = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.disableCargaDocumentos = Boolean.TRUE;
        this.enAuditoria = Boolean.TRUE;
        this.soloLectura = Boolean.TRUE;
    }

    public void verDetalles() {
        this.reset();
        this.disabledNuevo = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.soloLectura = Boolean.TRUE;
    }

    public void verCargaDocumentos() {
        this.reset();
        
        this.disabledNuevo = Boolean.TRUE;
        this.disabledModificar = Boolean.TRUE;
        this.disabledEliminar = Boolean.TRUE;
        this.disableAuditoria = Boolean.TRUE;
        this.enCargaDocumentos = Boolean.TRUE;
        this.soloLectura = Boolean.FALSE;
    }

    private void reset() {
        this.disabledNuevo = Boolean.FALSE;
        this.disabledModificar = Boolean.FALSE;
        this.disabledEliminar = Boolean.FALSE;
        this.disableAuditoria = Boolean.FALSE;
        this.disableCargaDocumentos= Boolean.FALSE;
        this.uno = Boolean.FALSE;
        this.varios = Boolean.FALSE;
        this.noSeleccionados = Boolean.FALSE;
        this.enEdicion = Boolean.FALSE;
        this.enRegistro = Boolean.FALSE;
        this.enAuditoria = Boolean.FALSE;
        this.enCargaDocumentos=Boolean.FALSE;
        this.soloLectura = Boolean.FALSE;
    }

    public Boolean getDisabledEliminar() {
        return disabledEliminar;
    }

    public void setDisabledEliminar(Boolean disabledEliminar) {
        this.disabledEliminar = disabledEliminar;
    }

    public Boolean getDisabledModificar() {
        return disabledModificar;
    }

    public void setDisabledModificar(Boolean disabledModificar) {
        this.disabledModificar = disabledModificar;
    }

    public Boolean getDisabledNuevo() {
        return disabledNuevo;
    }

    public void setDisabledNuevo(Boolean disabledNuevo) {
        this.disabledNuevo = disabledNuevo;
    }

    public Boolean getEnEdicion() {
        return enEdicion;
    }

    public Boolean getEnRegistro() {
        return enRegistro;
    }

    public void setEnEdicion(Boolean enEdicion) {
        this.enEdicion = enEdicion;
    }

    public Boolean getSoloLectura() {
        return soloLectura;
    }

    public Boolean getNoSeleccionados() {
        return noSeleccionados;
    }

    public void setNoSeleccionados(Boolean noSeleccionados) {
        this.noSeleccionados = noSeleccionados;
    }

    public Boolean getUno() {
        return uno;
    }

    public void setUno(Boolean uno) {
        this.uno = uno;
    }

    public Boolean getVarios() {
        return varios;
    }

    public void setVarios(Boolean varios) {
        this.varios = varios;
    }

    public Boolean getDisableAuditoria() {
        return disableAuditoria;
    }

    public void setDisableAuditoria(Boolean disableAuditoria) {
        this.disableAuditoria = disableAuditoria;
    }

    public Boolean getEnAuditoria() {
        return enAuditoria;
    }

    public void setEnAuditoria(Boolean enAuditoria) {
        this.enAuditoria = enAuditoria;
    }

    public Boolean getDisableCargaDocumentos() {
        return disableCargaDocumentos;
    }

    public void setDisableCargaDocumentos(Boolean disableCargaDocumentos) {
        this.disableCargaDocumentos = disableCargaDocumentos;
    }

    public Boolean getEnCargaDocumentos() {
        return enCargaDocumentos;
    }

    public void setEnCargaDocumentos(Boolean enCargaDocumentos) {
        this.enCargaDocumentos = enCargaDocumentos;
    }    

    /**
     * @return the enEdicionOpciones
     */
    public Boolean getEnEdicionOpciones() {
        return enEdicionOpciones;
    }

    /**
     * @param enEdicionOpciones the enEdicionOpciones to set
     */
    public void setEnEdicionOpciones(Boolean enEdicionOpciones) {
        this.enEdicionOpciones = enEdicionOpciones;
    }

    /**
     * @return the enRegistroOpciones
     */
    public Boolean getEnRegistroOpciones() {
        return enRegistroOpciones;
    }

    /**
     * @param enRegistroOpciones the enRegistroOpciones to set
     */
    public void setEnRegistroOpciones(Boolean enRegistroOpciones) {
        this.enRegistroOpciones = enRegistroOpciones;
    }

    /**
     * @return the disabledNuevaOpcion
     */
    public Boolean getDisabledNuevaOpcion() {
        return disabledNuevaOpcion;
    }

    /**
     * @param disabledNuevaOpcion the disabledNuevaOpcion to set
     */
    public void setDisabledNuevaOpcion(Boolean disabledNuevaOpcion) {
        this.disabledNuevaOpcion = disabledNuevaOpcion;
    }
}
