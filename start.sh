#!/usr/bin/env bash

docker stop sonnenkoenig
docker rm sonnenkoenig

docker run -d --name sonnenkoenig -p 8181:8080 robertbrem/sonnenkoenig:0.0.1