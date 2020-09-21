/**
 * YGuard -- an obfuscation library for Java(TM) classfiles.
 *
 * Original Copyright (c) 1999 Mark Welsh (markw@retrologic.com)
 * Modifications Copyright (c) 2002 yWorks GmbH (yguard@yworks.com)
 *
 */
package com.yworks.yguard.obf;

/**
 * Interface to a list of method and field names and descriptors -- used for checking
 * if a name/descriptor is reserved through a derived class/interface.
 *
 * @author      Mark Welsh
 */
public interface NameListDown
{
    /** Is the method reserved because of its reservation down the class hierarchy? */
    public String getMethodObfNameDown(Cl caller, String name, String descriptor) throws ClassNotFoundException;
    /** Is the field reserved because of its reservation down the class hierarchy? */
    public String getFieldObfNameDown(Cl caller, String name) throws ClassNotFoundException;
}

