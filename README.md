# TARDIS experiments

## About

This repository contains some experiments that demonstrate the use of TARDIS. 

## Checking out the project

This repository contains an Eclipse project that is configured to work together with the Eclipse projects for [TARDIS](https://github.com/pietrobraione/tardis). Install TARDIS in an empty Eclipse workspace by following the instructions in the README file in the TARDIS repository. Then, import this repository in the same workspace: On the Eclipse main menu select File > Import..., in the dialog that pops up select Projects from Git, insert the URI of this repository, and when asked for a wizard for importing projects answer Import Existing Eclipse Projects.

## Fixing the paths

Before launching the experiments you must set a few configuration variables to reflect the paths where you installed the code. Under the `tardis-src` source folder you find the class `common.Settings`. Open it and edit the definitions of the `TARDIS_WORKSPACE`, `EXPERIMENTS_WORKSPACE`. `Z3_PATH`, and `JAVA8_HOME` variables to reflect the paths on your system where the tardis project, the tardis-experiment project, the binary of the Z3 SMT solver, and the home of a Java 8 JDK are installed.

## Launching the experiments

The `tardis-src` source directory contains the launcher and the configurator classes for the experiments. The formers all have name `Run<experiment name>.java`: Just run them. The latters all have name `<experiment name>Configurator.java`
