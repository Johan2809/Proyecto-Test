package concesionario.controllers;

import concesionario.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class GestionarVehiculosController {

    @FXML
    private Button btnActualizaPickUp;

    @FXML
    private ComboBox<?> cbTiempo100kmDeportivo;

    @FXML
    private ComboBox<?> cbEstadoVans;

    @FXML
    private ComboBox<?> cbMarcaVans;

    @FXML
    private ComboBox<?> cbCambiosDeportivo;

    @FXML
    private ComboBox<?> cbAbsPickUp;

    @FXML
    private ComboBox<?> cb4x4Camioneta;

    @FXML
    private ComboBox<?> cbEstadoMoto;

    @FXML
    private ComboBox<?> cb4x4PickUp;

    @FXML
    private ComboBox<?> cbNumBolsasAireBus;

    @FXML
    private ComboBox<?> cbEstadoCamioneta;

    @FXML
    private ComboBox<?> cbVelMaxPickUp;

    @FXML
    private Button btnActualizarSedan;

    @FXML
    private ComboBox<?> cbAbsCamion;

    @FXML
    private Button btnActualizarDeportivo;

    @FXML
    private TextField txtCilindrajeDeportivo;

    @FXML
    private Button btnAgregarPickUp;

    @FXML
    private ComboBox<?> cbSensorTraficoDeportivo;

    @FXML
    private Button btnEliminarDeportivo;

    @FXML
    private ComboBox<?> cbVelCruceroSedan;

    @FXML
    private ComboBox<?> cbCajaCargaPickUp;

    @FXML
    private ComboBox<?> cbAireAcondicionado;

    @FXML
    private ComboBox<?> cbAbsVans;

    @FXML
    private ComboBox<?> cbEstadoDeportivo;

    @FXML
    private Button btnBuscarBus;

    @FXML
    private ComboBox<?> cbMarcaSedan;

    @FXML
    private Button cbEliminarVans;

    @FXML
    private ComboBox<?> cbEsatadoBus;

    @FXML
    private ComboBox<?> cbMarcaMoto;

    @FXML
    private ComboBox<?> cbCaballosFuerza;

    @FXML
    private Button btnBuscarCamioneta;

    @FXML
    private ComboBox<?> cbMarcaPickUps;

    @FXML
    private TextField txtModeloSedan;

    @FXML
    private Button btnAgregarCamion;

    @FXML
    private ComboBox<?> cbNumBolsasAireSedan;

    @FXML
    private TableColumn<?, ?> columCilindraje;

    @FXML
    private ComboBox<?> cbNumPasajerosPickUp;

    @FXML
    private ComboBox<?> cbMarcaDeportivo;

    @FXML
    private ComboBox<?> cbAireAcondicionadoPickUp;

    @FXML
    private ComboBox<?> cbTipoCamion;

    @FXML
    private ComboBox<?> cbAbsBus;

    @FXML
    private ComboBox<?> cbNumEjesCamion;

    @FXML
    private TableColumn<?, ?> columModelo;

    @FXML
    private ComboBox<?> cbAireAcondicionadoSedan;

    @FXML
    private Button btnAgregarCamioneta;

    @FXML
    private ComboBox<?> cbCamaraReversaVans;

    @FXML
    private ComboBox<?> cbCapMaletero;

    @FXML
    private TextField txtModeloPickUp;

    @FXML
    private Button btnBuscarPickUp;

    @FXML
    private TextField txtCilindrajePickUp;

    @FXML
    private Button btnAgregarDeportivo;

    @FXML
    private ComboBox<?> cbSensoresDeportivo;

    @FXML
    private Button btnBuscarSedan;

    @FXML
    private ComboBox<?> cbNumBolsasAire;

    @FXML
    private ComboBox<?> cbCajaCarga;

    @FXML
    private TextField txtCapacidadMaleteroSedan;

    @FXML
    private ComboBox<?> cbAireAcondicionadoVans;

    @FXML
    private Button btnActualizarBus;

    @FXML
    private ComboBox<?> cbCamareReversa;

    @FXML
    private ComboBox<?> cbNumPasajerosVans;

    @FXML
    private Button btnBuscarCamion;

    @FXML
    private ComboBox<?> cbSensoresSedan;

    @FXML
    private ComboBox<?> cbNumPasajerosBus;

    @FXML
    private ComboBox<?> cbCamaraReversaBus;

    @FXML
    private TextField txtCilindrajeCamion;

    @FXML
    private TextField txtModeloCamioneta;

    @FXML
    private Button btnEliminarPickUp;

    @FXML
    private Button btnAgregarBus;

    @FXML
    private ComboBox<?> cbCambiosMoto;

    @FXML
    private ComboBox<?> cbCapacidadCargaCamion;

    @FXML
    private ComboBox<?> cbMarcaCamioneta;

    @FXML
    private ComboBox<?> cbNumPuertasBus;

    @FXML
    private ComboBox<?> cbEstadoPickUp;

    @FXML
    private ComboBox<?> cbCambiosPickUp;

    @FXML
    private TextField txtModeloVans;

    @FXML
    private ComboBox<?> cbMarcaCamion;

    @FXML
    private Button btnEliminarCamion;

    @FXML
    private ComboBox<?> cbABSSedan;

    @FXML
    private ComboBox<?> cbNumPuertasPickUp;

    @FXML
    private ComboBox<?> cbVelMaxBus;

    @FXML
    private TextField cbModeloBus;

    @FXML
    private ComboBox<?> cbNumPasajeros;

    @FXML
    private TableColumn<?, ?> columMarca;

    @FXML
    private ComboBox<?> cbNumPasajerosSedan;

    @FXML
    private ComboBox<?> cbVelMaxCamioneta;

    @FXML
    private ComboBox<?> cbNumBolsasAireVans;

    @FXML
    private ComboBox<?> cbCamaraReversaSedan;

    @FXML
    private ComboBox<?> cbEstadoCamion;

    @FXML
    private Button btnEliminarCamioneta;

    @FXML
    private ComboBox<?> cbNumPuertasVans;

    @FXML
    private ComboBox<?> cbModeloMoto;

    @FXML
    private Button btnAgregarMoto;

    @FXML
    private ComboBox<?> cbNumEjesBus;

    @FXML
    private ComboBox<?> cbVelMaxCamion;

    @FXML
    private ComboBox<?> cbCambiosBus;

    @FXML
    private ComboBox<?> cbNumPasajerosCamioneta;

    @FXML
    private ComboBox<?> cbFrenosAireCamion;

    @FXML
    private Button btnBuscarDeportivo;

    @FXML
    private ComboBox<?> cbCambiosCamion;

    @FXML
    private Button btnBuscarMoto;

    @FXML
    private TextField txtCilindrajeCamioneta;

    @FXML
    private TextField txtCilindrajeBus;

    @FXML
    private ComboBox<?> cbNumPuertasCamioneta;

    @FXML
    private TextField txtModeloCamion;

    @FXML
    private ComboBox<?> cbBolsasAireDeportivo;

    @FXML
    private ComboBox<?> cbVelMaxDeportivo;

    @FXML
    private ComboBox<?> cbNumPuertasDeportivo;

    @FXML
    private ComboBox<?> cbCambiosSedan;

    @FXML
    private Button btnActualizarCamioneta;

    @FXML
    private Button btnActualizarVans;

    @FXML
    private ComboBox<?> cbCapacidadMaleteroBus;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private Button btnEliminarSedan;

    @FXML
    private Button btnAgregarSedan;

    @FXML
    private ComboBox<?> cbMaracaBus;

    @FXML
    private Button btnLimpiar;

    @FXML
    private ComboBox<?> cbVelMaxVans;

    @FXML
    private ComboBox<?> cbEstadoSedan;

    @FXML
    private Button btnBuscarVans;

    @FXML
    private ComboBox<?> cbVelMaxMoto;

    @FXML
    private ComboBox<?> cbSalidasEmergenciaBus;

    @FXML
    private ComboBox<?> cbABSdeportivo;

    @FXML
    private ComboBox<?> cbAireAcondicionadoBus;

    @FXML
    private Button btnActualizarCamion;

    @FXML
    private TextField txtModeloDeportivo;

    @FXML
    private ComboBox<?> cbAireAcondicionadoCamion;

    @FXML
    private Button btnActualizarMoto;

    @FXML
    private Button btnEliminarBus;

    @FXML
    private ComboBox<?> cbNumPuertasSedan;

    @FXML
    private Button btnAgreagarVans;

    @FXML
    private ComboBox<?> cbABScamioneta;

    @FXML
    private Button btnEliminarMoto;

    @FXML
    private TextField txtCilindrajeMoto;

    @FXML
    private TableColumn<?, ?> columEstado;

    @FXML
    void buscarMotoEvent(ActionEvent event) {

    }

    @FXML
    void agregarMotoEvent(ActionEvent event) {

    }

    @FXML
    void eliminarMotoEvent(ActionEvent event) {

    }

    @FXML
    void actualizarMotoEvent(ActionEvent event) {

    }

    @FXML
    void marcaMotoEvent(ActionEvent event) {

    }

    @FXML
    void estadoMotoEvent(ActionEvent event) {

    }

    @FXML
    void modeloMotoEvent(ActionEvent event) {

    }

    @FXML
    void cambiosMotoEvent(ActionEvent event) {

    }

    @FXML
    void velMaxMotoEvent(ActionEvent event) {

    }

    @FXML
    void modeloSedanEvent(ActionEvent event) {

    }

    @FXML
    void capacidadaMaleteroSedanEvent(ActionEvent event) {

    }

    @FXML
    void ABSsedanEvent(ActionEvent event) {

    }

    @FXML
    void AireAcondicionadoSedanEvent(ActionEvent event) {

    }

    @FXML
    void camaraReversaSedanEvent(ActionEvent event) {

    }

    @FXML
    void velCruceroSedanEvent(ActionEvent event) {

    }

    @FXML
    void sensoresSedanEvent(ActionEvent event) {

    }

    @FXML
    void eliminarSedanEvent(ActionEvent event) {

    }

    @FXML
    void buscarSedanEvent(ActionEvent event) {

    }

    @FXML
    void agregarSedanEvent(ActionEvent event) {

    }

    @FXML
    void actualizarSedanEvent(ActionEvent event) {

    }

    @FXML
    void estadoSedanEvent(ActionEvent event) {

    }

    @FXML
    void cambiosSedanEvent(ActionEvent event) {

    }

    @FXML
    void numPasajerosSedanEvent(ActionEvent event) {

    }

    @FXML
    void numPuertasSedanEvent(ActionEvent event) {

    }

    @FXML
    void numBolsasAireSedanEvent(ActionEvent event) {

    }

    @FXML
    void marcaSedanEvent(ActionEvent event) {

    }

    @FXML
    void marcaDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void estadoDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void cambiosDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void velMaxDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void numPuertasDeportivoEve4nt(ActionEvent event) {

    }

    @FXML
    void bolsasAireDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void ABSdeporivoEvent(ActionEvent event) {

    }

    @FXML
    void sensoresDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void modeloDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void sensorTraficoEvent(ActionEvent event) {

    }

    @FXML
    void caballosFuerzaEvent(ActionEvent event) {

    }

    @FXML
    void tiempo100kmDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void agregarDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void actualizarDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void buscarDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void eliminarDeportivoEvent(ActionEvent event) {

    }



    @FXML
    void limpiarCamposEvent(ActionEvent event) {

    }

    @FXML
    void ciliandrajeDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void marcaCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void numBolsasAireEvent(ActionEvent event) {

    }

    @FXML
    void camaraReversaEvent(ActionEvent event) {

    }

    @FXML
    void aireAcondicionadoEvent(ActionEvent event) {

    }

    @FXML
    void capMaleteroEvent(ActionEvent event) {

    }

    @FXML
    void ABScamionetaEvent(ActionEvent event) {

    }

    @FXML
    void velMaxCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void estadoCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void camioneta4x4Event(ActionEvent event) {

    }

    @FXML
    void cajaCartaEvent(ActionEvent event) {

    }

    @FXML
    void agregarCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void actualizarCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void buscarCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void eliminarCamionetaEvent(ActionEvent event) {

    }



    @FXML
    void limpiarEvent(ActionEvent event) {

    }

    @FXML
    void modeloCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void cilindrajeCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void numPasajerosDeportivoEvent(ActionEvent event) {

    }

    @FXML
    void numPuertasCamionetaEvent(ActionEvent event) {

    }

    @FXML
    void marcaPickUpEvent(ActionEvent event) {

    }

    @FXML
    void estadoPickUpEvent(ActionEvent event) {

    }

    @FXML
    void cambiosPickUpEvent(ActionEvent event) {

    }

    @FXML
    void numPasajerosPickUp(ActionEvent event) {

    }

    @FXML
    void velMaxPickUpEvent(ActionEvent event) {

    }

    @FXML
    void numPuertasPickUpEvent(ActionEvent event) {

    }

    @FXML
    void aireAcondicionadoPickUpEvent(ActionEvent event) {

    }

    @FXML
    void AbsPickUpEvent(ActionEvent event) {

    }

    @FXML
    void PickUp4x4Event(ActionEvent event) {

    }

    @FXML
    void cajaCargaPickUpEvent(ActionEvent event) {

    }

    @FXML
    void agregarPickUpEvent(ActionEvent event) {

    }

    @FXML
    void actualizarPickUpEvent(ActionEvent event) {

    }

    @FXML
    void buscarPickUpEvent(ActionEvent event) {

    }

    @FXML
    void eliminarPickUpEvent(ActionEvent event) {

    }


    @FXML
    void limpiarPickUpEvent(ActionEvent event) {

    }

    @FXML
    void cilindrajePickUpEvent(ActionEvent event) {

    }

    @FXML
    void modeloPickUpEvent(ActionEvent event) {

    }

    @FXML
    void marcaVansEvent(ActionEvent event) {

    }

    @FXML
    void estadoVansEvent(ActionEvent event) {

    }

    @FXML
    void numPasajerosVans(ActionEvent event) {

    }

    @FXML
    void velMaxVansEvent(ActionEvent event) {

    }

    @FXML
    void numPuestasVansEvent(ActionEvent event) {

    }

    @FXML
    void capmaleteroVansEvent(ActionEvent event) {

    }

    @FXML
    void aireAcondicioandoVansEvent(ActionEvent event) {

    }

    @FXML
    void camaraReversaVansEvent(ActionEvent event) {

    }

    @FXML
    void numBolsaAire(ActionEvent event) {

    }

    @FXML
    void AbsVansevent(ActionEvent event) {

    }


    @FXML
    void agregarVansEvent(ActionEvent event) {

    }

    @FXML
    void actualizarVansEvent(ActionEvent event) {

    }

    @FXML
    void buscarVansEvent(ActionEvent event) {

    }

    @FXML
    void eliminarVansEvent(ActionEvent event) {

    }

    @FXML
    void modeloVansEvent(ActionEvent event) {

    }

    @FXML
    void marcaBusEvent(ActionEvent event) {

    }

    @FXML
    void estadoBusEvent(ActionEvent event) {

    }

    @FXML
    void cambiosBusEvent(ActionEvent event) {

    }

    @FXML
    void velMaxBusEvent(ActionEvent event) {

    }

    @FXML
    void numPasajerosBusEvent(ActionEvent event) {

    }

    @FXML
    void numPuertasBusEvent(ActionEvent event) {

    }

    @FXML
    void capacidadMaleteroBusEvent(ActionEvent event) {

    }

    @FXML
    void aireAacondicionadoEvent(ActionEvent event) {

    }

    @FXML
    void camaraReversaBusEvent(ActionEvent event) {

    }

    @FXML
    void numBolsasAireBusEvent(ActionEvent event) {

    }

    @FXML
    void AbsBusEvent(ActionEvent event) {

    }

    @FXML
    void numEjesBusEvent(ActionEvent event) {

    }

    @FXML
    void salidasEmergenciaBusEvent(ActionEvent event) {

    }

    @FXML
    void agragarBusEvent(ActionEvent event) {

    }

    @FXML
    void actualizarBusEvent(ActionEvent event) {

    }

    @FXML
    void buscarBusEvent(ActionEvent event) {

    }

    @FXML
    void eliminarBusEvent(ActionEvent event) {

    }

    @FXML
    void modeloBusEvent(ActionEvent event) {

    }

    @FXML
    void cilindrajeBusEvent(ActionEvent event) {

    }

    @FXML
    void marcaCamionEvent(ActionEvent event) {

    }

    @FXML
    void estadoCamionEvent(ActionEvent event) {

    }

    @FXML
    void cambiosCamionEvent(ActionEvent event) {

    }

    @FXML
    void velMaxCamionEvent(ActionEvent event) {

    }

    @FXML
    void capacidadCargaEvent(ActionEvent event) {

    }

    @FXML
    void aireAcondicionadoCamionEvent(ActionEvent event) {

    }

    @FXML
    void frenosAireCamionEvent(ActionEvent event) {

    }

    @FXML
    void AbsCamionEvent(ActionEvent event) {

    }

    @FXML
    void numEjesCamionEvent(ActionEvent event) {

    }

    @FXML
    void tipoCamionEvent(ActionEvent event) {

    }

    @FXML
    void agregarCamionEvent(ActionEvent event) {

    }

    @FXML
    void actualizarCamionEvent(ActionEvent event) {

    }

    @FXML
    void buscarCamionEvent(ActionEvent event) {

    }

    @FXML
    void eliminarCamionEvent(ActionEvent event) {

    }


    @FXML
    void modeloCamionEvent(ActionEvent event) {

    }

    @FXML
    void cilindrajeCamionEvent(ActionEvent event) {

    }

	public void setAplicacion(Aplicacion aplicacion) {


	}

}