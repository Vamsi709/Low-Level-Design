The logging framework should support different log levels, such as DEBUG, INFO, WARNING, ERROR, and FATAL.
It should allow logging messages with a timestamp, log level, and message content.
The framework should support multiple output destinations, such as console, file, and database.
It should provide a configuration mechanism to set the log level and output destination.
The logging framework should be thread-safe to handle concurrent logging from multiple threads.
It should be extensible to accommodate new log levels and output destinations in the future.


* for setting different out destinations at run time, Strategy design pattern can be Use

For creation Object of difference destinations:
Factory Design Pattern can be used ,we can object creation from client

There were Different log levels
1. Debug
2. Info
3.Warn
4.Error
5.Fatal
In in an ideal world scenario if we set log level at highest,All log levels below it should also activated