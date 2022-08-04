# 1.8.9ForgeTemplate

A fixed and ready to use template for minecraft forge modding on `1.8.9`
with `shadow` plugin integrated including two useful `artifacts`. Tested flawlessly on `IntelliJ IDEA Ultimate 2022.2`

```js
       java   8
     gradle   3.1
     shadow   2.0.4
  minecraft   1.8.9
forgegradle   2.1-SNAPSHOT
```

## Setup
1. Clone this repository.
2. Import `build.gradle` as a project.
3. Let it configure.
4. Run `setupDecompWorkspace` in Gradle: `Tasks > forgegradle > setupDecompWorkspace`
5. Reload gradle project.
> *Check out [#build](#build), [#run](#run) and [#artifacts](#artifacts) for more information.*

## Build
> *Note: If the build ever finishes with an error looking like `duplicate entry`, then run `clean` in Gradle: `Tasks > build > clean`*

&emsp;Run `build` in Gradle: `Tasks > build > build`
> Output .jar will be located in `build/libs/`

## Run
&emsp;Run `genIntellijRuns` in Gradle: `Tasks > forgegradle > genIntellijRuns`
> This will create the run configurations. <br> *Note: you will need to change the classpath module to `.main`*

> You should add `CopyResources` from [#artifacts](#artifacts) as a `Task before launch` and drag it in front of build.

## Artifacts
> *Note: If the artifacts are not detected on setup, you might need to restart your IntelliJ.*

&emsp;I have included two useful artifacts that I always use when developing mods:
- `CopyMod` copies the mod from your [#build](#build) folder into your `%appdata%/.minecraft/mods`
- `CopyResources` copies the resources folder to your `build/classes/main` so they are accessible in the development environment
