
SUMMARY = "smbus2 is a drop-in replacement for smbus-cffi/smbus-python in pure Python"
HOMEPAGE = "https://github.com/kplindegaard/smbus2"
AUTHOR = "Karl-Petter Lindegaard <kp.lindegaard@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a3eca2de44816126b3c6f33811a9fba"

SRC_URI = "https://files.pythonhosted.org/packages/d9/33/787448c69603eec96af07d36f7ae3a7e3fce4020632eddb55152dc903233/smbus2-0.4.1.tar.gz"
SRC_URI[md5sum] = "ea4bba25b43863aecd6ec33b2252fdae"
SRC_URI[sha256sum] = "6276eb599b76c4e74372f2582d2282f03b4398f0da16bc996608e4f21557ca9b"

S = "${WORKDIR}/smbus2-0.4.1"

RDEPENDS_${PN} = ""

inherit setuptools3
