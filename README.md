# 1.8.9ForgeTemplate
A fixed and ready to use template for minecraft forge modding on `1.8.9`. Using `Java 8`. Tested flawlessly on `IntelliJ IDEA Ultimate 2021.2`

## Setup
1. Clone this repository.
2. Import `build.gradle` as a project.
3. Let it configure.
4. Run `setupDecompWorkspace` in Gradle: `Tasks > forgegradle > setupDecompWorkspace`
5. Reload gradle project.

## Build
&emsp;Run `build` in Gradle: `Tasks > build > build`
> Output jar will be located in `build/libs/`

## Run
&emsp;Run `runClient` in Gradle: `Tasks > forgegradle > runClient`
> A minecraft client will be opened in the developer's environment using the mod