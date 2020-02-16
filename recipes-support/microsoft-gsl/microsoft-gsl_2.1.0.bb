SUMMARY = "GSL: Guidelines Support Library"
DESCRIPTION = "The Guidelines Support Library (GSL) contains functions and types that are suggested for use by the C++ Core Guidelines maintained by the Standard C++ Foundation. This repo contains Microsoft's implementation of GSL."
HOMEPAGE = "https://github.com/microsoft/GSL"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "git://github.com/microsoft/GSL.git;nobranch=1"
SRCREV = "v${PV}"

inherit cmake

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DGSL_TEST=OFF \
"
