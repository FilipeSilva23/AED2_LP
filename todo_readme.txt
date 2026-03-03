Open project folder with IntelliJ

Install and Set JDK 25 (or above):
   Open File > Project Structure
      Project > SDK: openjdk-21 (or higher)
      SDKs > SDKs: openjdk-21 (or higher)

Download and Install Scene Builder (for drawing GUIs) from https://gluonhq.com/products/scene-builder/

Install and Activate JavaFX Plugin and Scene Builder:
   Open IntelliJ Settings/Preferences
      Plugins: install JavaFX
      Languages & Frameworks: JavaFX > set Path to SceneBuilder

Execute Maven Goal to create local Maven repository for algs4 lib:
   Open Maven Window (right side bar - m icon)
        Open Execute Maven Goal (Maven shell) and Paste following line :
            install:install-file -Dfile=libs/algs4-1.0.0.0.jar -DgroupId=edu.princeton.cs -DartifactId=algs4 -Dversion=1.0.0 -Dpackaging=jar

Close the project and re-open it with IntelliJ
