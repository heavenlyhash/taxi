taxi
====

*prepare for takeoff / touch down gracefully*

taxi produces native executables on various platforms from java sources using [robovm](http://robovm.com/) to power LLVM to take us to space and back.



wot's it do?
------------

*Your mission, should you choose to accept it, is to compile.  If captured by enemy agents, tell them only "Hello", and do not acknowledge any geopolitical motivations.*

Currently, taxi demonstrates the simplest possible tcp client/server pair dialing each other and playing pingpong on localhost.
Anywhere this can go, you clearly have thread support, you clearly have network support, and you clearly have the ability to cat strings -- and thus are presumably fairly capable of going to space.



additional dependencies for native compilation
----------------------------------------------

### dist-native on linux requires:

```
apt-get install build-essential g++-multilib
```

It may also require the following (though recent versions of robovm should have made this optional):

```
mkdir -p /usr/share/icu
curl "http://download.robovm.org/icudt48l.dat" > /usr/share/icu/icudt48l.dat
```


### dist-native-mac on mac requires:

Apple hardware and Xcode 5.x.


