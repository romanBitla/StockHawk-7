package com.altran.android.stockhawk.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;

/**
 * Created by altran on 10/5/15.
 */
@Database(version = QuoteDatabase.VERSION)
public class QuoteDatabase {
  private QuoteDatabase(){}

  public static final int VERSION = 7;

  @Table(QuoteColumns.class) public static final String QUOTES = "quotes";
}
