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

📫 How to reach me usysstr@gmail.com
<h3 align="left">Connect with me:</h3>
<p align="left">
</p>
<h3 align="left">Languages and Tools:</h3>
<p align="left"> <a href="https://developer.android.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/android/android-original-wordmark.svg" alt="android" width="40" height="40"/> </a> <a href="https://firebase.google.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/firebase/firebase-icon.svg" alt="firebase" width="40" height="40"/> </a> <a href="https://flutter.dev" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/flutterio/flutterio-icon.svg" alt="flutter" width="40" height="40"/> </a> <a href="https://kotlinlang.org" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/kotlinlang/kotlinlang-icon.svg" alt="kotlin" width="40" height="40"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://www.sqlite.org/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/sqlite/sqlite-icon.svg" alt="sqlite" width="40" height="40"/> </a> <a href="https://developer.apple.com/swift/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/swift/swift-original.svg" alt="swift" width="40" height="40"/> </a> </p>

Bu, README dosyanızın tamamını içerir ve DeepLink kullanımınızı anlatan kısmı eklemiştir. İlgili yerleri projenize ve tercihlerinize göre düzenleyebilirsiniz.
