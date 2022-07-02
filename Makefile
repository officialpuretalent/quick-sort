# Execute all commands in one line.
all: compile verify run_test execute

# Compiles the code with maven compile command.
compile:
	mvn compile

# Verifies if all dependencies are installed.
verify:
	mvn verify

# Run the tests
run_test:
	mvn test

execute:
	mvn exec:java
