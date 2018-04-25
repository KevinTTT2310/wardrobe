package com.example.wardrobe.controller;

import com.example.wardrobe.model.Wardrobe;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/wardrobe")
public class WardrobeController {

    private Wardrobe wardrobe = new Wardrobe();

    // http:/localhost:8080/api/register/myname/myage <register new guest
    @PostMapping("/add")
    public void createWardrobe(Wardrobe wardrobe){
        System.out.println(wardrobe);
    }

    @GetMapping("/open")
    public String open(){
        if(wardrobe.isOpen() == false){
            wardrobe.setOpen(true);
            wardrobe.setStatus("Door is Open");
            return wardrobe.getStatus();
        }else{
            wardrobe.setStatus("Door is already open");
            return wardrobe.getStatus();
        }
    }

    @GetMapping("/close")
    public String close(){
        if(wardrobe.isOpen() == true){
            wardrobe.setOpen(false);
            wardrobe.setStatus("Door is closed");
            return wardrobe.getStatus();
        }else{
            wardrobe.setStatus("Door is already closed");
            return wardrobe.getStatus();
        }
    }

    @GetMapping("/getIn")
    public String getIn(){
        if(!wardrobe.isInside() && wardrobe.isOpen()){
            return("Welcome in Narnia");
        }else{
            return("No Entry! Open the door first.");
        }
    }

    @GetMapping("/getOut")
    public String getOut(){
        if(wardrobe.isInside() && wardrobe.isOpen()){
            return("You shall not pass!!! Open door first");
        }else{
            return("You have successfully escaped Narnia. Welcome in London!");
        }

    }


    public boolean isOpen(){
        if(wardrobe.isOpen() == true){
            return true;
        }else{
            return false;
        }
    }

    public boolean isBroken(){
        if(wardrobe.isBroken() == true){
            return true;
        }else{
            return false;
        }
    }

}
