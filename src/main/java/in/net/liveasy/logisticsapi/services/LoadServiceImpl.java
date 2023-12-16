package in.net.liveasy.logisticsapi.services;

import in.net.liveasy.logisticsapi.dao.LoadDao;
import in.net.liveasy.logisticsapi.models.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService{

    @Autowired
    private LoadDao loadDao;

    List<Load> loads;

    public LoadServiceImpl() {
        loads = new ArrayList<>();
        loads.add(new Load(1L, "delhi", "jaipur", "chemicals", "canter", 1, 100, "shipper1123", LocalDate.of(2023, 3, 5)));
        loads.add(new Load(3L, "delhi", "jaipur", "physicals", "banter", 1, 100, "shipper1123", LocalDate.of(2023, 3, 5)));
        loads.add(new Load(1L, "delhi", "jaipur", "chemicals", "canter", 1, 100, "shipper112", LocalDate.of(2023, 3, 5)));
    }

    @Override
    public List<Load> getLoads() {
        return loadDao.findAll();
    }

    @Override
    public Load addLoad(Load load) {
        loads.add(load);
        return loadDao.save(load);
    }

    @Override
    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadDao.findAllByShipperId(shipperId);
    }

    @Override
    public Optional<Load> getLoadByLoadId(long loadId) {
        return loadDao.findById(loadId);
    }

    @Override
    public Load updateLoad(long loadId, Load load) {
        return loadDao.save(load);
    }

    @Override
    public void deleteLoad(long loadId) {
        loadDao.deleteById(loadId);
    }


}
