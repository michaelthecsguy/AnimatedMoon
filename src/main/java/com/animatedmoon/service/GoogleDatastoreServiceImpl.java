package com.animatedmoon.service;

import com.google.appengine.api.datastore.DatastoreService;

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

  public void setDataSource(DatastoreService dataSource)
  {
    this.dataSource = dataSource;
  }
}
