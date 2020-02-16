SUMMARY = "Header-only C++11 library to encode/decode base64, base64url, base32, base32hex and base16"
DESCRIPTION = "Header-only C++11 library to encode/decode base64, base64url, base32, base32hex and hex (a.k.a. base16) as specified in RFC 4648, plus Crockford's base32."
HOMEPAGE = "https://github.com/tplgy/cppcodec"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0456e7564890325951234b07c0cf764"

SRC_URI = "git://github.com/hunter-packages/cppcodec.git;branch=hunter-${PV}"
SRCREV = "${AUTOREV}"

inherit cmake

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DBUILD_TESTING=OFF \
"

FILES_${PN} += " \
  ${prefix}/pkgconfig \
"
