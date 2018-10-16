package org.avantica.course.class001;

import java.util.Date;

/**
 * NAMING CONFLICTS AND CODE FORMATTING
 * ========================================================
 * - Classes from default packages can not be imported.
 */
public class NamingConflicts {

    public static void main(String[] args) {
        Date yesterday;
        java.sql.Date today;
    }
}
