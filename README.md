# Gallery App

## Introduction

This project will have you build a gallery app which will display drawable resources in an activity view and use the tools discussed in this module to improve the look and feel of the app.

## Objectives

- [x] work with Android's resource system
- [x] understand Android image requirements
- [x] use Android Studio asset tools
- [x] apply styles and themes
- [x] understand accessibility options

## Instructions

> Remember to build, run, and test your app at least at the end of each section below

### Create an Android Studio Project

1. Create a new Android Studio project
2. Name the project "Gallery App"
3. Make sure that the target API level is below that of your testing environment.

### Build Image Layout Structure

1. Open `activity_main.xml`
2. Replace the `ConstraintLayout` with a `ScrollView`
3. Give the `ScrollView` a `LinearLayout`
   1. Set the width to `match_parent` and the height to `wrap_content`
   2. Set the orientation to horizontal
4. Give that `LinearLayout` two other `LinearLayout` children
   1. Set the ids to something descriptive (something like left_column and right_column)
5. Create a new style in `res\values\styles.xml` with the name of `VerticalColumn`
6. Provide values for the following items
   1. Set the `android:layout_width` to 0dp and the `android:layout_height` to `wrap_content`
   2. Set `android:layout_weight` to 1
   3. Set `android:orientation` to vertical
7. Go back to your layout and apply this new style to both of the `LinearLayout`s you just created using the `style` attribute.

> Remember, the `style` attribute doesn't begin with `android:`

### Add Images in XML

1. Download the zip archive of images from the repo and copy them into your drawable directory using your computer's file explorer app

> `\app\src\main\res\drawable`

2. Add one `ImageView` for each column
3. Add a value to the src to point to one of your drawables
4. Apply the following attributes and play with them and others to get something you like the look of
   1. Set the width to `match_parent` and the height to `wrap_content`
   2. Set the id to something descriptive (this could be focused on the location of the layout item)
   3. Add padding to give the view a good feel

> Notice the blue boundaries for the imageview are much larger than the image itself

4. Add the attribute `adjustViewBounds` and set the value to true.
5. Once you have something you like. Pull those attributes out into a new style in styles.xml and then apply that style as done before

### Add Images Programmatically

1. Open `MainActivity.kt`
2. Start in the `onCreate` method
3. Create an array of new `ImageView` objects

> Set the size of the array to be the number of drawables you have left to use

4. Step through that list and manually assign drawables to each object in your array.

> Your code may look something like this `views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))`

5. Now we'll apply our style. Unfortunately, you can't apply a style to a view programmatically. Copy the `ImageView` style from `styles.xml`and paste it into `MainActivity.kt` as a comment. We'll use this as a reference.

> To apply this style, we have to apply each of the attributes manually.

6. To apply the height and width, we'll need to create a `LayoutParams` object and pass in constants to represent `match_parent` and `wrap_content` as constructor parameters.

> That line will look like this `val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)`
> We use `LinearLayout.LayoutParams` because the parent is a `LinearLayout`

7. Create an indexed `forEach` loop  to step through the Views array.
   1. Access the entry's `layoutParams` property and assign it the value of the `layoutParams` object you created before the loop.
   2. Access the entry's `adjuistViewBounds` property and assign it the value `true`.
   3. Call the entry's `setPadding` method and pass in the values for the padding on each side: left, top, right, bottom.
   4. Finally, decide which column each entry should go on. This can be done with any of a number of simple logic techniques using the index.
   5. Whichever you decide, call the parent view's `addView` method and pass in the entry that you are currenty working on.

### Create your own App Theme

1. Navigate to a theme generation side like https://coolors.co and generate a 3 color theme that you like. It should have a primary color, a dark version of that color and an accent color.
2. Open `res\values\colors.xml`, replace the hexadecimal values for the colors there with the colors for your new theme.

> You may add additional colors if you'd like, but the 3 colors there, colorPrimary, colorPrimaryDark, and colorAccent are the only ones that will automatically be used.

3. Open `styles.xml` and find the style titled "AppTheme"
4. Use intellisense to select a new parent theme

> Delete the entire string and type "Theme." to see possible options

> `Theme.AppCompat` is a dark theme and `Theme.AppCompat.Light` is a light theme

### Build Your Own App Icon

1. Right click your drawable directory and select New -> Image Asset
2. Make sure "Launcher Icons (Adaptive and Legacy)" is selected from the dropdown at the top.
3. Select the "Foreground Layer" tab
4. Select the asset type and asset image you want.
5. Change the color to whatever you want and resize the image to fit
6. Select the "Background Layer" tab
7. Select the color or image that you want to be the background
8. Click "Next" and review the images
9. Click "Finish"

> If you didn't change the icon name, it will automatically replace the old one. If you did, you'll need to go into the `AndroidManifest.xml` file and change the value for the `androd:icon` attribute to point to your new icon instead of the old one

10. Open the file `res\drawable\ic_launcher_foreground\ic_launcher_foreground.xml` look through the xml to get a feel for how this data is stored.

### Accessibility

1. Go back to `activity_main.xml`
2. Add a `contentDescription` attribute to each of the `ImageView` views. Give them each a description of what the image is
3. You'll notice the warning "Hardcoded string..." put your cursor inside of the highlighted text and push Alt+Enter (Option+Enter on MacOS) and select "Extract String Resource". Fill in the popup window and click "OK"
4. Go to `MainActivity.kt` after assigning images to each of the views, access the `contentDescription` property and assign it a description like you did in the xml.
5. Put your cursor into each of the new strings and press Alt+Enter (Option+Enter on MacOS) and select "Extract String Resource"
6. Open `res\values\strings.xml` and see all the string you've added.
7. Right click the `strings.xml` file in the sidebar and click "Open Translations Editor"
8. In the translations editor, click the globe icon in the top left and select another language
9. Translate all strings into that language.... just kidding, but understand how and where those translations would be added.
