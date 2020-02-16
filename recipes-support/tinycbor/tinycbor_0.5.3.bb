SUMMARY = "Concise Binary Object Representation (CBOR) Library"
DESCRIPTION = "Lightweight library to handle the CBOR format."
HOMEPAGE = "https://github.com/intel/tinycbor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c1ac30774dd6476b42b5b020cd2aa5f"

SRC_URI = "git://github.com/intel/tinycbor.git;nobranch=1"
SRCREV = "v${PV}"

S = "${WORKDIR}/git"

MAKE_OPTIONS = " \
  prefix=${prefix} \
  BUILD_SHARED=0 \
"

do_compile() {
  oe_runmake ${MAKE_OPTIONS}
}

do_install() {
  oe_runmake ${MAKE_OPTIONS} 'DESTDIR=${D}' install
}
