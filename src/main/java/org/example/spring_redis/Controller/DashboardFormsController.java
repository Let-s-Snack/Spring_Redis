package org.example.spring_redis.Controller;

import org.example.spring_redis.Service.DashboardFormsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboardForms")
public class DashboardFormsController {

    private final DashboardFormsService dashboardFormsService;

    public DashboardFormsController(DashboardFormsService dashboardFormsService){
        this.dashboardFormsService = dashboardFormsService;
    }

    @PostMapping("/incrementarContadorDashboardForms")
    public ResponseEntity<?> incrementarContadorDashboardApp(){
        try{
            String dashboardForms = "dashboardForms";
            return ResponseEntity.ok(dashboardFormsService.setDashboardFormsRepository(dashboardForms));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

    @GetMapping("/receberContadorDashboardForms")
    public ResponseEntity<?> incrementKey() {
        try{
            String dashboardForms = "dashboardForms";
            return ResponseEntity.ok(dashboardFormsService.getDashboardFormsRepository(dashboardForms));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }


}
