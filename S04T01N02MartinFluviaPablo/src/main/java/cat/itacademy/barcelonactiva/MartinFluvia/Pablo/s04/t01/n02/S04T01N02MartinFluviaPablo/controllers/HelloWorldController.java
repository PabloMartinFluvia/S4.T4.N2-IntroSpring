package cat.itacademy.barcelonactiva.MartinFluvia.Pablo.s04.t01.n02.S04T01N02MartinFluviaPablo.controllers;

import cat.itacademy.barcelonactiva.MartinFluvia.Pablo.s04.t01.n02.S04T01N02MartinFluviaPablo.S04T01N02MartinFluviaPabloApplication;
import java.util.Collections;
import java.util.Map;
import org.slf4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {  
    
    private final Logger LOG = S04T01N02MartinFluviaPabloApplication.LOG;
    private String msg;
    
    
    @GetMapping(value="/HelloWorld")
    public Map<String,String> saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom){        
        msg = "Hola, " + nom + ". Est?s executant un projecte Gradle";
        LOG.info("Reacting to get HelloWorld");
        return Collections.singletonMap("response",msg);
    }
    
    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public Map<String,String> saluda2(@PathVariable(required=false) String nom){
        msg = "Hola, " + nom + ". Est?s executant un projecte Gradle";
        LOG.info("Reacting to get HelloWorld2");
        return Collections.singletonMap("response",msg);
    }
    
    private void testAccent(){
        LOG.info("Test dels accents:??`s??");
    }
}
