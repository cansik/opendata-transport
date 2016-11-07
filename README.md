# Open Data Transport Framework [![Build Status](https://travis-ci.org/cansik/open-transport-fetcher.svg?branch=master)](https://travis-ci.org/cansik/open-transport-fetcher) [![codebeat badge](https://codebeat.co/badges/4995db42-2d83-4351-a53b-d1b0c5e23b39)](https://codebeat.co/projects/github-com-cansik-open-transport-fetcher)
The Transport API allows interested developers to build their own applications using public timetable data, whether they're on the web, the desktop or mobile devices. The aim of the API is to cover public transport within Switzerland.

This is an implementation of the Open Data Transport API in Java.

For more information go to the official documentation:

[Open Data Transport API](https://transport.opendata.ch/docs.html)

## Examples
### Create a new open data client
```java
OpenTransportClient client = new OpenTransportClient();
```
**Hint:** *The number of HTTP requests you can send to transport.opendata.ch is limited to 3 requests per second per IP address.*

### Locations by query

```java
String city = "Basel";
LocationResult result = client.getLocations(city, LocationType.All);
```

### Locations by coordinates

```java
double x = 47.5476;
double y = 7.5897;

LocationResult result = client.getLocations(x, y, TransportationType.ICE_TGV_RJ);
```

### Connections

```java
ConnectionResult result = client.getConnections(city1, city2);
```

###  Connections enhanced

```java
String city1 = "Basel SBB";
String city2 = "Zurich";

Date connectionDate = new Date(2016 - 1900, 1, 1, 15, 0, 0);

ConnectionParameter params = new ConnectionParameter(city1, city2);
params.setDateTime(connectionDate);

ConnectionResult result = client.getConnections(params);
```

## About
This framework has been developed by Florian to be used in a school project.

Frameworks:

* [gson](https://github.com/google/gson) by Google
* [unirest](http://unirest.io/java) by Mashape


