(ns app.core)

(def React (js/require "react"))
(def ReactNative (js/require "react-native"))
(def Expo (js/require "expo"))

(def createFactory (aget React "createFactory"))
(def createClass (aget React "createClass"))
(def registerRootComponent (aget Expo "registerRootComponent"))

(def View (createFactory (aget ReactNative "View")))
(def Text (createFactory (aget ReactNative "Text")))

(def container
  #js {
    :flex 1,
    :alignItems "center",
    :justifyContent "center",
    :paddingTop 60,
    :backgroundColor "#ecf0f1",
  })

(def paragraph
  #js {
    :margin 24,
    :fontSize 18,
    :fontWeight "bold",
    :textAlign "center",
    :color "#34495e",
  })

(def content
  "Change code in the editor and watch it change on your phone!
  Save to get a shareable url. You get a new url each time you save.")

(def App (createClass
            #js {:displayName "App"
                 :render (fn []
                           (View. #js {:style container}
                                  (Text. #js {:style paragraph} content)))}))

(registerRootComponent App)
