SUMMARY = "[Boost].DI: C++14 Dependency Injection Library"
DESCRIPTION = "A C++14 header-only Dependency Injection library with no dependencies."
HOMEPAGE = "https://boost-experimental.github.io/di"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://CMakeLists.txt;beginline=4;endline=4;md5=f280be44cb7c8a8481820829f34094d1"

SRC_URI = "git://github.com/masterjedy/di.git;branch=cpp14"
SRCREV = "${AUTOREV}"

inherit cmake

DEPENDS = " \
    boost \
"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DBOOST_DI_OPT_BUILD_TESTS=OFF \
    -DBOOST_DI_OPT_BUILD_EXAMPLES=OFF \
"

# Header-only C++ library, so the main package will be empty
ALLOW_EMPTY_${PN} = "1"
