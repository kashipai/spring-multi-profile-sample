package kp.db.cb.dao;

import kp.db.cb.model.Billionaire;
import kp.db.cb.repository.BillionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BillionaireDAO {
    @Autowired
    BillionaireRepository repository;


    public List<Billionaire> getAll() {
        List<Billionaire> response = new ArrayList<>();
        Iterable<Billionaire> dbResponse = this.repository.findAll();
        for (Billionaire billionaire : dbResponse) {
            response.add(billionaire);
        }
        return response;
    }
}
