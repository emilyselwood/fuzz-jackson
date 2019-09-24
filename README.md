# Fuzz Jackson

A simple fuzz testing harness for Jackson

## Running

```bash
git clone git@github.com:emilyselwood/fuzz-jackson.git
cd fuzz-jackson
docker build . -t fuzz-jackson
docker run -v corpus:/app/corpus/ -v failed:/app/failed fuzz-jackson:latest
```

There will be a corpus and failed folders in this project. They will contain all the current runs inputs.

See https://github.com/SatelliteApplicationsCatapult/tribble for more information.