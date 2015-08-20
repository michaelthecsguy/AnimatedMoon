package com.animatedmoon.service;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

/**
 * Created by yangm on 8/19/2015.
 */
public interface GoogleDatastoreService
{
  public void put(Entity entity);
  public PreparedQuery prepare(Query query);
  public void delete(Key... keys);
}
