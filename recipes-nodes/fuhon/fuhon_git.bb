SUMMARY = "C++17 implementation of Filecoin"
DESCRIPTION = "Fuhon is an implementation of the Filecoin protocol being developed in C++."
HOMEPAGE = "https://filecoin.io"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/eigendude/cpp-filecoin.git;branch=openembedded"
SRCREV = "${AUTOREV}"

inherit cmake

DEPENDS = " \
    boost \
    boost-di \
    cppcodec \
    leveldb \
    libp2p \
    openssl \
    protobuf \
    protobuf-native \
    spdlog \
    tinycbor \
"

# Rust dependencies
DEPENDS += " \
    cargo-native \
    rust-cross-${TARGET_ARCH} \
    rust-native \
"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DHUNTER_ENABLED=OFF \
    -DBUILD_INTERNAL_DEPS=OFF \
    -DTESTING=OFF \
    -DCMAKE_CXX_STANDARD=17 \
    -DCMAKE_CXX_STANDARD_REQUIRED=ON \
    -DCMAKE_CXX_EXTENSIONS=OFF \
"

# TODO
ALLOW_EMPTY_${PN} = "1"
