SUMMARY = "C++ implementation of a fast and memory efficient HAT-trie"
DESCRIPTION = "The trie implementation is based on the paper 'HAT-trie: A Cache-conscious Trie-based Data Structure for Strings' (Askitis Nikolas and Sinha Ranjan, 2007)."
HOMEPAGE = "https://github.com/Tessil/hat-trie"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/masterjedy/hat-trie.git;branch=master"
SRCREV = "${AUTOREV}"

inherit cmake

S = "${WORKDIR}/git"
