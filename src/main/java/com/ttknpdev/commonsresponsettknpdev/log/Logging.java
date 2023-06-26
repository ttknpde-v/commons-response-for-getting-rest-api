package com.ttknpdev.commonsresponsettknpdev.log;

import com.ttknpdev.commonsresponsettknpdev.exception.config.ConfigExceptionHandler;
import org.apache.log4j.Logger;
/* this class for getting my logging */
public class Logging {
      public static final Logger configException = Logger.getLogger(ConfigExceptionHandler.class);
}
