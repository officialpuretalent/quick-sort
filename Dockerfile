# get maven 3.8.6 with openjdk 11
FROM maven:3.8.6-openjdk-11

# update apt-get and install make
RUN apt-get update && apt-get install make

# create app directory
WORKDIR /app

# copy all files in the current directory
COPY . .

# run make command
CMD ["make"]