# Overview

I've been crawling the web high and low to find decent implementations of
Perlin Noise generations in Java or any other language for that matter.

# Usage

## Java

Here is a simple implementation in java of how to construct the PerlinNoise
generator.

```java
int x = 10;
int y = 20;

PerlinNoise p = new PerlinNoise(123, 1, 1, 1, 1);
double height = p.getHeight(x,y);
```

Here is how you can modify the generator. Continue from example above.

```java
// Same parameters as the constructor
p.set(543, 2, 3, 4, 5);

// Or set them individually
p.setAmplitude(3);
p.setOctaves(2);
// set the seed to be OVER 9000!
p.setSeed(9001);
// it can be any value (^_^)
```
