package org.example.spring_redis.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("DashboardApp")
public class DashboardApp implements Serializable {
    @Id
    private String id;
    private String dashName;
    private int contDashApp;

    public DashboardApp() {}

    public DashboardApp(String id, String dashName, int contDashApp) {
        this.id = id;
        this.dashName = dashName;
        this.contDashApp = contDashApp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDashName() {
        return dashName;
    }

    public void setDashName(String dashName) {
        this.dashName = dashName;
    }

    public int getContDashApp() {
        return contDashApp;
    }

    public void setContDashApp(int contDashApp) {
        this.contDashApp = contDashApp;
    }

    @Override
    public String toString() {
        return "DashboardApp{" +
                "id='" + id + '\'' +
                ", dashName='" + dashName + '\'' +
                ", contDashApp=" + contDashApp +
                '}';
    }
}
