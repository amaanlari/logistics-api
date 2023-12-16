package in.net.liveasy.logisticsapi.services;

import in.net.liveasy.logisticsapi.models.Load;

import java.util.List;
import java.util.Optional;

public interface LoadService {

    List<Load> getLoads();

    Load addLoad(Load load);

    List<Load> getLoadsByShipperId(String shipperId);

    Optional<Load> getLoadByLoadId(long loadId);

    Load updateLoad(long loadId, Load load);

    void deleteLoad(long loadId);
}
