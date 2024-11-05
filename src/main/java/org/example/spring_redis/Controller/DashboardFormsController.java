package org.example.spring_redis.Controller;

import com.google.gson.Gson;
import org.example.spring_redis.Model.Message;
import org.example.spring_redis.Service.DashboardFormsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboardForms")
public class DashboardFormsController {

    private final DashboardFormsService dashboardFormsService;
    private final String dashboardForms = "dashboardForms";
    private final Gson gson = new Gson();


    public DashboardFormsController(DashboardFormsService dashboardFormsService){
        this.dashboardFormsService = dashboardFormsService;
    }

    @PostMapping("/incrementarContadorDashboardForms")
    public ResponseEntity<?> incrementarContadorDashboardApp(){
        try{
            int cont = Integer.parseInt(dashboardFormsService.setDashboardFormsRepository(dashboardForms).toString());
            return ResponseEntity.ok(gson.toJson(new Message("Incremento realizado com sucesso!", cont)));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

    @GetMapping("/receberContadorDashboardForms")
    public ResponseEntity<?> incrementKey() {
        try{
            return ResponseEntity.ok(gson.toJson(new Message(Integer.parseInt(dashboardFormsService.getDashboardFormsRepository(dashboardForms).toString()))));

        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }


}
