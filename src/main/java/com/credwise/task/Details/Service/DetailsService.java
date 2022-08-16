package com.credwise.task.Details.Service;

import com.credwise.task.Details.Repository.DetailsRepository;
import com.credwise.task.Details.model.Details;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DetailsService {
    private final DetailsRepository detailsRepository;



    public void addDetails(Details details){
        detailsRepository.insert(details);
    }
    public void updateDetails(Details details){
        Details savedDetails = detailsRepository.findById(details.getId())
                .orElseThrow(()-> new RuntimeException(
                        String.format("Cannot Find Details by ID %s", details.getId())));
        savedDetails.setName(details.getName());
        savedDetails.setAge(details.getAge());


        detailsRepository.save(details);
    }
    public Details getDetailsbyId(String Id){
        return detailsRepository.findById(Id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Details by Id %s", Id)));

    }
    public List<Details> getallDetails(){
        return detailsRepository.findAll();
    }
    public void deleteDetails(String Id){
        detailsRepository.deleteById(Id);
    }
}
