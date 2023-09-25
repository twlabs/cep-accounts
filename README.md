# Introduction

## Core Engineering Practices Accounts exercise

To start, run through the "Getting Started" steps below for either Kotlin or Javascript (whichever you are most comfortable working with).

When everything is installed and you have a failing test, you are ready to pair up and work on the next steps. Fixing the test is part of the workshop, we will go through it together.

_This workshop assumes that you're using a Macbook. Steps will vary for Windows and Linux users._

# Getting Started: Kotlin

First, you will need:

- Java 8 or later
  - `brew install openjdk`
- A Java IDE (like IntelliJ)
  - `brew install --cask intellij-idea-ce`
- gradle (optional, or use ./gradlew)
  - `brew install gradle`

Clone this repository, then use `gradle` to build the project. You should see a single test failure.

```sh
$ cd path/to/cep-accounts/kotlin
kotlin$ ./gradlew test
```

# Getting Started: Javascript

First, you will need:

- Node.js 10 or newer
  - `brew install node`
- A Javascript IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `npm` to build the project. You should see a single test failure.

```sh
$ cd path/to/cep-accounts/javascript
javasript$ npm install
javasript$ npm test
```

# Getting Started: C#

First, you will need:

- dotnet 7 sdk
  - `brew install dotnet`
- A C# IDE (like Visual Studio Code)
  - `brew install --cask visual-studio-code`

Clone this repository, then use `dotnet` to build the project. You should see a single test failure.

```shell
$ cd path/to/cep-accounts/csharp
csharp$ dotnet test
```
