package in.net.liveasy.logisticsapi.services;

import in.net.liveasy.logisticsapi.models.Load;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoadServiceImpl implements LoadService{

    List<Load> loads;

    public LoadServiceImpl() {
        loads = new ArrayList<>();
        loads.add(new Load(1L, "delhi", "jaiput", "chemicals", "canter", 1, 100, "shipper:1123", LocalDate.of(2023, 3, 5)));
    }

    @Override
    public List<Load> getLoads() {
        return loads;
    }

    @Override
    public Load addLoad(Load load) {
        loads.add(load);
        return load;
    }
}
