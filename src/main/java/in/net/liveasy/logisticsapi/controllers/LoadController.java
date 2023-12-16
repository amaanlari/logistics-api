package in.net.liveasy.logisticsapi.controllers;

import in.net.liveasy.logisticsapi.models.Load;
import in.net.liveasy.logisticsapi.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoadController {

    @Autowired
    private LoadService loadService;

    /**
     *
     * @param load - Load object to add new load details.
     * @return - new load object with load details.
     */
    @PostMapping("/load")
    public Load addLoad(@RequestBody Load load) {
        return this.loadService.addLoad(load);
    }

    @GetMapping("/load/all")
    public List<Load> getLoads() {
        return this.loadService.getLoads();
    }

    /**
     *
     * @param shipperId - ID of the Shipper
     * @return - list of loads with the given shipperId.
     */
    @GetMapping("/load")
    public List<Load> getLoadsByShipperId(@RequestParam(value="shipperId") String shipperId) {
        return this.loadService.getLoadsByShipperId(shipperId);
    }

    /**
     *
     * @param loadId - unique id of load
     * @return - load details of load with given loadId.
     */
    @GetMapping("/load/{loadId}")
    public Load getLoadsByLoadId(@PathVariable(value = "loadId") long loadId) {
        Load load = this.loadService.getLoadByLoadId(loadId).get();
        System.out.println("Load By ID \n " + load);
        return load;
    }

    @PutMapping("/load/{loadId}")
    public Load updateLoad(@PathVariable long loadId, @RequestBody Load updatedLoad) throws Exception{
        Load load = loadService.getLoadByLoadId(loadId).get();
        System.out.println(load);
        load.setLoadingPoint(updatedLoad.getLoadingPoint());
        load.setDate(updatedLoad.getDate());
        load.setComment(updatedLoad.getComment());
        load.setProductType(updatedLoad.getProductType());
        load.setWeight(updatedLoad.getWeight());
        load.setShipperId(updatedLoad.getShipperId());
        load.setTruckType(updatedLoad.getTruckType());
        load.setUnloadingPoint(updatedLoad.getUnloadingPoint());
        load.setNoOfTrucks(updatedLoad.getNoOfTrucks());
        return this.loadService.updateLoad(loadId, load);
    }

    @DeleteMapping("/load/{loadId}")
    public void deleteLoad(@PathVariable long loadId) {
        Load deletedLoad = loadService.getLoadByLoadId(loadId).get();
        this.loadService.deleteLoad(loadId);
        System.out.println(deletedLoad);
    }
}
