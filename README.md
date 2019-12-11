# Titanium Android - Image Cropping module
A robust image cropping module based on [Android-Image-Cropper by ArthurHub](https://github.com/ArthurHub/Android-Image-Cropper) library.

* Fully customizable with tons of options. [Read More Here](https://github.com/ArthurHub/Android-Image-Cropper/wiki)
* Capture image from camera, or pick from gallery, or Google Drive or other compatible apps & crop them instantly.
* Rotate & flip image at run-time.
* Provides a convenient & faster way to save cropped images with appropriate compression.

| Image Picker UI             |  Crop Window UI |
|:-------------------------:|:-------------------------:|
|  ![](https://github.com/prashantsaini1/android-titanium-imagecropper/blob/master/select_app.png)   |  ![](https://github.com/prashantsaini1/android-titanium-imagecropper/blob/master/sample.png)  |


## Requirements & Installation
* Ti SDK >= 7.0.0.GA
* [Download latest module version from here](https://github.com/prashantsaini1/android-titanium-imagecropper/tree/master/android/dist)
* Unzip it, put it in your Titanium project modules folder & add this lines to your tiapp.xml <modules> node.
* Use version 3.0.0+ for Ti SDK 7.4.0.GA or version 2.0.0 for Ti SDK < 7.4.0.GA

```
<module platform="android">in.prashant.imagecrop</module>

```


# Methods
1. **crop()**
* Presents the crop window screen with options to select / capture images prior cropping.
* If any source image file is passed, then it directly presents the cropping window, else it presents options to pick the image from.
* Camera app, Gallery app, or other compatible apps are shown if no source file is passed.
* Takes following arguments in a single dictionary object. (Only 'callback' method argument is mandatory, rest all are optionals)

| Argument              | Description           | Default Value              |
| --------------------- |:--------------------- | :------------------------- |
|  String **colorPrimaryDark**     | Status bar background color | Same as app theme |
|  String **colorPrimary**      |  Actionbar background color   | Same as app theme |
|  String **backgroundColor**   | Background color of crop-window    | Same as app theme |
|  String **theme**    |  Custom theme defined in XML to over-ride the default app theme. Above arguments will override respective attributes in this theme  | Same as app theme |
|  String **title**              |  Title of the crop window   | No title |
|  String **cropButtonTitle**    | Title of the Crop Menu button   | CROP |
|  String **menuIconsColor**      |  Color for menu-icons of crop window   | app theme |
|  String **overlayBackgroundColor**    | The color of the crop-overlay-area outside of crop window area  | #77000000 |
|  String **borderColor**      |  Border color of cropping window   | #AAFFFFFF |
|  float **borderWidth**     |  Border width of cropping window   | 3 dp |
|  boolean **guidelines**     | Grid-lines to show/hide inside cropping-window   | true |
|  String **guidelinesColor**     | Grid-lines inside cropping-window.     | #AAFFFFFF |
|  float **guidelinesWidth**     | Width of grid-lines   | 1dp |
|  int **aspectX**     | Aspect Ratio value for X or horizontal direction    | free |
|  int **aspectY**     | Aspect Ratio value for Y or vertical direction     | free |
|  boolean **fixAspect**    | Whether to fix aspect ratio or not, if aspect ratio is set, then it behaves as true    | false |
|  String **cornerBorderColor**     | Color of corners inside-around the border of cropping-window    | white |
|  float **cornerBorderWidth**     | Thickness of these corners     | 3dp |
|  float **cornerBorderLength**     | Length of these corners    | 14dp |
|  float **cornerBorderOffset**     | Padding between corner-lines & border of the cropping-window  | 5dp |
|  String **sourceFile**     | Path for image file to start cropping with.   | none |
|  String **destFile**     | Path to save cropped image at.  | Temp Cache file |
|  function **callback**     | Callback method to call upon success/error result. See example  | Mandatory |

```javascript
require('in.prashant.imagecrop').crop({
    callback : function(e) {
      
      // 'e' is an object here with 3 key-values.
      // 1- success = true OR false
      // 2- error = empty string OR error message
      // 3- image = cropped-image path OR empty
      
      if (e.success) {
          $.imageV.image = '';
          $.imageV.image = e.image;
      } else {
          alert(e.error);
      }
    }
});
```



<hr/>

### Changelog

**v1.0.0**
* First stable release.

</br>


<hr/>

## Thanks & Credits
* [Arthur Teplitzki](https://github.com/ArthurHub) for creating awesome Android library.


## LICENSE
    Copyright (c) 2017 by Prashant Saini, 2016 by Arthur Teplitzki, 2013 by Edmodo, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Contributions

If you enjoy this module, feel free to contribute with your PR or [donate](https://paypal.me/prashantsainii) :-)
