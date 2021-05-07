package nl.lotrac.bv.controller;

import nl.lotrac.bv.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping(value = "/orderlines")



public class OrderLineController {

@Autowired
    private OrderLineService orderLineService;


@GetMapping(value="")
    public ResponseEntity<Object>getLines(){

    return ResponseEntity.ok().body(orderLineService.getLines());
}



}
