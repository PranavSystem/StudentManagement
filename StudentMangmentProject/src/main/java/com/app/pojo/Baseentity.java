package com.app.pojo;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Baseentity 
{
 @Id
private long id;

}
