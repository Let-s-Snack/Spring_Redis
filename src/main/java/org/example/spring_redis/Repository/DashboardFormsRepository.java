package org.example.spring_redis.Repository;

import org.example.spring_redis.Model.DashboardForms;
import org.springframework.data.repository.CrudRepository;

public interface DashboardFormsRepository extends CrudRepository <DashboardForms, String> {
}
