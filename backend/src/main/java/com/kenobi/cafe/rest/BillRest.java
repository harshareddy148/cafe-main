package com.kenobi.cafe.rest;

import com.kenobi.cafe.pojo.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/bill")
public interface BillRest {
    @PostMapping("/generateReport")
    public ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap);
    @GetMapping("/getBills")
    public ResponseEntity<List<Bill>> getBills();
    @PostMapping("/getPdf")
    public ResponseEntity<byte[]> getPdf(@RequestBody Map<String, Object> requestMap);
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBill(@PathVariable Integer id);
}
