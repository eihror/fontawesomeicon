# Font Awesome Icon Library Android

Make your life easier by using [Font Awesome by Dave Gandy](http://fontawesome.io/) instead of creating various png´s images.
The vector images will remain crisp and clear on all device sizes.

**Latest version on FontAwesome 4.7**

If by some reason an icon isn't found, you´ll have to download the font on FontAwesome website and then add the new icons on .xml file. The icons values can be found in [CheatSheet](http://fontawesome.io/cheatsheet/).

## How to use

Clone this project inside the project that you want to use. Inside your **build.gradle** file project add:

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

<img src="http://igormelo.com/projetos/library_fontawesomeicon/font_awesome_icons.png" />

How to use programmatically

```
FontAwesomeIcon fontAwesomeIcon = (FontAwesomeIcon) findViewById(R.id.fontawesome);
fontAwesomeIcon.setText(R.string.fa_file_text);
fontAwesomeIcon.setTextSize(24);
fontAwesomeIcon.setTextColor(R.color.red);
fontAwesomeIcon.setBackgroundColor(R.color.black);
```