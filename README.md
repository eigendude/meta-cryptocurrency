meta-cryptocurrency
==============

This is a Yocto/OpenEmbedded meta-layer for cryptocurrency related packages. Such as cgminer, cpuminer and more! This creates an all in one crypto Yocto distro for any dvice.

#### Table of contents

* [Miners](#algorithms)
* [Wallets](#dependencies)
* [Download](#download)
* [Build](#build)
* [Usage instructions](#usage-instructions)
* [Donations](#donations)
* [License](#license)

Miners
==========
#### Currently supported
 * ✓ __cgminer__ (AntMiner, Avalon, ...) [cgminer](https://github.com/ckolivas/cgminer)
 * ✓ __cgminer-gekko:__ For the GekkoScience Compac and 2Pac sticks [Gekko fork](https://github.com/vthoang/cgminer.git)
 * ✓ __cpuminer-multi:__ CPU related mining for various algo's [github](https://github.com/tpruvot/cpuminer-multi)

#### Planned support for
 * ethminer
 * hodlminer
 * ccminer
 * CryptoNote miner


Wallets
==========
#### Planned support for
 * BitCoin
 * Ethereum
 * RaiBlocks
 * Stellar Lumen
 * Ripple


Download
========
Planning to make pre-build releases for RPIs soon. First need to get the distro right.

Build
=====

#### Basic Yocto build instructions for RPI

Clone this repo and the following dependencies:
 * [Meta-openembedded](https://github.com/openembedded/meta-openembedded)
 * [Poky](https://git.yoctoproject.org/cgit/cgit.cgi/poky/)
 * [Meta-raspberrypi](https://github.com/agherzan/meta-raspberrypi/) If you're building for RPI, add your BSP of choice here

Initiate OE by invoking the oe init script:

`$ source poky/oe-init-build-env rpi-ml-build`

Add bb layers:

```
$ bitbake-layers add-layer ../meta-openembedded/meta-oe
$ bitbake-layers add-layer ../meta-openembedded/meta-python
$ bitbake-layers add-layer ../meta-openembedded/meta-multimedia
$ bitbake-layers add-layer ../meta-openembedded/meta-networking
$ bitbake-layers add-layer ../meta-raspberrypi
$ bitbake-layers add-layer ../meta-cryptocurrency
```

Edit `conf/local.conf` and set the target machine:
`MACHINE = "raspberrypi3"`

*OR* To the target machine you're looking to build.

Build the image with
```
bitbake miner-image
```

Or if you're looking to build a wifi image (e.g. RPI3/RPI0 w/ WIFI):
```
bitbake miner-wifi-image
```

*Note* you can set SSID = <ssid> and PSK = <psd> in your `conf\local.conf`


Usage instructions
==================

To flash the sdimg on the sd card:

`$ sudo dd if=tmp/deploy/images/raspberrypi3/miner-image-raspberrypi3.rpi-sdimg of=/dev/sdX`

Boot your RPI.

See individual miner/wallet website for instructions on how to use the individual packages.

Donations
=========
Donations for the work done are accepted :

* BTC: `19deCCSk5LG5jv6E3tYkoF8EZYp2eJo5vk`

License
=======
GPLv2.  See COPYING for details.
