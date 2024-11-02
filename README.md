# react-native-build-plugin

This repository is an example of how to create and ship Gradle Plugin for React Native. The Gradle Plugin uses Kotlin and ships via NPM, no need to publish artifact to Maven Repository or others typical places for Java libraries.

I created this example for my own education and to show how to ship pre compiled Gradle Plugins with React Native JS libraries over NPM. I got inspired by the React Native official `@react-native/gradle-plugin` which uses the same structure.

## Repository structure

- `packages/example-build-plugin`: NPM package of an Example React Native Pre-compiled Gradle Plugin
- `packages/react-native-app`: Plain RN App showing how to include the plugin

## Pre-compiled vs Script Plugins

What are the benefits of Pre-compiled vs Script? Most of RN Libraries are using script plugins (`*.gradle` file).

### Benefits of Pre-compiled plugins on NPM (this repo example)

- Easy start with solid structure using `gradle init`
- Sharable code with other libs and plugins
- Suited for medium and large plugins

### Drawbacks of Pre-compiled plugins on NPM (this repo example)

- Complex structure not needed for small plugins
- Plugin Build not automatically included

### Benefits of Script plugins on NPM

- One file for the whole plugin
- Automatic build when using `gradle.kts`

### Drawbacks of Script plugins on NPM

- More involved to setup tests

## Footnote

I named this repo `react-native-build-plugin` as I want to extent the example with recommendations for iOS/Xcode Build Phases.
