# lumo-expo

Write React Native projects in ClojureScript. Only dependency needed: `node`.

No need for a MacBook, Java, Android Studio, Xcode, Gradle, Docker and whatnot.

## Caveats

ClojureScript Compilation only works in `:advanced` mode, which takes ages to compile.

There are ways to make optimizations `:none` work which is much faster (see [here](https://github.com/mjmeintjes/boot-react-native)) but that involves patching React Native to help it recognize `goog.require`.

## Usage

```bash
npm i -g lumo-cljs
npm i -g exp
npm install

lumo -c src build.cljs
exp start
```
