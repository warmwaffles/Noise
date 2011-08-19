# Overview
The perlin noise generators offered here are built to be as small and compact as
possible, while being versatile.

# Usage

## Java

### Prime
This is the perlin noise generator that uses prime numbers. It has the lowest
overhead costs. It doesn't use a random number generator. Though the current
implementation only uses two axis.

```java
PerlinNoise p = new PerlinNoise(seed, persistence, frequency, amplitude, octaves);
double height = p.getHeight(x,y);
```

Here is how you can modify the generator. Continue from example above.

```java
// Same parameters as the constructor
p.set(seed, persistence, frequency, amplitude, octaves);

// Or set them individually
p.setAmplitude(3);
p.setOctaves(2);
// set the seed to be OVER 9000!
p.setSeed(9001);
// it can be any value (^_^)
```

### Riven
With [Riven's Implementation](http://riven8192.blogspot.com/2009/08/perlinnoise.html)
I have made it more object oriented.

```java
PerlinNoise p = new PerlinNoise(254);

p.noise(x,y,z);
```

This version sports a couple features such as:

```java
p.smoothNoise(x, y, z, octaves);
p.turbulentNoise(x, y, z, octaves);
p.offset(xOffset, yOffset);
```

### Ken Perlin
This version is Ken Perlin's implementation of Perlin's algorithm...go figure.
