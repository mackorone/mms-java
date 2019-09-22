# mms-java

Write a Micromouse maze-solving algorithm in Java.

For use with [mackorone/mms](https://github.com/mackorone/mms), a Micromouse simulator.

## Setup

1. Clone this repository
1. [Download the Micromouse simulator](https://github.com/mackorone/mms#download)
1. Run the simulator and click the "+" button to configure a new algorithm
1. Enter the config for your algorithm (name, directory, build command, and run command)
1. Click the "Run" button

## Examples

Windows:

![](https://github.com/mackorone/mms-java/blob/master/config-windows.png)

Linux (Ubuntu):

![](https://github.com/mackorone/mms-java/blob/master/config-linux.png)


## Notes

- You may need to download and install the [Java SDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- Spaces in file paths are not allowed, you may need to change the default Java install path
- The `javac` command compiles your code and the `java` command runs it
- Communication with the simulator is done via stdin/stdout, use stderr for logging
- Descriptions of all available API methods can be found at [mackorone/mms#mouse-api](https://github.com/mackorone/mms#mouse-api)
- The example code is a simple left wall following algorithm
