package com.credwise.task.Details.Controller;
import com.credwise.task.Details.Service.DetailsService;
import com.credwise.task.Details.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/details")
public class DetailsController {
    @Autowired
    private final DetailsService detailsService;

    public DetailsController(DetailsService detailsService){
        this.detailsService = detailsService;
    }
    @PostMapping("/addDetails")
    public ResponseEntity addDetails(@RequestBody final List<Details> details){
        detailsService.addDetails((Details) details);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @PutMapping("/updateDetails")
    public ResponseEntity updateDetails(@RequestBody Details details){
        detailsService.updateDetails(details);
        return ResponseEntity.status(HttpStatus.OK).build();

    }
    @GetMapping("/getallDetails/")
    public ResponseEntity<List<Details>> getallDetails(){
        return ResponseEntity.ok(detailsService.getallDetails());
    }
    @GetMapping("/{Id}")
    public ResponseEntity<Details> getDetailsbyId(@PathVariable String Id){
        return ResponseEntity.ok(detailsService.getDetailsbyId(Id));
    }
    @DeleteMapping("/deleteDetails/{id}")
    public ResponseEntity deleteDetails(@PathVariable String id){
        detailsService.deleteDetails(id );
        return ResponseEntity.noContent().build();
    }

}
