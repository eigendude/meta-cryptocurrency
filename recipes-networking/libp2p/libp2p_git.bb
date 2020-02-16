SUMMARY = "C++17 implementation of libp2p"
DESCRIPTION = "Fully compatible C++17 implementation of the libp2p library."
HOMEPAGE = "https://github.com/soramitsu/libp2p"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/eigendude/libp2p.git;branch=master"
SRCREV = "${AUTOREV}"

inherit cmake

DEPENDS = " \
    boost \
    boost-di \
    hat-trie \
    microsoft-gsl \
    openssl \
    protobuf \
    protobuf-native \
    spdlog \
"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DHUNTER_ENABLED=OFF \
    -DTESTING=OFF \
    -DBUILD_EXAMPLES=OFF \
    -DCMAKE_CXX_STANDARD=17 \
    -DCMAKE_CXX_STANDARD_REQUIRED=ON \
    -DCMAKE_CXX_EXTENSIONS=OFF \
"
