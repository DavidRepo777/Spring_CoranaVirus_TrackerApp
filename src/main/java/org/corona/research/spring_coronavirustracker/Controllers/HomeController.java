package org.corona.research.spring_coronavirustracker.Controllers;

import org.corona.research.spring_coronavirustracker.models.LocationStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.corona.research.spring_coronavirustracker.Services.CoronaVirusDataService;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allstats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allstats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        model.addAttribute("locationstats", allstats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        return "home";
    }
}
