# [Transport for London App - TFL REST Api - Coding Challenge](http://api.tfl.gov.uk/Line/Mode/Tube/Status) ![brand](https://github.com/DarsanaBoraian/TFLApp/assets/129121551/f0ce202c-4d30-4294-98c2-52360d7ebc42) 


The Transport for London (TfL) app is a Kotlin-based Android application built with Jetpack Compose. The information is obtained through TFL Restful API, and consumed through Retrofit - for Dependency Injection. This app provides information about live updates on services of London's tube transportation system.

## Table of Contents

1. [Features](features)
2. [Screenshot](screenshot)
3. [Technologies](technologies)
4. [Testing](testing)
5. [Installation](#installation)

## Features
<a name="features"></a>

- **User-Friendly Interface**: Built using Jetpack Compose, the app offers a modern and intuitive user interface.

- **Live Updates**: Get real-time information about London's tube transportation lines - Bakerloo, Central, Circle, District, Hammersmith - city, Jubilee, Metropolitan, Northern, Piccadilly, Victoria and Waterloo-city.

- **Accessibility Features**: Talk-back enabled accessibility feature and  accessibility supported font sizes, used for ease of access of visually challenging users.


## Screenshot
<a name="screenshot"></a>

**Live data screenshot** - showing ‘Good Service’ in all lines, and ‘Minor Delays’ in Jubilee line. Hex Colours corresponding to each line is zipped to display in front of the line displays. 

The Tube name, and corresponding service detail is merged using merge-descendants semantics, for better accessibility.

￼<img width="179" alt="Screenshot 2023-09-06 at 10 51 24" src="https://github.com/DarsanaBoraian/TFLApp/assets/129121551/af43fb3f-bae0-416d-a3b4-865d82086d34">

## Technologies
<a name="technologies"></a>

* Kotlin is used as primary programming language.
* Jetpack Compose is the toolkit used for building the UI.
* MVVM architecture.
* Hilt, Retrofit, OKHttp for Api Calls and DI.

## Testing
<a name="testing"></a>

JUnit4, Mockito and Truth libraries were used for testing.
Unit testing for 
+ Accessibility features
+ getting TFL data

## Installation
<a name="installation"></a>

Follow these steps to install and run the Transport for London app on your Android device or emulator:

**Clone the repository:**

   git clone [https://github.com/yourusername/transport-for-london-app.git](https://github.com/DarsanaBoraian/TFLApp.git)https://github.com/DarsanaBoraian/TFLApp.git
