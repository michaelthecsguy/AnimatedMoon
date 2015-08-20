package com.animatedmoon.service.impl;

import com.animatedmoon.service.GoogleDatastoreService;
import com.google.appengine.api.datastore.*;

/**
 * Created by yangm on 8/19/2015.
 */
public class GoogleDatastoreServiceImpl implements GoogleDatastoreService
{
  private DatastoreService dataSource;

  public DatastoreService getDataSource()
  {
    return this.dataSource;
  }

  public void put(Entity entity)
  {
    dataSource.put(entity);
  }

  public PreparedQuery prepare(Query query)
  {
    return this.dataSource.prepare(query);
  }

  public void delete(Key... keys) //keys could be many
  {
    this.dataSource.delete(keys);
  }

  public void setDataSource(DatastoreService dataSource)
  {
    this.dataSource = dataSource;
  }
}
