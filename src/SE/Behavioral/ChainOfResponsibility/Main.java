package SE.Behavioral.ChainOfResponsibility;

import SE.Behavioral.ChainOfResponsibility.TypeOfLogger.ConsoleBasedLogger;
import SE.Behavioral.ChainOfResponsibility.TypeOfLogger.DebugBasedLogger;
import SE.Behavioral.ChainOfResponsibility.TypeOfLogger.ErrorBasedLogger;

public class Main {
    private static Logger doChaining(){


          Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);


          Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);


          consoleLogger.setNextLevelLogger(errorLogger);
            
          Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);


          errorLogger.setNextLevelLogger(debugLogger);
            
          return consoleLogger;   
          }  
          public static void main(String args[]){  
          Logger chainLogger= doChaining();
  
              chainLogger.logMessage(Logger.OUTPUTINFO, "OUT");
              chainLogger.logMessage(Logger.ERRORINFO, "ERROR");
              chainLogger.logMessage(Logger.DEBUGINFO, "DEBUG");
              }  
}  