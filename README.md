# Font Awesome Icon Library Android

Make your life easie using [Font Awesome by Dave Gandy](http://fontawesome.io/) instead of create various png´s images. The vector images will remain crisp and clear on all device sizes. 

**Actual version on FontAwesome 4.7**

If some icon that doesn´t found, you´ll need to download the font on FontAwesome site and add a new icons on .xml file. The icons values can be found in [CheatSheet](http://fontawesome.io/cheatsheet/).

## How to use

Clone this project inside the project that you wanna to use. Inside your **build.gradle** file project add:

```
compile project(":folder_cloned")
```

And add on your xml layout

```
<com.igormelo.fontawesomeicon.FontAwesomeIcon
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_marginLeft="10dp"
        android:scaleType="center"
        android:textColor="#000"
        android:textSize="24sp" />
```

And Voilà