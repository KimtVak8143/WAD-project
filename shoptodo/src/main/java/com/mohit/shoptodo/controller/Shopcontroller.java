package com.mohit.shoptodo.controller;

import com.mohit.shoptodo.repo.shoprepo;
import com.mohit.shoptodo.model.shopitem;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/shop")
public class Shopcontroller {

    @Autowired
    private shoprepo shoppingrepo;

    @GetMapping
    public List<shopitem> findAll()
    {   return shoppingrepo.findAll();

    }

    @PostMapping
    public shopitem save(@NotNull @RequestBody shopitem shoppingitem)
    {   return shoppingrepo.save(shoppingitem);

    }

    @PutMapping
    public shopitem update(@NotNull @RequestBody shopitem shoppingitem)
    {
        return shoppingrepo.save(shoppingitem);

    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id)
    {   shoppingrepo.deleteById(id);
    }
}
