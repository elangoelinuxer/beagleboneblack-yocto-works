SUMMARY = "Public platform independent Near Field Communication (NFC) library"
DESCRIPTION = "libfreefare is a library which provide a convenient API for MIFARE card manipulations. "
HOMEPAGE = "http://code.google.com/p/nfc-tools/"
BUGTRACKER = "http://code.google.com/p/nfc-tools/issues/list"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b52f2d57d10c4f7ee67a7eb9615d5d24"

SRC_URI = "http://nfc-tools.googlecode.com/files/libfreefare-0.2.2.tar.gz;module=libfreefare-0.2.2;protocol=http"


SRC_URI[md5sum] = "a1541db9e4e99b7c87739e69b27a6342"
SRC_URI[sha256sum] = "a875bd8ac4e6aed53afe5ec34315a8639e03fb4abd3c5fad834686d6d37a53c5"


#SRCREV = "1326"
#PV = "1.7.0+svnr${SRCPV}"
PV = "0.2.2"
PR = "r1"

S = "${WORKDIR}/libfreefare-0.2.2"

inherit autotools pkgconfig
