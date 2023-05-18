package inhaus.inhaus.controller;

import inhaus.inhaus.data.DataDto;
import inhaus.inhaus.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/crawl")
    public List<DataDto> crawlData() {
        try {
            return dataService.crawlData();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
