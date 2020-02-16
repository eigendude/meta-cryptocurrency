SUMMARY = "GSL: Guidelines Support Library"
DESCRIPTION = "The Guidelines Support Library (GSL) contains functions and types that are suggested for use by the C++ Core Guidelines maintained by the Standard C++ Foundation. This repo contains Microsoft's implementation of GSL."
HOMEPAGE = "https://github.com/microsoft/GSL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=363055e71e77071107ba2bb9a54bd9a7"

SRC_URI = "git://github.com/microsoft/GSL.git;nobranch=1"
SRCREV = "v${PV}"

inherit cmake

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DGSL_TEST=OFF \
"

# Header-only C++ library, so the main package will be empty
ALLOW_EMPTY_${PN} = "1"
