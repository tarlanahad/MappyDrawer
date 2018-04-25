# MappyDrawer

Mappy drawer is a simple library 

![image](https://github.com/tarlanahad/MappyDrawer/blob/master/asdasd.jpeg)


```
        LatLng origin = new LatLng(40.379570, 49.848762);
        LatLng destination = new LatLng(40.417589, 49.934182);


        new MappyDrawer(mMap)
                .travelMode(TravelMode.TRANSIT)
                .setRoute(new Route(origin, destination).setPathColor(Color.parseColor("#FFFFFF")))
                .draw();
```

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 
 ```
 	dependencies {
	        compile 'com.github.tarlanahad:MappyDrawer:1.0'
	}
 ```
