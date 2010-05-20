/**
 * $Id$
 * $URL$
 * *************************************************************************
 * Copyright (c) 2002-2009, DuraSpace.  All rights reserved
 * Licensed under the DuraSpace License.
 *
 * A copy of the DuraSpace License has been included in this
 * distribution and is available at: http://scm.dspace.org/svn/repo/licenses/LICENSE.txt
 */
package org.dspace.constants;


/**
 * All core DSpace Services constants.
 * 
 * @author Aaron Zeckoski (azeckoski @ gmail.com)
 */
public class Constants {

    /**
     * If this is set to true then DSpace kernel is run as if it is 
     * inside a unit test.  This means that nothing is persisted (things 
     * are run in-memory only) and caches and other speed optimizing 
     * parts are reduced.  This should NEVER be set true in a production
     * system.
     */
    public static final String DSPACE_TESTING_MODE = "dspace.testing";

    /**
     * This is the name of the timer thread for all DSpace core timers.
     */
    public static final String DSPACE_TIMER_NAME = "DSpaceTimer";

    /**
     * Configuration key for the name of the DBMS being used.
     * HSQLDB, DERBY, ORACLE, MYSQL, POSTGRES, DB2, MSSQL.
     * Note that H2 uses the HSQLDB key.
     */
    public static final String DATABASE_TYPE_KEY = "jdbc.database.type";

    /**
     * Class of the JDBC driver.
     * Embedded drivers are:
     * <ul>
     *  <li>org.h2.Driver</li>
     *  <li>org.apache.derby.jdbc.EmbeddedDriver</li>
     *  <li>org.hsqldb.jdbcDriver</li>
     * </ul>
     * Put your driver in the lib directory for your servlet container.
     */
    public static final String DATABASE_DRIVER_KEY = "jdbc.driver.class";

    /**
     * JDBC database connection URL.
     */
    public static final String DATABASE_CONNECTION_KEY = "jdbc.connection.url";

    /**
     * Database connection user.
     */
    public static final String DATABASE_USERNAME_KEY = "jdbc.username";

    /**
     * Database connection password.
     */
    public static final String DATABASE_PASSWORD_KEY = "jdbc.password";

    /**
     * Set this to true (the default) to enable connection pooling.
     */
    public static final String DATABASE_CONN_POOLING = "jdbc.dataSource.pooling";
    
    /**
     *
     */
    public static final String DEFAULT_ENCODING = "UTF-8";
}
