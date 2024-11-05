package org.example.spring_redis.Controller;

import com.google.gson.Gson;
import org.example.spring_redis.Model.Message;
import org.example.spring_redis.Service.DashboardAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboardApp")
public class DashboardAppController {
    private final DashboardAppService dashboardAppService;
    private final Gson gson = new Gson();
    String dashboardApp = "dashboardApp";


    public DashboardAppController(DashboardAppService dashboardAppService){
        this.dashboardAppService = dashboardAppService;
    }

    @PostMapping("/incrementarContadorDashboardApp")
    public ResponseEntity<?> incrementarContadorDashboardApp(){
        try{
            int cont = Integer.parseInt(dashboardAppService.setDashboardAppRepository(dashboardApp).toString());
            return ResponseEntity.ok(gson.toJson(new Message("Incremento realizado com sucesso!", cont)));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

    @GetMapping("/receberContadorDashboardApp")
    public ResponseEntity<?> incrementKey() {
        try{
            return ResponseEntity.ok(gson.toJson(new Message(Integer.parseInt(dashboardAppService.getDashboardAppRepository(dashboardApp).toString()))));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

}
