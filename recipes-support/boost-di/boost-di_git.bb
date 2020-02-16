SUMMARY = "[Boost].DI: C++14 Dependency Injection Library"
DESCRIPTION = "A C++14 header-only Dependency Injection library with no dependencies."
HOMEPAGE = "https://boost-experimental.github.io/di"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://CMakeLists.txt;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "git://github.com/masterjedy/di.git;branch=cpp14"
SRCREV = "${AUTOREV}"

inherit cmake

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DBOOST_DI_OPT_BUILD_TESTS=OFF \
    -DBOOST_DI_OPT_BUILD_EXAMPLES=OFF \
"
