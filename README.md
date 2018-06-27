# TechWhen

TechWhen is a thing, what is it? We don't know yet, but it is a thing.

## What's required

* JDK (version 8 or later) for (batect)[https://github.com/charleskorn/batect]
* Docker

## Usage

### Building the application

`./batect build`

### Running the tests

`./batect test`

Or, to run the tests once and then automatically re-run them when the code changes:

`./batect continuousTest`

### Deploy to AWS

1. Export AWS credentials
2. Run the deploy task

```bash
export AWS_ACCESS_KEY_ID=<AWS_ACCESS_KEY_ID>
export AWS_SECRET_ACCESS_KEY=<AWS_SECRET_ACCESS_KEY>
./batect deploy
```
