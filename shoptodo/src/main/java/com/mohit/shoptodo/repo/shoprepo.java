package com.mohit.shoptodo.repo;

import com.mohit.shoptodo.model.shopitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface shoprepo extends JpaRepository<shopitem, Long> {
}
