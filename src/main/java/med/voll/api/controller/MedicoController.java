package med.voll.api.controller;

import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medico")
public class MedicoController{

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroMedico datosRegistroMedico){
        // System.out.println("se reciden datos");
        // System.out.println(datosRegistroMedico);
        medicoRepository.save(new Medico(datosRegistroMedico));

    }
}
