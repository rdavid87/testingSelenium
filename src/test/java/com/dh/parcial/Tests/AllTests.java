package com.dh.parcial.Tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestStoreCart.class, TestStoreRegister.class, TestStoreSearch.class })
public class AllTests {

}
