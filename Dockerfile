FROM node:16-alpine
FROM maven:3.6-jdk-11 as maven_build

RUN apk add -U git curl