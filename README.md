# RaindanceMC/wallsroads

- **`wallsroads-module`** — Rain's Flexible Modules — Walls and Roads: Huge polygonal town walls (rectangle or rounded-corner, configurable height/material/thickness) and polygonal roads (configurable width/material) that cut a real gate opening wherever a road crosses a wall — found by geometric intersection, never marked by hand — with renamable signs placed automatically. Every build action has a real inverse: a wall, a road, a gate or a sign can be taken back down exactly as it was before, never assumed to be air.
- **`wallsroads-standalone`** — Rain's Walls and Roads: Rain's Walls and Roads, as a plugin of its own. Nothing here but a build file and a descriptor: the walls-and-roads module and the standard wrapper are shaded together, and that is the whole plugin.

Part of [RaindanceMC](https://github.com/RaindanceMC); built on [RainsCore](https://github.com/RaindanceMC/RainsCore) and the shared parent in [framework](https://github.com/RaindanceMC/framework). Split out of `rains-flexible-modules` on 16.10.2026, history kept.

## Build

```
mvn install
```

Needs Java 25 and read access to `packages.tstieh.de` (server ids `packages-releases` / `packages-snapshots` in `~/.m2/settings.xml`).

## Plugins

- `wallsroads-standalone/target/RainsWallsAndRoads-1.4.0.jar` — also published as `de.raindancer.modules:wallsroads-standalone:1.4.0`

## Versions

A module's version is a property in this repository's root `pom.xml`, a plugin's is `plugin.version` in its own pom. CI publishes every version that is not in the registry yet on the next push to master.
