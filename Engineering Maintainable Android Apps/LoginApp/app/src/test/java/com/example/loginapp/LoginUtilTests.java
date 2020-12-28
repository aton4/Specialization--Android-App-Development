package com.example.loginapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUtilTests {
    @Test
    public void passwordLengthLessThan8()
    {
        assertEquals("The provided password is too short", LoginUtils.isValidPassword("bad"));
    }

    @Test
    public void passwordAllSpaces()
    {
        assertEquals("The provided password is invalid", LoginUtils.isValidPassword("                 "));
    }

    @Test
    public void passwordOneCharRestAreSpaces()
    {
        assertEquals(null, LoginUtils.isValidPassword("   a              "));
    }

    @Test
    public void passwordIsNormalAndValid()
    {
        assertEquals(null, LoginUtils.isValidPassword("random213password@313#2&23"));
    }
}