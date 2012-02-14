#!/bin/sh

sbt clean update compile package publish-local
cd ../FoBo-Lift-Template 
sbt clean update ~container:start

