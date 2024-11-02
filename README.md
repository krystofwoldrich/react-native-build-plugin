# react-native-build-plugin

This repository is an example of how to create and ship a Gradle Plugin for React Native. The Gradle Plugin is written in Kotlin and is distributed via NPM, so there's no need to publish the artifact to a Maven Repository or other typical Java library locations.

I created this example for my own learning and to demonstrate how to ship Pre-compiled Gradle Plugins with React Native JavaScript libraries via NPM. I was inspired by the React Native official `@react-native/gradle-plugin`, which follows a similar structure.

## Repository structure

- [`packages/example-build-plugin`](https://github.com/krystofwoldrich/react-native-build-plugin/tree/main/packages/example-build-plugin): NPM package of Example React Native Pre-compiled Gradle Plugin
- [`packages/react-native-app`](https://github.com/krystofwoldrich/react-native-build-plugin/tree/main/packages/react-native-app): Plain React Native app demonstrating how to include the plugin

## How to create a new plugin

1. `gradle init` ([commit link](https://github.com/krystofwoldrich/react-native-build-plugin/commit/2816a5a799730fa96628860fc29d483a83adc6f2))
2. Modify the Gradle boilerplate for an NPM package ([commit link](https://github.com/krystofwoldrich/react-native-build-plugin/commit/bfaf2b4222239e4ed98e79d884af0d8e7a05d4b9))
3. Use the plugin in a React Native app ([commit link](https://github.com/krystofwoldrich/react-native-build-plugin/commit/993e9a576a2bee950629e8f3fe4afccc4071c08f))

## Pre-compiled vs Script Plugins

What are the benefits of Pre-compiled vs Script Plugins? Most RN libraries use Script Plugins (`*.gradle` file).

### Benefits of Pre-compiled Plugins on NPM (example in this repo)

- Easy startup with a solid structure using `gradle init`
- Sharable code with other libraries and plugins
- Suitable for medium and large plugins

### Drawbacks of Pre-compiled Plugins on NPM (example in this repo)

- Complex structure unnecessary for small plugins
- Plugin build not automatically included

### Benefits of Script Plugins on NPM

- A single file for the entire plugin
- Automatic build when using `gradle.kts`

### Drawbacks of Script Plugins on NPM

- More complex to set up tests

## Footnote

I named this repository `react-native-build-plugin` because I plan to expand the example with recommendations for iOS/Xcode Build Phases.
