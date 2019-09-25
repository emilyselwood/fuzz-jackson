# Fuzz Jackson

A simple fuzz testing harness for Jackson

## Running with docker

```bash
git clone git@github.com:emilyselwood/fuzz-jackson.git
cd fuzz-jackson
docker build . -t fuzz-jackson
docker run -v corpus:/app/corpus/ -v failed:/app/failed fuzz-jackson:latest
```

## Running without Docker

This needs a current master build of Tribble (at some point when all this works I'll update the release)
```bash
git clone git@github.com:SatelliteApplicationsCatapult/tribble.git
cd tribble
./gradlew install
cd --
```
Now we can run this tool to actually fuzz test tribble.
```bash
git clone git@github.com:emilyselwood/fuzz-jackson.git
cd fuzz-jackson
./gradlew run "--args=--targetClass org.catapult.sa.fuzz.jackson.FuzzJackson -verbose"
```

There will be a corpus and failed folders in this project. They will contain all the current runs inputs.

See https://github.com/SatelliteApplicationsCatapult/tribble for more information.