package org.example.spring_redis.Repository;

import org.example.spring_redis.Model.DashboardForms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardAppRepository extends CrudRepository<DashboardForms, String> {

}
