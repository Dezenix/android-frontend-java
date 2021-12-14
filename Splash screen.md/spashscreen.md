# **What is `Splash Screen` in Android?**

Android Splash Screen is the first screen visible to the user when the application’s launched. 

# **What is the `use` of Splash Screen in a Application?**

It is used to display some information about the company logo, company name, etc. We can also add some animations to the Splash 
screen as well.Splash Screen is the user’s first experience with the application that’s why it is considered to be one of the most 
vital screens in the application.


## <hr> **How to `Create` an Animated Splash Screen in Android?** </hr>

## <hr> Step 1 </hr> 
Create a `New` Project and name it Splash Screen 

## <hr> Step 2 </hr>
Open `res -> layout -> activity_main.xml (or) main.xml` and add given  below code:

> XML Code:
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="abhiandroid.com.splashscreen.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World by AbhiAndroid!"
        android:textSize="20sp"
        android:layout_centerInParent="true"/>
</RelativeLayout>
```

## <hr> Step 3 </hr> 
Create a new XML file `splashfile.xml` for Splash screen and paste the following code in it.

This layout contains your app logo or other product logo that you want to show on splash screen

> XML Code:
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:gravity="center"
android:background="@color/splashBackground">

<ImageView
    android:id="@+id/logo_id"
    android:layout_width="250dp"
    android:layout_height="250dp"
    android:layout_centerInParent="true"
    android:src="@drawable/abhiandroid"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/logo_id"
        android:layout_centerHorizontal="true"
        android:text="Splash Screen"
        android:textSize="30dp"
        android:textColor="@color/blue"/>

</RelativeLayout>
```

## <hr> Step 4 </hr>
 Now open `app -> java -> package -> MainActivity.java` and add the below code.

> JAVA Code:
```java
package anmolandroid.com.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
```
## <hr>  Step 5</hr> 
For Splash Screen we will create a `separate` splash activity. Create a new class in your `java package` and name it as `SplashActivity.java.`

## <hr>  Step 6 </hr> 
Add below code in `SplashActivity.java activity`. In this code handler is used to hold the screen for specific time and once the handler is out, our main Activity will be launched. 

We are going to hold the Splash screen for three second’s. We will define the seconds in millisecond’s after Post Delayed(){} method.

1 second =1000 milliseconds.

Post Delayed method will delay the time for 3 seconds. After the delay time is complete, then your main activity will be launched.

## *SplashActivity.java* 

> JAVA Code:
```java
package abhiandroid.com.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashfile);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
```
## <hr> Step 7</hr> 
Open AndroidManifest.xml file and make your splashactivity.java class as Launcher activity and mention the Main Activity as another activity.

## *AndroidManifest.xml*

> XML Code:
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
package="abhiandroid.com.splashscreen">

<application
    android:allowBackup="true"
    android:icon="@drawable/abhiandroid"
    android:label="@string/app_name"
    android:supportsRtl="true"
    android:theme="@style/AppTheme">
    <activity android:name="abhiandroid.com.splashscreen.SplashActivity">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />

            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity>
    <activity android:name="abhiandroid.com.splashscreen.MainActivity"/>
</application>

</manifest>
```

## *Output*

Now run the App and you will see `Splash screen`

![tyt](https://abhiandroid.com/programming/wp-content/uploads/2017/10/Splash-Screen-Example-2-In-Android-Studio.gif)





