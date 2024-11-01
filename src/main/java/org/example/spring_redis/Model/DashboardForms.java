package org.example.spring_redis.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("DashboardForms")
public class DashboardForms {
    @Id
    private String id;
    private String dashName;
    private int contDashForms;

    public DashboardForms() {}

    public DashboardForms(String id, String dashName, int contDashForms) {
        this.id = id;
        this.dashName = dashName;
        this.contDashForms = contDashForms;
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

    public int getContDashForms() {
        return contDashForms;
    }

    public void setContDashForms(int contDashForms) {
        this.contDashForms = contDashForms;
    }

    @Override
    public String toString() {
        return "DashboardForms{" +
                "id='" + id + '\'' +
                ", dashName='" + dashName + '\'' +
                ", contDashForms=" + contDashForms +
                '}';
    }
}
