#!/bin/bash

npm run build
mkdir -p to_gae
rm -rf to_gae/*
cp app.yaml to_gae/
cp -r dist to_gae/
