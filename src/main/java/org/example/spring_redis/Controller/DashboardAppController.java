package org.example.spring_redis.Controller;

import org.example.spring_redis.Service.DashboardAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboardApp")
public class DashboardAppController {
    private final DashboardAppService dashboardAppService;
    String dashboardApp = "dashboardApp";


    public DashboardAppController(DashboardAppService dashboardAppService){
        this.dashboardAppService = dashboardAppService;
    }

    @PostMapping("/incrementarContadorDashboardApp")
    public ResponseEntity<?> incrementarContadorDashboardApp(){
        try{
            return ResponseEntity.ok(dashboardAppService.setDashboardAppRepository(dashboardApp));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

    @GetMapping("/receberContadorDashboardApp")
    public ResponseEntity<?> incrementKey() {
        try{
            return ResponseEntity.ok(dashboardAppService.getDashboardAppRepository(dashboardApp));
        }catch (Exception npc){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
        }
    }

}
