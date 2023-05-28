package inhaus.inhaus.controller;

import inhaus.inhaus.data.Data;
import inhaus.inhaus.service.DataService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Data> crawlData() {


        try {
            return dataService.crawlData();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/crawlandfind")
    public List<Data> getDatasByDate(@RequestParam int year, @RequestParam int month, @RequestParam int day){


        return dataService.getDatasByDate(year, month, day);
    }


}