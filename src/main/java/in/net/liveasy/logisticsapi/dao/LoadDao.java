package in.net.liveasy.logisticsapi.dao;

import in.net.liveasy.logisticsapi.models.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadDao extends JpaRepository<Load, Long> {

    List<Load> findAllByShipperId(String shipperId);
}
