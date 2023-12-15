package in.net.liveasy.logisticsapi.controllers;

import in.net.liveasy.logisticsapi.models.Load;
import in.net.liveasy.logisticsapi.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoadController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/load")
    public List<Load> getLoads() {
        return this.loadService.getLoads();
    }

    @PostMapping("/load")
    public Load addLoad(@RequestBody Load load) {
        return this.loadService.addLoad(load);
    }
}
