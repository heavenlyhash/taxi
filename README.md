taxi
====

prepare for takeoff / touch down gracefully



additional dependencies for native compilation
----------------------------------------------

dist-native on linux requires:

```
apt-get install build-essential g++-multilib
```

It may also require the following (though recent versions of robovm should have made this optional):

```
mkdir -p /usr/share/icu
curl "http://download.robovm.org/icudt48l.dat" > /usr/share/icu/icudt48l.dat
```


