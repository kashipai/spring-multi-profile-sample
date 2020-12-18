package kp.db.cb.controller;

import kp.db.cb.dao.BillionaireDAO;
import kp.db.cb.model.Billionaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billionaires")
public class BillionaireController {
    @Autowired
    private BillionaireDAO billionaireDao;

    @RequestMapping("/all")
    ResponseEntity<List<Billionaire>> get(){
        return new ResponseEntity<List<Billionaire>>(this.billionaireDao.getAll(), HttpStatus.OK);
    }

}
