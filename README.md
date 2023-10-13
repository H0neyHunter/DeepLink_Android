<h1 align="center">Hi 👋, I'm Ümit ÖRS</h1>
<h3 align="center">A passionate frontend developer from Turkey</h3>

<h3 align="center">Using DeepLink</h3>

To enable deep linking in your Android app, add the following code to the `AndroidManifest.xml` file within the `Activity` launcher:

```xml
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

            <!--DeepLink-->
            <intent-filter android:autoVerify="true">
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data
                    android:host="*usyssoft.com"
                    android:scheme="https"
                    android:pathPattern="/data.*"/>
            </intent-filter>
            <!--//DeepLink-->

        </activity>
```

In your MainActivity, retrieve the field1 and field2 values from the deep link with the following code:
```kotlin
val getDeepLink: Uri? = intent.data
b.apply {
    if (getDeepLink != null && Intent.ACTION_VIEW == intent.action) {
        val path: String? = getDeepLink.path
        val field1Value: String? = getDeepLink.getQueryParameter("field1")
        val field2Value: String? = getDeepLink.getQueryParameter("field2")

        if (!path.isNullOrEmpty() && !field1Value.isNullOrEmpty() && !field2Value.isNullOrEmpty()) {
            field1TextView.text = "Field1: $field1Value"
            field2TextView.text = "Field2: $field2Value"
        }
    }
}
```

Make sure to replace field1TextView and field2TextView with the actual TextView identifiers in your layout file.



If you want it to be directed to Google Play, change the Json content below and add it to your site. Recommended: https://www.example.com/.well-known/assetlinks.json or https://example.com/assetlinks.json

package_name : Application package name

sha256_cert_fingerprints : When the application is published, you can take it from your 
Play Console account -> Your Application -> Application signing -> Application signing key certificate -> SHA256 section and paste it to the relevant place, 
or you can use the same path in the Play Console. At the bottom of the Your Application -> Application signing section, 
the Digital Asset Links JSON file data is automatically given.


```json
[
  {
    "relation": [
      "delegate_permission/common.handle_all_urls"
    ],
    "target": {
      "namespace": "android_app",
      "package_name": "com.usyssoft.deeplink",
      "sha256_cert_fingerprints": [
        "DE:A8:5B:5B:86:EB:9A:76:7B:F9:71:77:55:8E:F6:D1:2A:E4:64:99:B7:A7:EB:A1:6C:52:6F:6C:D5:67:DE:59",
        "07:72:9B:5C:8E:98:0E:94:7E:5E:39:B5:02:10:89:CA:7B:3D:8B:BB:7F:DE:E6:AA:88:B1:FF:1A:7F:17:8B:37"
      ]
    }
  }
]

```


- 📫 How to reach me **usysstr@gmail.com**

<h3 align="left">Connect with me:</h3>
<p align="left">
<a href="https://twitter.com/umithoney" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="umithoney" height="30" width="40" /></a>
<a href="https://linkedin.com/in/ümit-ö-486ab1224" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="ümit-ö-486ab1224" height="30" width="40" /></a>
</p>

<h3 align="left">Languages and Tools:</h3>
<p align="left"> <a href="https://developer.android.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/android/android-original-wordmark.svg" alt="android" width="40" height="40"/> </a> <a href="https://www.arduino.cc/" target="_blank" rel="noreferrer"> <img src="https://cdn.worldvectorlogo.com/logos/arduino-1.svg" alt="arduino" width="40" height="40"/> </a> <a href="https://dart.dev" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/dartlang/dartlang-icon.svg" alt="dart" width="40" height="40"/> </a> <a href="https://www.figma.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/figma/figma-icon.svg" alt="figma" width="40" height="40"/> </a> <a href="https://firebase.google.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/firebase/firebase-icon.svg" alt="firebase" width="40" height="40"/> </a> <a href="https://flutter.dev" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/flutterio/flutterio-icon.svg" alt="flutter" width="40" height="40"/> </a> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://kotlinlang.org" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-icon.svg" alt="kotlin" width="40" height="40"/> </a> <a href="https://www.linux.org/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/linux/linux-original.svg" alt="linux" width="40" height="40"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://www.php.net" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/php/php-original.svg" alt="php" width="40" height="40"/> </a> <a href="https://postman.com" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/getpostman/getpostman-icon.svg" alt="postman" width="40" height="40"/> </a> <a href="https://www.sqlite.org/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/sqlite/sqlite-icon.svg" alt="sqlite" width="40" height="40"/> </a> <a href="https://developer.apple.com/swift/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/swift/swift-original.svg" alt="swift" width="40" height="40"/> </a> </p>
